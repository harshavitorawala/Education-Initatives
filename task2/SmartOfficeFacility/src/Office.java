import java.util.*;

public class Office {
    private static Office instance;
    private int roomCount;
    private List<Room> rooms = new ArrayList<>();

    private Office() {}

    public static Office getInstance() {
        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }

    public void configureRooms(int roomCount) {
        this.roomCount = roomCount;
        rooms.clear();
        for (int i = 1; i <= roomCount; i++) {
            rooms.add(new Room(i));
        }
        System.out.println("Office configured with " + roomCount + " meeting rooms: " + getRoomList());
    }

    public Room getRoom(int roomNumber) {
        if (roomNumber < 1 || roomNumber > roomCount) {
            return null;
        }
        return rooms.get(roomNumber - 1);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    private String getRoomList() {
        StringBuilder roomList = new StringBuilder();
        for (int i = 1; i <= roomCount; i++) {
            roomList.append("Room ").append(i);
            if (i != roomCount) roomList.append(", ");
        }
        return roomList.toString();
    }
}
