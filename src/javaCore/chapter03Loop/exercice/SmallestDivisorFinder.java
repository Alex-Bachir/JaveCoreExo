package javaCore.chapter03Loop.exercice;

public class SmallestDivisorFinder {
    public static void main (String[] args) {

        int number = 17;
        int divisor = 2;

        while (number % divisor != 0) {
            divisor ++;
        }

        if (number % divisor == 0 && number == divisor) {
            System.out.println(number + " ce chiffre peut ce diviser que par 1 et par lui même. C'est un nombre premier.");
        } else {
            System.out.println(divisor + " ce chiffre est le plus petit diviseur pour " + number);
        }
    }
}
