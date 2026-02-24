package javaCore.chapter03Loop.exercice;

public class WhileLoopExample {
    public static void main (String[] args) {

        int loopCounter = 1;
        int number = 1;
        int reverseNumber = 10;
        int pairNumber = 0;

        while (loopCounter <= 10) {
            System.out.println(loopCounter + " Hello World");
            loopCounter++;
        }

        while (number <= 10) {

            System.out.println(number);
            number ++;
        }

        while (number >= 0) {
            System.out.println(number);
            number --;
        }

        while (pairNumber <= 20) {
            System.out.println(pairNumber);
            pairNumber += 2;
        }


    }
}
