package javaCore.chapter02Condition.exercice;

public class CoinChangerV1 {
    public static void main(String[] args) {

        // total de la facture à payer
        int totalBill = 66;
        // montant que le client paye
        int amountPaid = 40;
        // montant restant à payer
        int cashLeft = 0;

        // ici la condition sert quand le montant à payer est inférieur à la facture
        if (amountPaid < totalBill) {
            totalBill =  totalBill - amountPaid;
            cashLeft = amountPaid - totalBill;

        } else {
            cashLeft = amountPaid - totalBill;
        }
        // nombre de billet ou piece à rendre
        int billChange = 0;

        final int BILLET_50 = 50;
        final int BILLET_20 = 20;
        final int BILLET_10 = 10;
        final int BILLET_5  = 5;
        final int BILLET_2  = 2;
        final int BILLET_1  = 1;

        if(cashLeft >= BILLET_50) {
            billChange = cashLeft / BILLET_50;
            cashLeft    = cashLeft % BILLET_50;
            System.out.println("j'ai rendu " + billChange + " billet de 50e et il reste " + cashLeft);

        }

        if (cashLeft >= BILLET_20) {
            billChange = cashLeft / BILLET_20;
            cashLeft    = cashLeft % BILLET_20;
            System.out.println("j'ai rendu " + billChange + " billet de 20e et il reste " + cashLeft);

        }

        if (cashLeft >= BILLET_10) {
            billChange = cashLeft / BILLET_10;
            cashLeft    = cashLeft % BILLET_10;
            System.out.println("j'ai rendu " + billChange + " billet de 10e et il reste " + cashLeft);

        }

        if (cashLeft >= BILLET_5) {
            billChange = cashLeft / BILLET_5;
            cashLeft    = cashLeft % BILLET_5;
            System.out.println("j'ai rendu " + billChange + " billet de 5e et il reste " + cashLeft);

        }

        if (cashLeft >= BILLET_2) {
            billChange = cashLeft / BILLET_2;
            cashLeft    = cashLeft % BILLET_2;
            System.out.println("J'ai rendu " + billChange + " piece de 2 euros et il reste " + cashLeft);

        }

        if (cashLeft >= BILLET_1) {
            billChange = cashLeft / BILLET_1;
            cashLeft    = cashLeft % BILLET_1;
            System.out.println("J'ai rendu " + billChange + "piece de 1 euros et il reste " + cashLeft);
        }


    }
}












































































//        if (cashLeft  >= BILLET_50) {
//            billChange = cashLeft / BILLET_50;
//            cashLeft    = cashLeft % BILLET_50;
//        }
//
//        if (cashLeft  >= BILLET_20) {
//            billChange = cashLeft / BILLET_20;
//            cashLeft    = cashLeft % BILLET_20;
//        }
//
//        if (cashLeft  >= BILLET_10) {
//            billChange = cashLeft / BILLET_10;
//            cashLeft    = cashLeft % BILLET_10;
//        }
//
//        if (cashLeft  >= BILLET_5) {
//            billChange = cashLeft / BILLET_5;
//            cashLeft    = cashLeft % BILLET_5;
//        }
//
//        if (cashLeft  >= BILLET_2) {
//            billChange = cashLeft / BILLET_2;
//            cashLeft    = cashLeft % BILLET_2;
//        }
//
//        if (cashLeft  >= BILLET_1) {
//            billChange = cashLeft / BILLET_1;
//            cashLeft    = cashLeft % BILLET_1;
//        }
//
//        System.out.println("j'ai rendu " + billChange + " billet de 50e et il reste " + cashLeft);
//        System.out.println("j'ai rendu " + billChange + " billet de 20e et il reste " + cashLeft);
//        System.out.println("j'ai rendu " + billChange + " billet de 10e et il reste " + cashLeft);
//        System.out.println("j'ai rendu " + billChange + " billet de 5e et il reste " + cashLeft);
//        System.out.println("J'ai rendu " + billChange + " piece de 2 euros et il reste " + cashLeft);
//        System.out.println("J'ai rendu " + billChange + "piece de 1 euros et il reste " + cashLeft);
//    }