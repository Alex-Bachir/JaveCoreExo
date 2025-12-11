package javaCore.chapter02Condition.exercice;

public class NumberSignVerifier {
    public static void main(String[] args) {

        int number = -56;

        if ( number > 0) {
            System.out.println(number + " est positif");
        } else if (number == 0){
            System.out.println(number + " est egale a zero");
        } else {
            System.out.println(number + " est negative");
        }



    }
}
