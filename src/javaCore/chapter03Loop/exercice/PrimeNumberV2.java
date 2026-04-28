package javaCore.chapter03Loop.exercice;

public class PrimeNumberV2 {

    public static void main(String[] args) {


        //        Il y a 25 nombres premiers entre 1 et 100 :
//        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
//

        // premiere étape on itère jusqu'à 100.
        for (int potentialFirstNumber = 2; potentialFirstNumber <= 100; potentialFirstNumber++) {
            // on crée un compteur initialisé à 0.
            int count = 0;
            int iterationCount = 1;
            // la boucle imbriquée récupére le chiffre et fait une verification jusqu'à qu'il trouve un diviseur,
            // on incrémente count à chaque fois qu'on trouve un diviseur avec lequel il n'y'a pas de reste.
            for (int potentialDivisor = 2; potentialDivisor < potentialFirstNumber; potentialDivisor++) {
                iterationCount++;
                if (potentialFirstNumber % potentialDivisor == 0) {
                    count++;

                }
            }
            // On conclut, si on n'a pas trouvé de diviseur alors c'est un nombre premier
            if (count == 0) {
                if (potentialFirstNumber < 10) {
                    System.out.println("Le chiffre " + potentialFirstNumber + " est ");
                }
                System.out.println(potentialFirstNumber + " " + iterationCount +" ");
            }
        }
    }
}
