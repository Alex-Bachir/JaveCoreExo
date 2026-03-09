package javaCore.chapter03Loop.exercice;

public class FactorialCalculator {
    public static void main(String[] args) {

        // pour le factorielle de 21 il affiche 19 chiffre et c'est un nombre négatif
        int number = 21;
        long result = 1;

        while (number > 1) {
            result = result * number;

            if (result < 0) {
                System.out.println("Erreur !");
            } else if (result == 0) {
                result = 1;
                System.out.println(result);
            } else {
                System.out.println(result);
            }
            number --;
        }



    }
}
