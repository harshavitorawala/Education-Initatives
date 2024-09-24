import java.util.Scanner;

public class IndianMealBuilder implements MealBuilder {
    private Meal meal;
    private Scanner scanner;

    public IndianMealBuilder() {
        this.meal = new Meal();
        this.scanner = new Scanner(System.in);  
    }

    @Override
    public void buildStarter() {
        System.out.print("Enter the starter for your meal: ");
        String starter = scanner.nextLine();
        meal.setStarter(starter);
    }

    @Override
    public void buildMainCourse() {
        System.out.print("Enter the main course for your meal: ");
        String mainCourse = scanner.nextLine();
        meal.setMainCourse(mainCourse);
    }

    @Override
    public void buildDessert() {
        System.out.print("Enter the dessert for your meal: ");
        String dessert = scanner.nextLine();
        meal.setDessert(dessert);
    }

    @Override
    public void buildDrink() {
        System.out.print("Enter the drink for your meal: ");
        String drink = scanner.nextLine();
        meal.setDrink(drink);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}


