package Homework2016;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Виктор on 10.01.2016.
 */
public abstract class File {
       static void processFile(String fileName) throws IOException {

        if (fileName.length() == 0) {
            throw new IllegalArgumentException(
                    "empty filename");

        }

    }
    public class AudioFile extends File {

    }
    public class ImageFile extends File {
    }
    public class TextFile extends File {
    }
    public class Directory {
            Set<File> file = new HashSet<File>();
    }

    public static void main(String args[]) throws IOException {

        System.out.println(" Enter  name album ");
        final Scanner scanner = new Scanner(System.in);
        final String fileName = scanner.next();

        try {
            processFile("");

        }
        catch (IOException e) {
            System.out.printf( "Error: empty filename " );

        }
    }
}
