public class ConfigRoomMaxCapacityCommand implements Command {
    private Room room;
    private int capacity;

    public ConfigRoomMaxCapacityCommand(Room room, int capacity) {
        this.room = room;
        this.capacity = capacity;
    }

    @Override
    public void execute() {
        room.setMaxCapacity(capacity);
    }
}
