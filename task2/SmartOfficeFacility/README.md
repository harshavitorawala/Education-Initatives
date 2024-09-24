# Smart Office Facility - Console-Based Application

## Problem Statement
This application is designed to manage a smart office facility, handling tasks like conference room bookings, occupancy detection, and automating air conditioning and lighting based on room occupancy. The solution is built with best coding practices and design patterns to ensure efficiency, scalability, and maintainability.

---

## Functional Requirements

### 1. Mandatory Features:
- **Office Configuration:**
  Users can configure the office by specifying the number of conference rooms.
- **Room Booking and Cancellation:**
  Users can book and cancel conference room reservations.
- **Occupancy Detection:**
  Sensors will detect occupancy when at least two people enter a room.
- **Automatic Room Release:**
  Rooms that are not occupied within 5 minutes of booking will be automatically released.
- **Automation of AC and Lighting:**
  Air conditioning and lights will turn off when a room is detected as unoccupied.

### 2. Optional Features:
- **Room Usage Statistics:**
  A summary of room usage statistics can be provided.
- **User Authentication:**
  Implement authentication to restrict booking and configuration access.
- **Notifications:**
  Notify users via email/SMS when their booked room is released automatically.

---

## Design Patterns

### Singleton Pattern
The office configuration and booking system will be managed as a single instance throughout the application. This ensures a global state for managing room configurations and bookings, preventing the creation of multiple configurations.

### Observer Pattern
Sensors will act as observers of room occupancy. They will listen for occupancy changes and trigger actions such as turning on or off the lights and air conditioning based on the room’s current status.

### Command Pattern
All booking, cancellation, and room status operations are handled as commands. This allows for an extendable, flexible architecture, where new operations can easily be added without modifying the core code.

---

## Setup Instructions

1. **Clone the repository:**
2. **Steps to run**
   ```bash
   cd SmartOfficeFacility
   cd src
   javac *.java
   java Main
