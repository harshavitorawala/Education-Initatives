public class BlockRoomCommand implements Command {
    private Room room;
    private String startTime;
    private int duration;

    public BlockRoomCommand(Room room, String startTime, int duration) {
        this.room = room;
        this.startTime = startTime;
        this.duration = duration;
    }

    @Override
    public void execute() {
        room.bookRoom(startTime, duration);
    }
}
