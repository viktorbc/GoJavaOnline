package DZ9;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Виктор on 25.01.2016.
 */
public class CaesarAlhorithm {
    static List<Character> alphabet = new ArrayList<Character>();

    CaesarAlhorithm() {
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

}












