package javaCore.chapter03Loop.practice;

public class practiceLoopFor {

    public static void main (String[] args) {
        int resultFor = 0;
        for (int cNumber = 1 ; cNumber <= 100 ; cNumber++) {
            System.out.println("Result = " + resultFor + " + " + cNumber);
            resultFor += cNumber;
            System.out.println("-----> " + resultFor);
        }

        for (int a = 1 ; a <= 100 ; a++) {

            if (a % 2 == 0) {

                int resultForIf = 0;

                for (int b = 1; b <= a ; b++) {
                    resultForIf += b;
                }
                System.out.println("Somme des nombres entre 1 et " + a + " : " + resultForIf);
            } else {
                System.out.println("Le nombre suivant est impair : " + a);
            }
        }

    }
}
