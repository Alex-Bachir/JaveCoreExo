package javaCore.Chapter04Function.exercise;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {


        int iterationCount = 1;

        for (int potentialFirstNumber = 2; potentialFirstNumber <= 50; potentialFirstNumber++) {
            int count = 0;

            for (int potentialDivisor = 2; potentialDivisor < potentialFirstNumber; potentialDivisor++) {

                if (potentialFirstNumber % potentialDivisor == 0) {
                    count++;
                }
            }

            if (count == 0) {
                if (potentialFirstNumber < 50) {
                    System.out.println("Le chiffre " + potentialFirstNumber + " est le numero " + iterationCount++ + " des nombres premier.");
                }
            }
        }
    }
}
