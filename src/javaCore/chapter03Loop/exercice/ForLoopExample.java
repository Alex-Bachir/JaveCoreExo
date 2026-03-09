package javaCore.chapter03Loop.exercice;

public class ForLoopExample {
    public static void main(String[] args) {

        for (int number = 1; number <= 20; number ++) {

            System.out.print( number + " ");

            if (number == 20) {
                System.out.println(" ");
            }
        }

        for (int number = 20; number >= 1; number --) {

            System.out.print( number + " ");

            if (number == 1) {
                System.out.println(" ");
            }
        }

        for ( char letter = 65; letter <= 90; letter++) {

            System.out.print( letter + " ");

            if (letter == 90) {
                System.out.println(" ");
            }
        }

        int result = 1;

        for ( int facto = 1 ; facto <= 12 ; facto ++) {
            result *= facto ;
            System.out.print( result + " ");
        }

    }
}
