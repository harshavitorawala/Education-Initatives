public class Meal {
    private String starter;
    private String mainCourse;
    private String dessert;
    private String drink;

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal [" +
                "starter='" + starter + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", dessert='" + dessert + '\'' +
                ", drink='" + drink + '\'' +
                ']';
    }
}

