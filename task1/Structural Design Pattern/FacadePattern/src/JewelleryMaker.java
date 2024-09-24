public class JewelleryMaker {
    private Jewellery silverJewellery;
    private Jewellery goldJewellery;
    private Jewellery diamondJewellery;
    private double totalCost = 0.0;

    public JewelleryMaker() {
        silverJewellery = new SilverJewellery();
        goldJewellery = new GoldJewellery();
        diamondJewellery = new DiamondJewellery();
    }

    public void makeSilverJewellery(int quantity) {
        for (int i = 0; i < quantity; i++) {
            silverJewellery.make();
            totalCost += silverJewellery.getPrice();
        }
        System.out.println("Total Silver Jewellery Cost: Rs." + (silverJewellery.getPrice() * quantity));
    }

    public void makeGoldJewellery(int quantity) {
        for (int i = 0; i < quantity; i++) {
            goldJewellery.make();
            totalCost += goldJewellery.getPrice();
        }
        System.out.println("Total Gold Jewellery Cost: Rs." + (goldJewellery.getPrice() * quantity));
    }

    public void makeDiamondJewellery(int quantity) {
        for (int i = 0; i < quantity; i++) {
            diamondJewellery.make();
            totalCost += diamondJewellery.getPrice();
        }
        System.out.println("Total Diamond Jewellery Cost: Rs." + (diamondJewellery.getPrice() * quantity));
    }

    public void printOrderSummary() {
        System.out.println("Order Summary:");
        System.out.println("Total cost: Rs." + totalCost);
    }
}

