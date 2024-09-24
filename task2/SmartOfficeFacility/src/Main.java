// import java.util.*;

// public class Main {
//     private static Office office = Office.getInstance();

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         OccupancySensor sensor = new OccupancySensor();
//         while (true) {
//             System.out.print("Enter command: ");
//             String input = scanner.nextLine();
//             String[] commands = input.split(" ");

//             try {
//                 switch (commands[0]) {
//                     case "Config":
//                         if (commands[1].equals("room") && commands[2].equals("count")) {
//                             int roomCount = Integer.parseInt(commands[3]);
//                             Command configRoomCountCommand = new ConfigRoomCountCommand(office, roomCount);
//                             configRoomCountCommand.execute();
//                         } else if (commands[1].equals("room") && commands[2].equals("max") && commands[3].equals("capacity")) {
//                             int roomNumber = Integer.parseInt(commands[4]);
//                             int capacity = Integer.parseInt(commands[5]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command configRoomMaxCapacityCommand = new ConfigRoomMaxCapacityCommand(room, capacity);
//                                 configRoomMaxCapacityCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Add":
//                         if (commands[1].equals("occupant")) {
//                             int roomNumber = Integer.parseInt(commands[2]);
//                             int occupants = Integer.parseInt(commands[3]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command addOccupantCommand = new AddOccupantCommand(room, occupants);
//                                 addOccupantCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Block":
//                         if (commands[1].equals("room")) {
//                             int roomNumber = Integer.parseInt(commands[2]);
//                             String startTime = commands[3];
//                             int duration = Integer.parseInt(commands[4]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command blockRoomCommand = new BlockRoomCommand(room, startTime, duration);
//                                 blockRoomCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Cancel":
//                         if (commands[1].equals("room")) {
//                             int roomNumber = Integer.parseInt(commands[2]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command cancelRoomCommand = new CancelRoomCommand(room);
//                                 cancelRoomCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                         case "Status":
//                         if (commands[1].equals("room")) {
//                             int roomNumber = Integer.parseInt(commands[2]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command roomStatusCommand = new RoomStatusCommand(room);
//                                 roomStatusCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Exit":
//                         System.out.println("Exiting system.");
//                         return;

//                     default:
//                         System.out.println("Invalid command.");
//                 }
//             } catch (Exception e) {
//                 System.out.println("Error: " + e.getMessage());
//             }
//         }
//     }
// }

// import java.util.*;

// public class Main {
//     private static Office office = Office.getInstance();

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         OccupancySensor sensor = new OccupancySensor();
//         while (true) {
//             System.out.print("Enter command: ");
//             String input = scanner.nextLine();
//             String[] commands = input.split(" ");

//             try {
//                 switch (commands[0]) {
//                     case "Config":
//                         if (commands[1].equals("room") && commands[2].equals("count")) {
//                             int roomCount = Integer.parseInt(commands[3]);
//                             Command configRoomCountCommand = new ConfigRoomCountCommand(office, roomCount);
//                             configRoomCountCommand.execute();
//                         } else if (commands[1].equals("room") && commands[2].equals("max") && commands[3].equals("capacity")) {
//                             int roomNumber = Integer.parseInt(commands[4]);
//                             int capacity = Integer.parseInt(commands[5]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command configRoomMaxCapacityCommand = new ConfigRoomMaxCapacityCommand(room, capacity);
//                                 configRoomMaxCapacityCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Add":
//                         if (commands[1].equals("occupant")) {
//                             int roomNumber = Integer.parseInt(commands[2]);
//                             int occupants = Integer.parseInt(commands[3]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command addOccupantCommand = new AddOccupantCommand(room, occupants);
//                                 addOccupantCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Block":
//                         if (commands[1].equals("room")) {
//                             int roomNumber = Integer.parseInt(commands[2]);
//                             String startTime = commands[3];
//                             int duration = Integer.parseInt(commands[4]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command blockRoomCommand = new BlockRoomCommand(room, startTime, duration);
//                                 blockRoomCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Cancel":
//                         if (commands[1].equals("room")) {
//                             int roomNumber = Integer.parseInt(commands[2]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command cancelRoomCommand = new CancelRoomCommand(room);
//                                 cancelRoomCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Status":
//                         if (commands[1].equals("room")) {
//                             int roomNumber = Integer.parseInt(commands[2]);
//                             Room room = office.getRoom(roomNumber);
//                             if (room != null) {
//                                 Command roomStatusCommand = new RoomStatusCommand(room);
//                                 roomStatusCommand.execute();
//                             } else {
//                                 System.out.println("Room " + roomNumber + " does not exist.");
//                             }
//                         }
//                         break;

//                     case "Exit":
//                         System.out.println("Exiting system.");
//                         return;

//                     default:
//                         System.out.println("Invalid command.");
//                 }
//             } catch (Exception e) {
//                 System.out.println("Error: " + e.getMessage());
//             }
//         }
//     }
// }

import java.util.*;

public class Main {
    private static Office office = Office.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OccupancySensor sensor = new OccupancySensor();
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            String[] commands = input.split(" ");

            try {
                switch (commands[0]) {
                    case "Config":
                        if (commands[1].equals("room") && commands[2].equals("count")) {
                            int roomCount = Integer.parseInt(commands[3]);
                            Command configRoomCountCommand = new ConfigRoomCountCommand(office, roomCount);
                            configRoomCountCommand.execute();
                        } else if (commands[1].equals("room") && commands[2].equals("max") && commands[3].equals("capacity")) {
                            int roomNumber = Integer.parseInt(commands[4]);
                            int capacity = Integer.parseInt(commands[5]);
                            Room room = office.getRoom(roomNumber);
                            if (room != null) {
                                Command configRoomMaxCapacityCommand = new ConfigRoomMaxCapacityCommand(room, capacity);
                                configRoomMaxCapacityCommand.execute();
                            } else {
                                System.out.println("Room " + roomNumber + " does not exist.");
                            }
                        }
                        break;

                    case "Add":
                        if (commands[1].equals("occupant")) {
                            int roomNumber = Integer.parseInt(commands[2]);
                            int occupants = Integer.parseInt(commands[3]);
                            Room room = office.getRoom(roomNumber);
                            if (room != null) {
                                Command addOccupantCommand = new AddOccupantCommand(room, occupants);
                                addOccupantCommand.execute();
                            } else {
                                System.out.println("Room " + roomNumber + " does not exist.");
                            }
                        }
                        break;

                    case "Block":
                        if (commands[1].equals("room")) {
                            int roomNumber = Integer.parseInt(commands[2]);
                            String startTime = commands[3];
                            int duration = Integer.parseInt(commands[4]);
                            Room room = office.getRoom(roomNumber);
                            if (room != null) {
                                Command blockRoomCommand = new BlockRoomCommand(room, startTime, duration);
                                blockRoomCommand.execute();
                            } else {
                                System.out.println("Room " + roomNumber + " does not exist.");
                            }
                        }
                        break;

                    case "Cancel":
                        if (commands[1].equals("room")) {
                            int roomNumber = Integer.parseInt(commands[2]);
                            Room room = office.getRoom(roomNumber);
                            if (room != null) {
                                Command cancelRoomCommand = new CancelRoomCommand(room);
                                cancelRoomCommand.execute();
                            } else {
                                System.out.println("Room " + roomNumber + " does not exist.");
                            }
                        }
                        break;

                    case "Room":
                        if (commands[1].equals("status")) {
                            int roomNumber = Integer.parseInt(commands[2]);
                            Room room = office.getRoom(roomNumber);
                            if (room != null) {
                                Command roomStatusCommand = new RoomStatusCommand(room);
                                roomStatusCommand.execute();
                            } else {
                                System.out.println("Room " + roomNumber + " does not exist.");
                            }
                        }
                        break;

                    case "Exit":
                        System.out.println("Exiting system.");
                        keepRunning = false;
                        break;

                    default:
                        System.out.println("Invalid command.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Ask user whether they want to continue or exit
            if (keepRunning) {
                System.out.println(" ");
                System.out.print("Do you want to continue? (yes/no): ");
                String continueInput = scanner.nextLine();
                if (continueInput.equalsIgnoreCase("no")) {
                    System.out.println("Exiting system.");
                    keepRunning = false;
                }
            }
        }
    }
}

