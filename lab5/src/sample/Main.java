package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import pets.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        List<Dog> list = new ArrayList<>();
        list.add(new Terrier("Barsik", 5));
        list.add(new Terrier("Leo", 7));
        list.add(new Shepherd("Teddy", 12));
        list.add(new Shepherd("Alfred", 14));
        list.add(new Terrier("Freddy", 6));
        list.add(new Poodle("Rudolf", 4));
        list.add(new Poodle("Jerry", 1));
        list.add(new Terrier("Felix", 9));
        list.add(new Shepherd("Miraj", 7));
        list.add(new Terrier("Archi", 6));

        if (list.stream().anyMatch(x -> x.getAge() > 10)){
            System.out.println("There are 1 or > dogs older than 10");
        }
        Comparator<Pet> petComparator = Comparator.comparing(Pet::getAge);
        petComparator = petComparator.thenComparing(Pet::getName);

        System.out.println("min age: " + list.stream().min(Comparator.comparing(Pet::getAge)).get().getAge());
        System.out.println("max age: " + list.stream().max(Comparator.comparing(Pet::getAge)).get().getAge());
        list.stream().filter(x -> x.getName().startsWith("A")).map(Pet::getName).forEach(System.out::println);
        System.out.println();
        list.stream().sorted(petComparator).map(Pet::getName).forEach(System.out::println);
    }
}
