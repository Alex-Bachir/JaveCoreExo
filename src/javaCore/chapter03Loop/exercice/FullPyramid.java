package javaCore.chapter03Loop.exercice;

public class FullPyramid {
    public static void main(String[] args) {

        int limit = 5;

// Montante
        for (int montante = 1; montante <= limit; montante++) {
            // je ne sais pas comment appeler la variable..
            for (int j = 1; j <= montante; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

// Descendante
        // on démarre à 4 pour evité le doublon
        for (int descendante = limit - 1; descendante >= 1; descendante--) {
            for (int j = 1; j <= descendante; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
