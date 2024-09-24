public class OccupancySensor implements OccupancyObserver {
    @Override
    public void update(int occupancy) {
        if (occupancy == 0) {
            System.out.println("Occupancy sensor: Room is unoccupied. Turning off AC and lights.");
        } else {
            System.out.println("Occupancy sensor: Room is occupied. Turning on AC and lights.");
        }
    }
}
