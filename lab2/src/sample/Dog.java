package sample;

public abstract class Dog extends Pet {
    Dog() {
        name = "Tuzik";
        age = 5;
    }

    public abstract String execCommand(String command);

    public String eatFood(String food) {
        switch (food) {
            case "Meat":
            case "Sausage":
            case "Fish":
                return "Woof! [would like 2 say but can't]: I <3 u even > than meat!";
            case "Carrot":
                return "*eat silently*";
            case "Chocolate":
                return "[would like 2 say but can't]: Yummy!";
            default:
                return "*eat silently*[would like 2 say but can't]: Hmm.. Interesting new thing!";
        }
    }

    public String askFood() {
        return "*touchingly looking at you*";
    }
}
