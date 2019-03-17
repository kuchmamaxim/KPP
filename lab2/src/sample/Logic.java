package sample;

import java.util.Vector;

public class Logic {
    private DogTrainer dogTrainer = new DogTrainer();

    private static Vector<String> dogList = new Vector<String>();

    private static Vector<Dog> dogs = new Vector<Dog>();
    Logic (){
        dogs.add(new Poodle());
        dogList.add(dogs.get(dogs.size()-1).getName());
        dogs.add(new Shepherd());
        dogList.add(dogs.get(dogs.size()-1).getName());
        dogs.add(new Terrier());
        dogList.add(dogs.get(dogs.size()-1).getName());
    }
    public String giveCommand(int i, String command){
        return dogTrainer.giveACommand(dogs.get(i), command);
    }

    public String feed(int i){
        return dogTrainer.giveFood(dogs.get(i));
    }
    public static Vector getDogList(){
        return dogList;
    }
}
