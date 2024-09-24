public class ConfigRoomCountCommand implements Command {
    private Office office;
    private int count;

    public ConfigRoomCountCommand(Office office, int count) {
        this.office = office;
        this.count = count;
    }

    @Override
    public void execute() {
        office.configureRooms(count);
    }
}
