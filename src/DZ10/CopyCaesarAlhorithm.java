package DZ10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by Виктор on 25.01.2016.
 */
public class CopyCaesarAlhorithm {
    static List<Character> alphabet = new ArrayList<Character>();
    private static Byte newText;

    public CopyCaesarAlhorithm() {
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
    }

    static String encrypt(String text, int m, int key) {

        int n = alphabet.size();

        StringBuilder cryptogram = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (index * m + key) % n;
            cryptogram.append(alphabet.get(index));

        }
        return cryptogram.toString();
    }

    public String decrypt(String text, int m, int key) {
        int n = alphabet.size();

        int reversedM = -1;
        for (int i = 0; i < n; i++) {
            if ((i * m) % n == 1) {
                reversedM = i;
                break;
            }
        }
        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (((index - key) * reversedM) % n + n) % n;
            newText.append(alphabet.get(index));
        }
        return newText.toString();

    }

    public static void main(String[] args) {
        String fileName = "copyText.txt";
        try {

            FileOutputStream outFile = new FileOutputStream("copyText.txt");
            System.out.println("Файл открыт для записи");

            outFile.write(newText);

            outFile.close();
            System.out.println("Выходной поток закрыт");

            FileInputStream inFile = new FileInputStream(fileName);
            System.out.println("Файл открыт для чтения");

            int bytesAvailable = inFile.available();
            System.out.println("Готово к считыванию: " + bytesAvailable + " байт");


            inFile.close();
            System.out.println("Входной поток закрыт");
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());
        }
    }
}


