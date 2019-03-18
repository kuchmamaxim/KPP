package sample;

import java.util.Random;

public class Poodle extends Dog{
    Poodle(){
        name = "Bernard";
        age = 9;
    }
    @Override
    public String eatFood(String food){
        return "*gallantly eat in silence*";
    }

    @Override
    public String execCommand(String command){
        Random rand = new Random();
        boolean poodleThought = rand.nextBoolean();
        if (poodleThought == false)
            return "*does nothing* [would like 2 say but can't]: I'm sooo tired!";
        else return super.execCommand(command);
    }

}
