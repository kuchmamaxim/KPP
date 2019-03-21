package sample;

public enum FoodTypes {
    CARROT("Carrot"),
    MEAT("Meat"),
    CHOCOLATE("Chocolate"),
    SAUSAGE("Sausage"),
    BONE("Bone"),
    FISH("Fish");

    String foodName;

    FoodTypes(String name) {
        this.foodName = name;
    }
}
