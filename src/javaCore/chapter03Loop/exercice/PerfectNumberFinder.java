package javaCore.chapter03Loop.exercice;

public class PerfectNumberFinder {
    public static void main (String[] args) {

        // pour 100    : 6 et 28          sont des nombres parfaits
        // pour 1000   : 6 28 et 496      sont des nombres parfaits
        // pour 10000  : 6 28 496 et 8128 sont des nombres parfaits
        // pour 100000 : 6 28 496 et 8128 sont des nombres parfaits
        int start = 1;
        int end   = 100000;

        for (int potentialPerfectNumber = start;  potentialPerfectNumber <= end; potentialPerfectNumber++) {
            //ici, on accumule les diviseurs pour l'utiliser ensuite en comparant le resultat et la somme des diviseurs et si c'est égale alors c'est un
            // nombre parfait
            int somme = 0;

            for (int potentialDivisor = 1; potentialDivisor < potentialPerfectNumber; potentialDivisor++) {
                if (potentialPerfectNumber % potentialDivisor == 0) {
                    somme += potentialDivisor;
                }
            }

            if (somme == potentialPerfectNumber) {
                System.out.println(potentialPerfectNumber);
            }
        }
    }
}
