package pets;

import pets.Dog;

public class Shepherd extends Dog {
    public Shepherd(){
        name = "Buch";
        age = 5;
    }
    @Override
    public String execCommand(String command){
        switch (command){
            case "Sit!":
                return "Woof! *siting* [would like 2 say but can't]: I love u, master!";
            case "Voice!":
                return "Woof!";
            case "2+2?":
                return "Woof!Woof!Woof!Woof!";
            case "Bring a stick!":
                return "*gives you a stick* [would like 2 say but can't]: Take the prescious, master!";
            default:
                return "*misunderstanding...*";
        }
    }
}
