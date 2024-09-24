import java.util.Scanner;
// Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JewelleryMaker jewelleryMaker = new JewelleryMaker();
        
        System.out.print("Enter the quantity of Silver Jewellery: ");
        int silverQuantity = scanner.nextInt();
        jewelleryMaker.makeSilverJewellery(silverQuantity);
        
        System.out.print("Enter the quantity of Gold Jewellery: ");
        int goldQuantity = scanner.nextInt();
        jewelleryMaker.makeGoldJewellery(goldQuantity);
        
        System.out.print("Enter the quantity of Diamond Jewellery: ");
        int diamondQuantity = scanner.nextInt();
        jewelleryMaker.makeDiamondJewellery(diamondQuantity);
        
        jewelleryMaker.printOrderSummary();
        
        scanner.close();
    }
}

