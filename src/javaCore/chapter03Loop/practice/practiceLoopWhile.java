package javaCore.chapter03Loop.practice;

public class practiceLoopWhile {
    public static void main(String[] args) {

        int age = 25;


        if (age < 18) {
            System.out.println("Condition + age = " + age);
        }

        while (age < 18) {
            System.out.println("Boucle + age = " + age);
        }
        System.out.println("On est sortis de la boucle");


        int results = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        System.out.println(results);

        int result = 0;
        int nombre = 0;
        int maxNumber = 100;

        while (nombre <= maxNumber) {

            result += nombre;
            nombre ++;
        }
        System.out.println("Result: " + result);
    }
}
