package javaCore.chapter02Condition.exercice;

public class CoinChangerV1 {
    public static void main(String[] args) {

        // total de la facture à payer
        int totalBill        = 100;
        // montant que le client paye
        int amountPaid   = 174;
        // montant restant à payer
        int cashLeft       = amountPaid - totalBill;
        // nombre de billet ou piece à rendre
        int billChange    = 0;

        if (cashLeft  >= 50) {
            billChange = cashLeft / 50;
            cashLeft    = cashLeft % 50;
            System.out.println("j'ai rendu " + billChange + " billet de 50e et il reste " + cashLeft);        }

        if (cashLeft  >= 20) {
            billChange = cashLeft / 20;
            cashLeft    = cashLeft % 20;
            System.out.println("j'ai rendu " + billChange + " billet de 20e et il reste " + cashLeft);        }

        if (cashLeft  >= 10) {
            billChange = cashLeft / 10;
            cashLeft    = cashLeft % 10;
            System.out.println("j'ai rendu " + billChange + " billet de 10e et il reste " + cashLeft);        }

        if (cashLeft  >= 5) {
            billChange = cashLeft / 5;
            cashLeft    = cashLeft % 5;
            System.out.println("j'ai rendu " + billChange + " billet de 5e et il reste " + cashLeft);
        }

        if (cashLeft  >= 2) {
            billChange = cashLeft / 2;
            cashLeft    = cashLeft % 2;
            System.out.println("J'ai rendu " + billChange + " piece de 2 euros et il reste " + cashLeft);
        }

        if (cashLeft  >= 1) {
            billChange = cashLeft / 1;
            cashLeft    = cashLeft % 1;
            System.out.println("J'ai rendu " + billChange + "piece de 1 euros et il reste " + cashLeft);
        }
    }
}

