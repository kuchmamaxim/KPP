package sample;

import java.util.Random;
import java.util.Vector;

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
        return dog.eatFood(someFood.getRandomFood());
    }
}
