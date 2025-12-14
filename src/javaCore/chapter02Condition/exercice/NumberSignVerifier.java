package javaCore.chapter02Condition.exercice;

public class NumberSignVerifier {
    public static void main(String[] args) {

        int number = -56;

        if ( number > 0) {
            System.out.println(number + " est positive");
        } else if (number == 0){
            System.out.println(number + " is equal to 0");
        } else {
            System.out.println(number + " is negative");
        }



    }
}
