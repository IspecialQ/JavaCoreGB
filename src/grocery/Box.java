package grocery;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
    this.fruits = fruits;
    }


    public float getWeight() {
        float sum = 0;
        for (T fruit: fruits) {
            sum += fruit.weight;
        }
        return sum;
    }

    public boolean compare(Box<?> someBox) {
        float firstWeight = getWeight();
        float secondWeiht = someBox.getWeight();

        if(firstWeight == secondWeiht){
            System.out.println("true");
            return true;

        }
        System.out.println("false");
        return false;
    }

    public void sprinkle(Box<T> someBox){
        someBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public void showWeight(){
        float sum = 0;
        for (T fruit: fruits) {
            sum += fruit.weight;
        }
        System.out.println("Weight of this box: " + sum);
    }
}
