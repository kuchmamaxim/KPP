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
            case "Bring me a stick!": return "*gives you a stick* [would like 2 say but can't]: Take the prescious, master!";
            default: return "*misunderstanding...*";
        }
    }

    public String eatFood(String food){
        switch (food){
            case "Meat": case "Sausage": case "Fish": return "Woof! [would like 2 say but can't]: If u'd ask me, what is on the 1st place 4 me : food or you, i'd said meat. Because u r on the 0's, master! Cause programmers count from 0, u know :) ";
            case "Carrot": return "*eat silently*";
            default: return "*eat silently*[would like 2 say but can't]: Hmm.. Interesting new thing!";
        }
    }

    public String getName(){
        return name;
    }
}
