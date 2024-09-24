public interface MealBuilder {
    void buildStarter();
    void buildMainCourse();
    void buildDessert();
    void buildDrink();
    Meal getMeal();
}

