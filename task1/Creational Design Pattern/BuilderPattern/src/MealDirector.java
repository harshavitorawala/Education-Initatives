public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal constructMeal() {
        mealBuilder.buildStarter();
        mealBuilder.buildMainCourse();
        mealBuilder.buildDessert();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}

