package DZ8;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Виктор on 18.01.2016.
 */
public class FlowersTable {
    public static void main(String[] args) {
        final List<Flowers> flowersList  = new ArrayList<>();
        flowersList.add(new Flowers("Tulip", "Orange", 45));
        flowersList.add(new Flowers("Aster", "White", 25));
        flowersList.add(new Flowers("Rose", "Red", 15));
        flowersList.add(new Flowers("Gladiolus", "Blue", 35));

        System.out.println("");
        for(Flowers flowers : flowersList){
            System.out.println(flowers);
        }





    }
}

