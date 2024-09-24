import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class Room {
    private int number;
    private int maxCapacity;
    private int currentOccupancy;
    private boolean isBooked;
    private LocalTime startTime;
    private LocalTime endTime;
    private int duration;
    private Timer bookingTimer;
    private boolean acOn;
    private boolean lightsOn;

    // Observer list
    private List<OccupancyObserver> observers;

    public Room(int number) {
        this.number = number;
        this.maxCapacity = 0;
        this.currentOccupancy = 0;
        this.isBooked = false;
        this.startTime = null;
        this.endTime = null;
        this.duration = 0;
        this.acOn = false;
        this.lightsOn = false;
        this.observers = new ArrayList<>();
    }

    // Add observer
    public void addObserver(OccupancyObserver observer) {
        observers.add(observer);
    }

    // Remove observer
    public void removeObserver(OccupancyObserver observer) {
        observers.remove(observer);
    }

    // Notify observers
    private void notifyObservers() {
        for (OccupancyObserver observer : observers) {
            observer.update(currentOccupancy);
        }
    }

    public void setMaxCapacity(int capacity) {
        if (capacity <= 0) {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
            return;
        }
        this.maxCapacity = capacity;
        System.out.println("Room " + number + " maximum capacity set to " + capacity + ".");
    }

    public void bookRoom(String startTimeStr, int duration) {
        LocalTime newStartTime = parseTime(startTimeStr);
        LocalTime newEndTime = newStartTime.plusMinutes(duration);

        if (isBooked && isTimeConflict(newStartTime, newEndTime)) {
            System.out.println("Room " + number + " is already booked during this time. Cannot book.");
            return;
        }

        isBooked = true;
        this.startTime = newStartTime;
        this.endTime = newEndTime;
        this.duration = duration;
        System.out.println("Room " + number + " booked from " + startTimeStr + " for " + duration + " minutes.");

        bookingTimer = new Timer();
        bookingTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (currentOccupancy == 0) {
                    System.out.println("Room " + number + " is now unoccupied. Booking released. AC and lights off.");
                    isBooked = false;
                    acOn = false;
                    lightsOn = false;
                    startTime = null;
                    endTime = null;
                }
            }
        }, duration * 60 * 1000); // duration in milliseconds
    }

    public void cancelBooking() {
        if (!isBooked) {
            System.out.println("Room " + number + " is not booked. Cannot cancel booking.");
            return;
        }
        isBooked = false;
        System.out.println("Booking for Room " + number + " cancelled successfully.");
        if (bookingTimer != null) {
            bookingTimer.cancel();
        }
        startTime = null;
        endTime = null;
    }

    public void setOccupancy(int occupancy) {
        if (occupancy < 0) {
            System.out.println("Invalid occupancy number.");
            return;
        }
        if (occupancy == 0) {
            currentOccupancy = 0;
            System.out.println("Room " + number + " is now unoccupied. AC and lights turned off.");
            acOn = false;
            lightsOn = false;
            notifyObservers();  // Notify observers
        } else if (occupancy < 2) {
            System.out.println("Room " + number + " occupancy insufficient to mark as occupied.");
        } else if (occupancy > maxCapacity) {
            System.out.println("Cannot add " + occupancy + " occupants. Room " + number + " has a maximum capacity of " + maxCapacity + ".");
        } else {
            currentOccupancy = occupancy;
            System.out.println("Room " + number + " is now occupied by " + occupancy + " persons. AC and lights turned on.");
            acOn = true;
            lightsOn = true;
            notifyObservers();  // Notify observers
        }
    }

    private LocalTime parseTime(String timeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(timeStr, formatter);
    }

    private boolean isTimeConflict(LocalTime newStartTime, LocalTime newEndTime) {
        return (newStartTime.isBefore(this.endTime) && newEndTime.isAfter(this.startTime));
    }
    
    public void printStatus() {
        // Case 1: Room is occupied and booked
        if (isBooked && currentOccupancy > 0 && acOn && lightsOn) {
            System.out.println("Room " + number + " is occupied and booked. AC and lights on.");
        }
        // Case 2: Room is booked but not occupied
        else if (isBooked && currentOccupancy == 0 && !acOn && !lightsOn) {
            System.out.println("Room " + number + " is booked but not occupied. AC and lights off.");
        }
        // Case 3: Room is unoccupied for more than 5 minutes, booking released
        else if (!isBooked && currentOccupancy == 0 && !acOn && !lightsOn) {
            System.out.println("Room " + number + " is now unoccupied. Booking released. AC and lights off.");
        }
        // Default: Show detailed status
        else {
            System.out.println("Room " + number + " status:");
            System.out.println("  Max Capacity: " + maxCapacity);
            System.out.println("  Booked: " + (isBooked ? "Yes" : "No"));
            System.out.println("  Current Occupancy: " + currentOccupancy);
            System.out.println("  AC: " + (acOn ? "On" : "Off"));
            System.out.println("  Lights: " + (lightsOn ? "On" : "Off"));
            if (isBooked) {
                System.out.println("  Last Booking from " + startTime + " for " + duration + " minutes.");
            }
        }
    }
    
}

