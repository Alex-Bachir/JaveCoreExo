package javaCore.Chapter04Function.exercise;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        // la déclaration de itérationCount va servir de compteur pour les nombre premier
        int iterationCount = 1;
        // la boucle va itérer jusqu'a 50
        for (int potentialFirstNumber = 2; potentialFirstNumber <= 50; potentialFirstNumber++) {
            // on appel la methode isPrimeNumber quand c'est true alors on affiche le nombre
            if (isPrimeNumber(potentialFirstNumber))
                // la premiere itération n'est pas adapter c'est pas grave x)
                System.out.println(potentialFirstNumber + " est le " + iterationCount++ + "ème nombre premier.");            }
        }


    // la méthode et un boolean
    public static boolean isPrimeNumber(int potentialFirstNumber) {
        // retourne false dès qu'un diviseur est trouvé, true si aucun diviseur trouvé après la boucle
        for (int potentialDivisor = 2; potentialDivisor < potentialFirstNumber; potentialDivisor++) {

            if (potentialFirstNumber % potentialDivisor == 0) {

                return false;
            }
        }

        return true;
    }
}
