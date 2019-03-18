package sample;

import java.util.Random;

class DogTrainer {

    private DogFood someFood = new DogFood();

    DogTrainer () {
        Random r = new Random();
        int n = r.nextInt(11);
        someFood.fill(n);
    }
    String giveACommand(Dog dog, String command) {
        return dog.execCommand(command);
    }

    String giveFood (Dog dog) {
        if (someFood.foodsLeft() == 0)
            return "error: THERE IS NO FOOD IN YOUR BAG";
        return dog.eatFood(someFood.getRandomFood());
    }
}
