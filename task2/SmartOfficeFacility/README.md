Smart Office Facility Programming Exercise
Problem Statement
Design a console-based application to manage a smart office facility. The system should handle conference room bookings, occupancy
detection, and automate the control of air conditioning and lighting based on room occupancy. This exercise aims to evaluate the
candidate's ability to implement best coding practices, design patterns, and create an efficient, maintainable, and scalable solution.

Functional Requirements
Mandatory Requirements
1. The system should allow users to configure the office facility by specifying the number of meeting rooms.
2. Users should be able to book and cancel bookings for conference rooms.
3. Occupancy should be detected using sensors that register when at least two people enter a room.
4. Unoccupied rooms should automatically release bookings if not occupied within 5 minutes.
5. The air conditioning and lights should turn off if the room is not occupied.
Optional Requirements
1. Provide a summary of room usage statistics.
2. Implement user authentication to restrict access to booking and configuration features.
3. Notify users via email or SMS when their booked room is released automatically.
Key Focus
Design Patterns to be Used
1. Singleton Pattern: Ensure that the office configuration and room booking system is a single instance throughout the application.
2. Observer Pattern: Implement sensors and control systems (lights, AC) as observers to the room's occupancy status.
3. Command Pattern: Handle booking, cancellation, and room status updates through commands, allowing for flexible and extendable
operations.
Instructions
1. Singleton Pattern: Use this pattern to manage the global state of the office configuration, ensuring that only one instance of the office
configuration exists.
2. Observer Pattern: Sensors should subscribe to occupancy changes and trigger actions like turning on/off lights and AC based on room
status.
3. Command Pattern: Create commands for booking, cancellation, and status updates. This allows for easier addition of new features and
operations.
