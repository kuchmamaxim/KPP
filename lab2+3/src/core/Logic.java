package core;

import pets.Cat;
import pets.Dog;

public class Logic {
    public Logic() {
    }

    public String giveCommand(Master master, int dogNum, String command) {
        if (master.getPets().get(dogNum) instanceof Cat)
            return "Cat can't execute your commands!";
        return master.giveACommand((Dog) master.getPets().get(dogNum), command);
    }

    public String feed(Master master, int dogNum) {
        if (master.getPets().get(dogNum) instanceof Cat)
            return "Cat doesn't eat dog food!";
        return master.giveFood((Dog) master.getPets().get(dogNum));
    }

    public String walk(Master master, int dogNum) {
        if (master.getPets().get(dogNum) instanceof Cat)
            return "Cat's don't like walking!";
        return master.walkADog((Dog) master.getPets().get(dogNum));
    }

    public String sleep(int catNum, Master master) {
        if (master.getPets().get(catNum) instanceof Dog)
            return "Dog's are always full of energy!";
        return ((Cat)master.getPets().get(catNum)).sleep();
    }

    public String askFood(int dogNum, Master master) {
        if (master.getPets().get(dogNum) instanceof Cat)
            return "Cat's don't ask, they always take what they want!";
        return ((Dog)master.getPets().get(dogNum)).askFood();
    }
}
