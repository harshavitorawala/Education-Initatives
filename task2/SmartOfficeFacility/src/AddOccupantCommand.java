public class AddOccupantCommand implements Command {
    private Room room;
    private int occupants;

    public AddOccupantCommand(Room room, int occupants) {
        this.room = room;
        this.occupants = occupants;
    }

    @Override
    public void execute() {
        room.setOccupancy(occupants);
    }
}
