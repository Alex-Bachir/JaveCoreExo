package javaCore.chapter02Condition.exercice;

public class CoinChangerV2 {
    public static void main(String[] args) {

        // total de la facture à payer
        int totalBill  = 66;
        // montant que le client paye
        int amountPaid = 72;
        // montant restant à rendre.
        int amountDue = amountPaid - totalBill;
        // nombre de billet ou piece à rendre
        int billChange =  0;

        final int BILLET_50_VALUE = 50;
        final int BILLET_20_VALUE = 20;
        final int BILLET_10_VALUE = 10;
        final int BILLET_5_VALUE  =  5;
        final int BILLET_2_VALUE  =  2;
        final int BILLET_1_VALUE =  1;

        int billet50StockAvailable = 8;
        int billet20StockAvailable = 7;
        int billet10StockAvailable = 6;
        int billet5StockAvailable = 5;
        int billet2StockAvailable = 9;
        int billet1StockAvailable = 8;

        int cashLeft = ((BILLET_50_VALUE  *  billet50StockAvailable) +
                        (BILLET_20_VALUE  *  billet20StockAvailable) +
                        (BILLET_10_VALUE  *  billet10StockAvailable) +
                        (BILLET_5_VALUE   *  billet5StockAvailable)  +
                        (BILLET_2_VALUE   *  billet2StockAvailable)  +
                        (BILLET_1_VALUE   *  billet1StockAvailable));

        if (amountDue > cashLeft) {
            System.out.println("La capacité à rendre la monnaie est insuffisante.");
        } else if (amountDue == 0) {
                System.out.println("La facture à était payé dans sa totalité.");
        } else {
            if (amountDue >= BILLET_50_VALUE) {
                billChange  = amountDue / BILLET_50_VALUE;
                amountDue    = amountDue % BILLET_50_VALUE;
                System.out.println("j'ai rendu " + billChange + " billet de 50e et il reste " + amountDue + " euros à rendre.");
            }

            if (amountDue >= BILLET_20_VALUE) {
                billChange  = amountDue / BILLET_20_VALUE;
                amountDue    = amountDue % BILLET_20_VALUE;
                System.out.println("j'ai rendu " + billChange + " billet de 20e et il reste " + amountDue + " euros à rendre.");
            }

            if (amountDue >= BILLET_10_VALUE) {
                billChange  = amountDue / BILLET_10_VALUE;
                amountDue    = amountDue % BILLET_10_VALUE;
                System.out.println("j'ai rendu " + billChange + " billet de 10e et il reste " + amountDue + " euros à rendre.");
            }

            if (amountDue >= BILLET_5_VALUE) {
                billChange  = amountDue / BILLET_5_VALUE;
                amountDue    = amountDue % BILLET_5_VALUE;
                System.out.println("j'ai rendu " + billChange + " billet de 5e et il reste " + amountDue + " euros à rendre.");
            }

            if (amountDue >= BILLET_2_VALUE) {
                billChange  = amountDue / BILLET_2_VALUE;
                amountDue    = amountDue % BILLET_2_VALUE;
                System.out.println("J'ai rendu " + billChange + " piece de 2 euros et il reste " + amountDue + " euros à rendre.");
            }

            if (amountDue >= BILLET_1_VALUE) {
                billChange  = amountDue / BILLET_1_VALUE;
                amountDue    = amountDue % BILLET_1_VALUE;
                System.out.println("J'ai rendu " + billChange + "piece de 1 euros et il reste " + amountDue+ " euros à rendre.");
            }
        }
    }
}

