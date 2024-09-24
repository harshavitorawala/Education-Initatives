public class Expired implements MedicineState {
    @Override
    public void handle(Medicine medicine) {
        System.out.println(medicine.getName() + " has expired and cannot be sold.");
    }
}

