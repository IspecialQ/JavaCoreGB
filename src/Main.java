import grocery.Apple;
import grocery.Box;
import grocery.Orange;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] string = {"1", "2", "3", "4"};
        System.out.println(Arrays.toString(string));
        changeArrayElements(string,2,3);
        System.out.println(Arrays.toString(string));

    Box<Apple> appleBox = new Box<>(addNewApple(15)); // создаем коробку с яблоками
    Box<Orange> orangeBox = new Box<>(addNewOrange(25)); // создаем коробку с апельсинами
    appleBox.compare(orangeBox);
    Box<Apple> anotherAppleBox = new Box(addNewApple(5)); //еще одна коробка яблок
    appleBox.sprinkle(anotherAppleBox); //высыпаем из первой во вторую
    appleBox.showWeight(); // вес коробок изменился
    anotherAppleBox.showWeight();

    }

    public static <T>void changeArrayElements(T[] array, int firstIndex, int secondIndex) {
        T i = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = i;

    }

    public static ArrayList<Apple> addNewApple(int count){
        ArrayList<Apple> fruits =  new ArrayList<>();
        for(int i = 0; i < count; i++){
            fruits.add(new Apple());
        }
        return fruits;
    }

    public static ArrayList<Orange> addNewOrange(int count){
        ArrayList<Orange> fruits =  new ArrayList<>();
        for(int i = 0; i < count; i++){
            fruits.add(new Orange());
        }
        return fruits;
    }
}

