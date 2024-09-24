public class Available implements MedicineState {
    @Override
    public void handle(Medicine medicine) {
        System.out.println(medicine.getName() + " is available for sale.");
        if (medicine.getQuantity() == 0) {
            medicine.setState(new OutOfStock());
        }
    }
}
