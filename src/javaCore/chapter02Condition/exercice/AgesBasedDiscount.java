package javaCore.chapter02Condition.exercice;

public class AgesBasedDiscount {
    public static void main(String[] args) {
        // <= 25  >= 65
        int age = 66;

        // 37.5 et 12.5
        int price = 50;

        if (age >= 65) {
            double priceReductionVieux = price * 0.75;
            System.out.println("Votre age est de : " + age + " alors votre tarif sera de : " + priceReductionVieux);
        } else if ( age <=25 ) {
            double priceReductionJeune = price * 0.25;
            System.out.println("Votre age est de : " + age + " alors votre tarif sera de : " +  priceReductionJeune);
        } else {
            System.out.println("Votre age est de : " + age + " alors votre tarif sera de : " +  price);
        }



    }
}
