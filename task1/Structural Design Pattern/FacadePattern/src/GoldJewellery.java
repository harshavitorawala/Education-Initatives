public class GoldJewellery implements Jewellery {
    private double price = 50000.0;

    public void make() {
        System.out.println("GOLD JEWELLERY :: MAKE()");
    }

    public double getPrice() {
        return price;
    }
}

