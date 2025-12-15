package javaCore.chapter02Condition.practice;

public class PracticeOperatorLogical {
    public static void main(String[] args) {

        boolean trueAndTrue   =  true && true;      // resultat true
        boolean trueAndFalse  =  true && false;    // resultat false
        boolean falseAndtrue   = false && true;   // resultat false
        boolean falseAndFalse = false && false;  // resultat false

        boolean trueOrTrue =  true  || true; // resultat true
        boolean trueOrFalse = true || false; // resultat true
        boolean falseOrTrue =  false  || true; // resultat true
        boolean falseOrFalse = false || false; // resultat false

        boolean notTrue  =  !true; // false
        boolean notFalse  =  !false; // true

        boolean trueAndTrueAndTrue  = true && true && true;  // true
        boolean trueAndTrueAndFalse = true && true && false; // false

        boolean trueOrTrueOrTrue = true  || true  || true; // true
        boolean trueOrTrueOrFalse = true || true || false; // true

        boolean notNotTrue  =  !!true; // true
        boolean notNotFalse  =  !!false; // false


        boolean isLoggedIn = true;
        int age = 25;
        int seatsAvailable = 40;
        boolean isPremiumMember = false; // es ce que c'est une client VIP
        boolean isVIPFlight = false; // es ce que c'est un vol reservé aux VIP


        if (isLoggedIn && age >= 18 && seatsAvailable > 0 && (!isVIPFlight || isPremiumMember)) {
            System.out.println("reservation effectué avec succé !");

        } else {
            System.out.println("impossible de réservé !");

        }


    }
}
