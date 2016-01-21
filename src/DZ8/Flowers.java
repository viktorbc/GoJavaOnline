package DZ8;

/**
 * Created by Виктор on 18.01.2016.
 */
public class Flowers {
    String name;
    String colour;
    int number;

    public Flowers(final String name, final String colour, final int number) {
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
        return "Flowers/ " + "name " + this.name + "/ colour " + this.colour + "/ number " + this.number;
    }
}

