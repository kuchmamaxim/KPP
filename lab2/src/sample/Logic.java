package sample;

public class Logic {
    Logic() {
    }

    public String giveCommand(Master master, int dogNum, String command) {
        Master master1 = new Master();
        master1.addCat();
        if (master.pets.get(dogNum) instanceof Cat)
            return "Cat can't execute your commands!";
        return master.giveACommand((Dog) master.pets.get(dogNum), command);
    }

    public String feed(Master master, int dogNum) {
        if (master.pets.get(dogNum) instanceof Cat)
            return "Cat doesn't eat dog food!";
        return master.giveFood((Dog) master.pets.get(dogNum));
    }

    public String walk(Master master, int dogNum) {
        if (master.pets.get(dogNum) instanceof Cat)
            return "Cat's don't like walking!";
        return master.walkADog((Dog) master.pets.get(dogNum));
    }

    public String sleep(int catNum, Master master) {
        if (master.pets.get(catNum) instanceof Dog)
            return "Dog's are always full of energy!";
        return ((Cat)master.pets.get(catNum)).sleep();
    }

    public String askFood(int dogNum, Master master) {
        if (master.pets.get(dogNum) instanceof Cat)
            return "Cat's don't ask, they always take what they want!";
        return ((Dog)master.pets.get(dogNum)).askFood();
    }
}
