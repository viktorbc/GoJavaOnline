package DZ8;


/**
 * Created by Виктор on 21.01.2016.
 */
import java.lang.String;
import java.util.Arrays;


class FlowersSorting implements Comparable<FlowersSorting> {
    String name;
    String colour;
    int number;

    public FlowersSorting( int number, String name,  String colour) {
        this.name = name;
        this.colour = colour;
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getColour() {
        return colour;
    }
    @Override
    public int compareTo(FlowersSorting flower) {
        return number - flower.number;
    }

    @Override
    public String toString() {
        return "[number " + this.number + " name " + this.name + "  colour " + this.colour + "]" ;
    }
    public static void main(String[] args) {

        FlowersSorting[] flowerArr = new FlowersSorting[4];
        flowerArr[0] = new FlowersSorting(30, "Tulip", "Red");
        flowerArr[1] = new FlowersSorting(15, "Aster", "White");
        flowerArr[2] = new FlowersSorting(25, "Rose", "Red");
        flowerArr[3] = new FlowersSorting(1, "Gladiolus", "Blue");

        Arrays.sort(flowerArr);
        System.out.println("Стандартная сортировка для массива объектов Flowers:\n" + Arrays.toString(flowerArr));
    }
}
