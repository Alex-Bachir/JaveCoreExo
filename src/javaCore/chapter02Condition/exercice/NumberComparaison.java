package javaCore.chapter02Condition.exercice;

public class NumberComparaison {
    public static void main(String[] args) {

        int number1 = 32;
        int number2 = 35;
        // ici j'ai mis du temps a comprendre que d'avoir >= ne permettais pas d'atteindre la 3eme condition
        // il a fallut que je bascule sur un operateur strict
        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number2 > number1) {
            System.out.println(number2 + " is greater than " + number1);
        } else {
            System.out.println(number1 + " is equal than " + number2);
        }



    }
}
