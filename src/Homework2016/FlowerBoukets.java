package Homework2016;

/**
 * Created by Виктор on 18.01.2016.
 */
public class FlowerBoukets {
    String name;
    String colour;
    int number;

    public FlowerBoukets(final String name, final String colour, final int number) {
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
    public String toString() {
        return "FlowerBoukets/ " + "name " + name + "/ colour " + colour + "/ number " + number;
    }
}

