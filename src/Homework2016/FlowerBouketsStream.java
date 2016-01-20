package Homework2016;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Виктор on 18.01.2016.
 */
public class FlowerBouketsStream {
    public static void main(String[] args) {
        final List<FlowerBoukets> flowerBouketsList  = new ArrayList<>();
        flowerBouketsList.add(new FlowerBoukets("Tulip", "Orange", 45));
        flowerBouketsList.add(new FlowerBoukets("Aster", "White", 25));
        flowerBouketsList.add(new FlowerBoukets("Rose", "Red", 15));

        System.out.println("");

        flowerBouketsList.stream().sorted().collect(flowerBouketsList.toList(name));
        System.out.println(flowerBouketsList);
    }

}
