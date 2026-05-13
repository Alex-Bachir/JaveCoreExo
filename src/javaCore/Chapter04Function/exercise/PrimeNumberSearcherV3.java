package javaCore.Chapter04Function.exercise;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {


        int iterationCount = 1;

        for (int potentialFirstNumber = 2; potentialFirstNumber <= 50; potentialFirstNumber++) {

            if (isPrimeNumber( potentialFirstNumber)) {

                    System.out.println("Le chiffre " + potentialFirstNumber + " est le numero " + iterationCount++ + " des nombres premier.");
            }
        }



    }

    public static boolean isPrimeNumber(int potentialFirstNumber) {

        for (int potentialDivisor = 2; potentialDivisor < potentialFirstNumber; potentialDivisor++) {

            if (potentialFirstNumber % potentialDivisor == 0) {

                return false;
            }
        }

        return true;



    }
}
