package javaCore.chapter02Condition.exercice;

public class CoinChangerV2 {
    public static void main(String[] args) {

        final int BILLET_50_VALUE = 50;
        final int BILLET_20_VALUE = 20;
        final int BILLET_10_VALUE = 10;
        final int BILLET_5_VALUE  =  5;
        final int BILLET_2_VALUE  =  2;
        final int BILLET_1_VALUE  =  1;

        int totalBill = 100;
        int amountPaid = 250;
        int amountDue = amountPaid - totalBill;

        int billet_50_StockAvailable =  2;
        int billet_20_StockAvailable =  4;
        int billet_10_StockAvailable =  5;
        int billet_5_StockAvailable  =  5;
        int billet_2_StockAvailable  = 15;
        int billet_1_StockAvailable  = 20;

        int cashLeft = ((BILLET_50_VALUE * billet_50_StockAvailable) +
                        (BILLET_20_VALUE * billet_20_StockAvailable) +
                        (BILLET_10_VALUE * billet_10_StockAvailable) +
                        (BILLET_5_VALUE * billet_5_StockAvailable)   +
                        (BILLET_2_VALUE * billet_2_StockAvailable)   +
                        (BILLET_1_VALUE * billet_1_StockAvailable));

        if (amountDue == 0) {
            System.out.println("La facture à était payé dans sa totalité.");
        } else if (amountDue > cashLeft) {
            System.out.println("La capacité à rendre la monnaie est insuffisante.");
        } else {
            if (amountDue >= BILLET_50_VALUE && billet_50_StockAvailable > 0) {
                int requiredBillOf_50 = amountDue / BILLET_50_VALUE;
                if (requiredBillOf_50 > billet_50_StockAvailable) {
                    requiredBillOf_50 = billet_50_StockAvailable;
                }
                amountDue -= requiredBillOf_50 * BILLET_50_VALUE;
                System.out.println("J'ai rendu " + requiredBillOf_50 + " billet de " + BILLET_50_VALUE + ". Il reste à rendre " + amountDue + " euros.");

                if (amountDue >= BILLET_20_VALUE && billet_20_StockAvailable > 0) {
                    int requiredBillOf_20 = amountDue / BILLET_20_VALUE;
                    if (requiredBillOf_20 > billet_20_StockAvailable) {
                        requiredBillOf_20 = billet_20_StockAvailable;
                    }
                    amountDue -= requiredBillOf_20 * BILLET_20_VALUE;
                    System.out.println("J'ai rendu " + requiredBillOf_20 + " billet de " + BILLET_20_VALUE + ". Il reste à rendre " + amountDue + " euros.");

                }
                if (amountDue >= BILLET_10_VALUE && billet_10_StockAvailable > 0) {
                    int requiredBillOf_10 = amountDue / BILLET_10_VALUE;
                    if (requiredBillOf_10 > billet_10_StockAvailable) {
                        requiredBillOf_10 = billet_10_StockAvailable;
                    }
                    amountDue -= requiredBillOf_10 * BILLET_10_VALUE;
                    System.out.println("J'ai rendu " + requiredBillOf_10 + " billet de " + BILLET_10_VALUE + ". Il reste à rendre " + amountDue + " euros.");

                }
                if (amountDue >= BILLET_5_VALUE && billet_5_StockAvailable > 0) {
                    int requiredBillOf_5 = amountDue / BILLET_5_VALUE;
                    if (requiredBillOf_5 > billet_5_StockAvailable) {
                        requiredBillOf_5 = billet_5_StockAvailable;
                    }
                    amountDue -= requiredBillOf_5 * BILLET_5_VALUE;
                    System.out.println("J'ai rendu " + requiredBillOf_5 + " billet de " + BILLET_5_VALUE + ". Il reste à rendre " + amountDue + " euros.");

                }
                if (amountDue >= BILLET_2_VALUE && billet_2_StockAvailable > 0) {
                    int requiredBillOf_2 = amountDue / BILLET_2_VALUE;
                    if (requiredBillOf_2 > billet_2_StockAvailable) {
                        requiredBillOf_2 = billet_2_StockAvailable;
                    }
                    amountDue -= requiredBillOf_2 * BILLET_2_VALUE;
                    System.out.println("J'ai rendu " + requiredBillOf_2 + " billet de " + BILLET_2_VALUE + ". Il reste à rendre " + amountDue + " euros.");

                }
                if (amountDue >= BILLET_1_VALUE && billet_1_StockAvailable > 0) {
                    int requiredBillOf_1 = amountDue / BILLET_1_VALUE;
                    if (requiredBillOf_1 > billet_1_StockAvailable) {
                        requiredBillOf_1 = billet_1_StockAvailable;
                    }
                    amountDue -= requiredBillOf_1 * BILLET_1_VALUE;
                    System.out.println("J'ai rendu " + requiredBillOf_1 + " billet de " + BILLET_1_VALUE + ". Il reste à rendre " + amountDue + " euros.");
                }
            }
        }
    }
}
