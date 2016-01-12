package DZ3;

/**
 * Created by Виктор on 12.01.2016.
 */
    import java.io.IOException;
    import java.util.Scanner;


public  class Modul3 {

    static void openFile(String fileName) throws IOException {

        if (fileName.length() == 0) {
            throw new IOException(
                    "empty filename");
        }
    }


    public static void main(String args[])  {
        System.out.println(" Enter  name album ");
        final Scanner scanner = new Scanner(System.in);
        final String fileName = scanner.next();
        try {
            openFile("");
        }
        catch (IOException e) {
            System.out.printf( "Error: empty filename " );
            System.out.println("");
        }
    }
}
