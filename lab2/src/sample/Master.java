package sample;

import java.util.Random;
import java.util.ArrayList;

public class Master {

    private DogFood someFood = new DogFood();
    public ArrayList<Pet> pets = new ArrayList<>();

    Master() {
        Random r = new Random();
        int n = r.nextInt(11);
        someFood.fill(n);
    }

    public void addCat (){
        pets.add(new Cat());
    }
    public void addCat (Cat cat){
        pets.add(cat);
    }

    public void addDog (DogTypes type){
        switch (type) {
            case TERRIER: {
                pets.add(new Terrier());
                break;
            }
            case POODLE: {
                pets.add(new Poodle());
                break;
            }
            case SHEPHERD: {
                pets.add(new Shepherd());
                break;
            }
        }
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
