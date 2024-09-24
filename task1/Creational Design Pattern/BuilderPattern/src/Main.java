import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MealBuilder italianMealBuilder = new IndianMealBuilder();
        MealDirector director = new MealDirector(italianMealBuilder);
        boolean done = false;

        while (!done) {
            Meal customItalianMeal = director.constructMeal();
            System.out.println("\nYour custom meal is ready:");
            System.out.println(customItalianMeal);
            
            System.out.print("\nWould you like to create another meal? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            done = response.equals("no");
        }
        
        System.out.println("Thank you for using the meal builder!");
        scanner.close();
    }
}
