package sample;

import java.util.ArrayList;
import java.util.Random;

public class DogFood {
    private ArrayList<String> foods;

    DogFood(){
        foods = new ArrayList<>();
    }

    public void fill(int n){
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            foods.add(FoodTypes.values()[rand.nextInt(FoodTypes.values().length)].foodName);
        }
    }

    public String getFood(){
        String answer = foods.get(0);
        foods.remove(0);
        return answer;
    }

    public int foodsLeft(){
        return foods.size();
    }
}
