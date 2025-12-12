package javaCore.chapter02Condition.exercice;

public class CoinChangerV1 {
    public static void main(String[] args) {

        int totalBill = 64;
        int amountPaid = 200;
        int restARendre = 0;

        if (amountPaid >= 50) {
            int rest = amountPaid - totalBill;
            int nbBillet = rest / 50;
            restARendre =  rest - (50 * nbBillet);
            System.out.println("La machine rends " + nbBillet + " billets de 50 euros. Il reste " + restARendre + " euros.");

        }

        if(restARendre >= 20){
            int nbBillet = restARendre / 20;
            restARendre = restARendre - (20 * nbBillet);
            System.out.println("La machine rends " + nbBillet + " billets de 20 euros. Il reste " + restARendre + " euros.");


        }

        if(restARendre >= 10){
            int nbBillet = restARendre / 10;
            restARendre = restARendre - (10 * nbBillet);
            System.out.println("La machine rends " + nbBillet + " billets de 10 euros. Il reste " + restARendre + " euros.");
        }

        if(restARendre >= 5){
            int nbBillet = restARendre / 5;
            restARendre = restARendre - (5 * nbBillet);
            System.out.println("La machine rends " + nbBillet + " billets de 5 euros. Il reste " + restARendre + " euros.");
        }

        if(restARendre >= 2){
            int nbBillet = restARendre / 2;
            restARendre = restARendre - (2 * nbBillet);
            System.out.println("La machine rends " + nbBillet + " piece de 2 euros. Il reste " + restARendre + " euros.");
        }

        if(restARendre >= 1){
            int nbBillet = restARendre / 1;
            restARendre = restARendre - (1 * nbBillet);
            System.out.println("La machine rends " + nbBillet + " piece de 1 euros. Il reste " + restARendre + " euros.");
        }


























































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

