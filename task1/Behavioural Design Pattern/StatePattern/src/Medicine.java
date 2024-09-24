public class Medicine {
    private MedicineState state;
    private String name;
    private int quantity;

    public Medicine(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.state = new Available(); // Initial state
    }

    public void setState(MedicineState state) {
        this.state = state;
    }

    public void handle() {
        state.handle(this);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        if (quantity == 0) {
            setState(new OutOfStock());
        } else {
            setState(new Available());
        }
    }

    public void expire() {
        setState(new Expired());
    }
}

