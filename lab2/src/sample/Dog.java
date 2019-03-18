package sample;

public class Dog {
    protected static String name;
    protected int age;

    Dog (){
        name = "Tuzik";
        age = 5;
    }

    Dog(String tname, int n){
        name = tname;
        age = n;
    }

    public String execCommand(String command){
        switch (command){
            case "Sit!": return "Woof! *siting* [would like 2 say but can't]: I love u, master!";
            case "Voice!": return "Woof!";
            case "2+2?": return "Woof!Woof!Woof!Woof!";
            case "Bring a stick!": return "*gives you a stick* [would like 2 say but can't]: Take the prescious, master!";
            default: return "*misunderstanding...*";
        }
    }

    public String eatFood(String food){
        switch (food){
            case "Meat": case "Sausage": case "Fish": return "Woof! [would like 2 say but can't]: I <3 u even > than meat!";
            case "Carrot": return "*eat silently*";
            case "Chocolate": return "[would like 2 say but can't]: Yummy!";
            default: return "*eat silently*[would like 2 say but can't]: Hmm.. Interesting new thing!";
        }
    }

    public String getName(){
        return name;
    }
}
