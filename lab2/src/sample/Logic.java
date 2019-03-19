package sample;

import java.util.Vector;

public class Logic {
    private Master master = new Master();

    Logic (){
        master.addCat();
        master.addDog(dog_types.POODLE);
        master.addDog(dog_types.SHEPHERD);
        master.addDog(dog_types.TERRIER);
    }
    public String giveCommand(int i, String command){
        if (master.pets.get(i) instanceof Cat)
            return "Cat can't execute your commands!";
        return master.giveACommand((Dog)master.pets.get(i), command);
    }

    public String feed(int i){
        if (master.pets.get(i) instanceof Cat)
            return "Cat doesn't eat dog food!";
        return master.giveFood((Dog) master.pets.get(i));
    }

    public Vector<String> getPetList() {
        Vector<String> petList = new Vector<String>();
        for (int i = 0; i < master.pets.size(); i++) {
            petList.add(master.pets.get(i).getName());
        }
        return petList;
    }
}
