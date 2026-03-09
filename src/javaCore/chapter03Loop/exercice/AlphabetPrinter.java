package javaCore.chapter03Loop.exercice;

public class AlphabetPrinter {
    public static void main(String[] args) {

        char letter = 65;

        while (letter <= 122) {

            if ( letter > 90 && letter < 97) {
                letter ++;
                continue;
            }
            System.out.print(letter + " ");
            letter ++;
        }

    }
}
