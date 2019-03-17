package sample;

import java.util.Vector;
import java.util.Random;

public class DogFood {
    private Vector foods;

    private Vector FoodList;

    DogFood(){
        FoodList = new Vector();
        FoodList.add("Sausage");
        FoodList.add("Carrot");
        FoodList.add("Fish");
        FoodList.add("Meat");
        FoodList.add("Bone");
        FoodList.add("Chocolate");
    }

    public void fill(int n){
        Random rand = new Random();
        foods = new Vector();
        for (int i = 0; i < n; i++){
            foods.add(FoodList.get(rand.nextInt(FoodList.size()-2)));
        }
    }

    public String getRandomFood(){
        Random rand = new Random();
        return foods.get(rand.nextInt(foods.size()+1)-1).toString();
    }
}
