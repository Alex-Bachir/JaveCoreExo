package javaCore.Chapter04Function.exercise.project.refactor;

public class AgeCategorizationFunctionRefactor {
    public static void AgeCategorizationFunction(int age) {

        if ( age < 10) {
            System.out.println("C'est un enfant.");
        } else if ( age >= 10 && age <= 18) {
            System.out.println("C'est un adolescent.");
        } else if ( age >= 18 && age <= 25) {
            System.out.println("C'est un jeune adulte.");
        } else if ( age >= 25 && age <= 65) {
            System.out.println("C'est un adulte.");
        } else {
            System.out.println("C'est un senior.");
        }
    }
}
