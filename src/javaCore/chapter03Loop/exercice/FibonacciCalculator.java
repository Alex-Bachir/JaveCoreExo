package javaCore.chapter03Loop.exercice;

public class FibonacciCalculator {
    public static void main(String[] args) {

        long firstInitialTerm   = 0;
        long secondInitialTerm  = 1;

        // va servir pour compter combien il y'a de nombre pair ou impair

        int  countPair   = 0;
        int  countImpair = 0;

        // boucle for car on va itérer jusqu'a 50 à chaque itération firstInitialTerm prend la valeur de secondInitialTerm
        // et pareil pour secondInitialTerm qui prend la valeur de temporaryTerm
        // temporaryTerm et le résultat du premier et deuxième terme
        // si le résultat et pair ou impair alors, on incrémente
        // et a la fin, on comptabilise les nombres pair et impair

        for (int number = 0; number <= 50; number++) {
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
                           "Il y'a au total " + countImpair + " chiffre impair.");



    }
}
