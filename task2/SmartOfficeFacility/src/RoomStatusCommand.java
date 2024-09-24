class RoomStatusCommand implements Command {
    private Room room;

    public RoomStatusCommand(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.printStatus();
    }
}
