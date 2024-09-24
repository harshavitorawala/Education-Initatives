public class Main {
    public static void main(String[] args) {
        Medicine paracetamol = new Medicine("Paracetamol", 10);
        
        paracetamol.handle(); // Output: Paracetamol is available for sale.
        
        paracetamol.setQuantity(0); // Change state to OutOfStock
        paracetamol.handle(); // Output: Paracetamol is out of stock.

        paracetamol.setQuantity(5); // Change state back to Available
        paracetamol.handle(); // Output: Paracetamol is available for sale.

        paracetamol.expire(); // Change state to Expired
        paracetamol.handle(); // Output: Paracetamol has expired and cannot be sold.
    }
}

