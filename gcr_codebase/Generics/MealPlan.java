interface MealPlan {
    String getPlanName();
}

class VegetarianMeal implements MealPlan {
    public String getPlanName() { return "Vegetarian Meal Plan"; }
}

class Meal<T extends MealPlan> {
    public void generatePlan(T meal) {
        System.out.println("Generating: " + meal.getPlanName());
    }
}
