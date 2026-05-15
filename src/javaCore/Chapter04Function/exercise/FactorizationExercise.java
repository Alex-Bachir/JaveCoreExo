package javaCore.Chapter04Function.exercise;

public class FactorizationExercise {
    public static void main(String[] args) {

        afficherNumber();

        multipleNumbers(2);

        multipleNumbers(3);

        multipleNumbers(6);

        afficherSquare(1,6);


    }

    public static void afficherNumber() {
        // Afficher les nombres de 1 à 5
        for (int number = 1; number <= 5; number++) {
            System.out.println(number);
        }
    }

    public static void multipleNumbers(int table) {
        System.out.println("Table de multiplication de " + table + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
    }

    public static void afficherSquare(int number1, int number2) {
        // Afficher les carrés des nombres de 1 à 5
        System.out.println("Carrés des nombres de 1 à 5 :");
        for (number1 = 1; number1 <= 5; number1++) {
            System.out.println(number1 + " au carré = " + (number1 * number1));
        }
        // Afficher les carrés des nombres de 6 à 10
        System.out.println("Carrés des nombres de 6 à 10 :");
        for (number2 = 6; number2 <= 10; number2++) {
            System.out.println(number2 + " au carré = " + (number2 * number2));
        }

    }




}
