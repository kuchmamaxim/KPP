package pets;

public abstract class Pet {
    protected String name;
    protected int age;

    public Pet(){
        name = "Terry";
        age = 1;
    }
    public Pet(String tname, int tage){
        name = tname;
        age = tage;
    }

    public String getName(){
        return name;
    }
}
