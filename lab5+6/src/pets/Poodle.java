package pets;

import java.util.Random;

public class Poodle extends Dog {
    public Poodle(){
        name = "Bernard";
        age = 9;
    }

    public Poodle(String tname, int tage){
        super(tname, tage);
    }

    @Override
    public String eatFood(String food){
        switch (food){
            case "Meat": case "Sausage": case "Fish": return "*don't eat* [would like 2 say but can't]: Sorry, bro, I'm vegan!";
            default: return "*gallantly eat in silence*";
        }
    }

    @Override
    public String execCommand(String command){
        Random rand = new Random();
        boolean poodleThought = rand.nextBoolean();
        if (poodleThought == false)
            return "*does nothing* [would like 2 say but can't]: I'm sooo tired!";
        else switch (command){
                case "Sit!": return "Woof! *siting*";
                case "Voice!": return "Woof!";
                case "2+2?": return "Woof!Woof!Woof!Woof!";
                case "Bring a stick!": return "*gives you a stick*";
                default: return "*misunderstanding...*";
            }
    }

}
