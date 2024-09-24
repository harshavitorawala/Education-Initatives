public class OutOfStock implements MedicineState {
    @Override
    public void handle(Medicine medicine) {
        System.out.println(medicine.getName() + " is out of stock.");
        if (medicine.getQuantity() > 0) {
            medicine.setState(new Available());
        }
    }
}
