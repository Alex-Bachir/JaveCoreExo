package javaCore.chapter02Condition.exercice;

public class AgesBasedDiscount {
    public static void main(String[] args) {

        // <= 25  >= 65
        int age = 66;
        int seniorDiscount = 75;
        int youngDiscount = 25;
        // 37.5 et 12.5
        int price = 50;

        if (age >= 65) {
            double priceReductionSenior = price - ( price * seniorDiscount / 100);
            System.out.println("your age are " + age + " ans so your discount price is " + priceReductionSenior);

        } else if ( age <=25 ) {
            double priceReductionYoung = price - ( price * youngDiscount / 100);
            System.out.println("your age are " + age + " ans so your discount price is " +  priceReductionYoung);

        } else {
            System.out.println("your age are " + age + " ans so your price is " +  price);
        }



    }
}
