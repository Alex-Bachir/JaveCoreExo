package javaCore.chapter02Condition.exercice;

public class FibonacciCalculator {
    public static void main(String[] args) {

        long firstInitialTerm   = 0;
        long secondInitialTerm  = 1;
        int  countPair   = 0;
        int  countImpair = 0;


        for (int i = 0; i <= 50; i++) {
            long temporaryTerm = firstInitialTerm + secondInitialTerm;
            firstInitialTerm = secondInitialTerm;
            secondInitialTerm = temporaryTerm;
            if (temporaryTerm % 2 == 0) {
                System.out.println(temporaryTerm + "il est pair");
                countPair++;
            } else {
                System.out.println(temporaryTerm + "il est impair");
                countImpair++;
            }
        }

        System.out.println("Il y'a au total " + countPair + " chiffre pair." +
                " Il y'a au total " + countImpair + " chiffre impair.");



    }
}
