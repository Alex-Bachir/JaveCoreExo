package javaCore.chapter02Condition.exercice;

public class CoinChangerV1 {
    public static void main(String[] args) {

        int totalBill = 64;
        int amountPaid = 200;
        int cashReturn = 0;

        // If amount paid is greater than or equal to 50 euros.
        if (amountPaid >= 50) {
            // Calculate the total  change to return.
            int cashLeft = amountPaid - totalBill;
            // Calculate how many 50€ bills we can return.
            int cashCount = cashLeft / 50;
            // Calculate what's left after returning the 50€ bills.
            cashReturn =  cashLeft - (50 * cashCount);
            // Display the number of bills returned and the remaining change.
            System.out.println("The machine returns " + cashCount + " bills of 50 euros. There are " + cashReturn + " euros left.");

        }

        // If cashReturn is greater than or equal to 20 euros.
        if (cashReturn >= 20) {
            // Calculate how many 20€ bills we can return.
            int cashCount = cashReturn / 20;
            // Calculate what's left after returning the 20€ bills.
            cashReturn = cashReturn - (20 * cashCount);
            // Display the number of bills returned and the remaining change.
            System.out.println("The machine returns " + cashCount + " bills of 20 euros. There are " + cashReturn + " euros left.");
        }

        // If cashReturn is greater than or equals to 10 euros.
        if (cashReturn >= 10) {
            // Calculate how many 10€ bills we can return.
            int cashCount = cashReturn / 10;
            // Calculate what's left after returning the 10€ bills.
            cashReturn = cashReturn - (10 * cashCount);
            // Display the number of bills returned and the remaining change.
            System.out.println("The machine returns " + cashCount + " bills of 10 euros. There are " + cashReturn + " euros left.");        }

        // If cashReturn is greater than or equals to 5€.
        if (cashReturn >= 5) {
            // Calculate how many 5€ bills we can return.
            int cashCount = cashReturn / 5;
            //Calculate what's left after returning the 5€ bills.
            cashReturn = cashReturn - (5 * cashCount);
            // Display the number of bills returned and the remaining change.
            System.out.println("The machine returns " + cashCount + " bills of 5 euros. There are " + cashReturn + " euros left.");        }

        // If cashReturn is greater than or equals to 2€.
        if (cashReturn >= 2) {
            // Calculate how many 2€ bills we can return.
            int cashCount = cashReturn / 2;
            // Calculate what's left after returning 2€ bills.
            cashReturn = cashReturn - (2 * cashCount);
            // Display the number of bills returned and the remaining change.
            System.out.println("The machine returns " + cashCount + " bills of 2 euros. There are " + cashReturn + " euros left.");        }

        // If cashReturn is greater than or equals to 1€.
        if (cashReturn >= 1) {
            // Calculate how many 1€ bills we can return.
            int cashCount = cashReturn / 1;
            // Calculate what's left after returning 1€ bills.
            cashReturn = cashReturn - (1 * cashCount);
            // Display the number of bills returned and the remaining change.
            System.out.println("The machine returns " + cashCount + " bills of 1 euros. There are " + cashReturn + " euros left.");

        // If cashReturn equals zero
        if (cashReturn == 0) {
            // Display "The machine has returned all the change."
            System.out.println("The machine has returned all the change.");
        }

        }
























































//  ici j'ai laissé ma première tentative

        // 12 25 37 58 87 241 305
        // 1 2 5 10 20 50
//        int totalBill = 141;
//        int amountPaid = 200;
//        int rest = 0;
//        int rest1 = 0;
//        int rest2 = 0;
//        int rest3 = 0;
//
//
//        int montantARendre = amountPaid - totalBill;
//        if (montantARendre >= 50) {
//            int nbBillet = montantARendre / 50;
//            rest = montantARendre % 50;
//            System.out.println("le nombre de billet de 50 à rendre est de : " + nbBillet + " et il reste a rendre : " + rest);
//        }
//
//
//        if (rest >= 20) {
//            int nbBillet = rest / 20;
//            rest1 = rest % 20;
//            System.out.println("le nombre de billet de 20 à rendre est de : " + nbBillet + " et il reste a rendre : " + rest1);
//        }
//
//        if (rest1 >= 10) {
//            int  nbBillet = rest1 / 10;
//            rest2 =  rest1 % 10;
//            System.out.println("le nombre de billet de 10 à rendre est de : " + nbBillet + " et il reste a rendre : " + rest2);
//        }
//
//        if (rest2 >= 5) {
//            int  nbBillet = rest2 / 5;
//            rest3 = rest2 % 5;
//            System.out.println("le nombre de billet de 10 à rendre est de : " + nbBillet + " et il reste a rendre : " + rest3);
//        }

        }


    }

