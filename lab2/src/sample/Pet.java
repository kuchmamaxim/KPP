package sample;

public abstract class Pet {
    protected String name;
    protected int age;

    Pet(){
        name = "Terry";
        age = 1;
    }
    Pet(String tname, int tage){
        name = tname;
        age = tage;
    }

    public String getName(){
        return name;
    }
}
