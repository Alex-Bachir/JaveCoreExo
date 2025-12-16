package javaCore.chapter02Condition.exercice;

public class MaxOfThree {
    public static void main(String[] args) {

        int a = 7;
        int b = 6;
        int c = 4;

        // ABC
        if (a < b && a < c && b < c) {
            System.out.println(" Du plus petit au plus grand " + a + " " + b + " " + c);
        }
        // ACB
        if (a < b && a < c && b > c) {
            System.out.println(" Du plus petit au plus grand " + a + " " + c + " " + b);
        }
        // BAC
        if (b < a && a < c && b < c) {
            System.out.println(" Du plus petit au plus grand " + b + " " + a + " " + c);
        }
        // BCA
        if(b < c && c < a && a > c) {
            System.out.println(" Du plus petit au plus grand " + b + " " + c + " " + a);
        }
        // CAB
        if(c < a && a < b && a < b) {
            System.out.println(" Du plus petit au plus grand " + c + " " + a + " " + b);
        }
        // CBA
        if (c < b && b < a && a >b) {
            System.out.println(" Du plus petit auplus grand " + c + " " + b + " " + a);
        }

    }

}
