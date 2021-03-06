package Homework2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Виктор on 18.01.2016.
 */
public class FlowerBouketsTable {
    public static void main(String[] args) {
        final List<FlowerBoukets> flowerBouketsList  = new ArrayList<>();
        flowerBouketsList.add(new FlowerBoukets("Tulip", "Orange", 45));
        flowerBouketsList.add(new FlowerBoukets("Aster", "White", 25));
        flowerBouketsList.add(new FlowerBoukets("Rose", "Red", 15));

        System.out.println("");
        for(FlowerBoukets flowerBoukets : flowerBouketsList){
            System.out.println(flowerBoukets);
        }
        flowerBouketsList
                .stream()
                .map (FlowerBoukets -> FlowerBoukets.name())
                .forEach(p -> System.out.println(p));

    }
}

