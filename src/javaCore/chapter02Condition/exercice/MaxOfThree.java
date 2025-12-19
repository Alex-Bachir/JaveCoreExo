package javaCore.chapter02Condition.exercice;

public class MaxOfThree {
    public static void main(String[] args) {

        int a = 7;
        int b = 6;
        int c = 9;

        // Tester toutes les possibilités
        // ABC
        if (a < b && a < c && b < c) {
            System.out.println(" Du plus petit au plus grand " + a + " " + b + " " + c);
        }
        // ACB
        else if (a < b && a < c && b > c) {
            System.out.println(" Du plus petit au plus grand " + a + " " + c + " " + b);
        }
        // BAC
        else if (b < a && a < c && b < c) {
            System.out.println(" Du plus petit au plus grand " + b + " " + a + " " + c);
        }
        // BCA
        else if(b < c && c < a && a > c) {
            System.out.println(" Du plus petit au plus grand " + b + " " + c + " " + a);
        }
        // CAB
        else if(c < a && a < b && a < b) {
            System.out.println(" Du plus petit au plus grand " + c + " " + a + " " + b);
        }
        // CBA
        else if (c < b && b < a && a >b) {
            System.out.println(" Du plus petit auplus grand " + c + " " + b + " " + a);
        }
        else {
            System.out.println("Erreur : cas impossible");
        }

    }

}
