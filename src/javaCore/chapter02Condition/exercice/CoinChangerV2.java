package javaCore.chapter02Condition.exercice;

public class CoinChangerV2 {
    public static void main(String[] args) {

        // total de la facture à payer
        int totalBill  = 100;
        // montant que le client paye
        int amountPaid = 250;
        // montant restant à rendre.
        int amountDue = amountPaid - totalBill;


        final int BILLET_50_VALUE  = 50;
        final int BILLET_20_VALUE  = 20;
        final int BILLET_10_VALUE  = 10;
        final int BILLET_5_VALUE   =  5;
        final int BILLET_2_VALUE   =  2;
        final int BILLET_1_VALUE   =  1;

        int billet50StockAvailable = 2;
        int billet20StockAvailable = 4;
        int billet10StockAvailable = 5;
        int billet5StockAvailable  = 5;
        int billet2StockAvailable  = 15;
        int billet1StockAvailable  = 20;

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
            if (amountDue >= BILLET_50_VALUE && billet50StockAvailable > 0) {
                // Nombre de billet de 50 requis
                int requiredBillOf50  = amountDue / BILLET_50_VALUE;
                // ici on récupère ce que je peux réellement donner
                int billetToGive50    = billet50StockAvailable;
                // Si le nombre de billet à rendre est supérieur à ce que je peux donner réellement.
                // Je fais en sorte de donner tout mon stock puis on passe au billet inférieur.
                if (requiredBillOf50  > billetToGive50) {
                    amountDue -= billetToGive50 * BILLET_50_VALUE;
                    System.out.println("J'ai rendu " + billetToGive50 + " billet de 50€ et il reste " + amountDue + " euros à rendre. #Note : Sécurité remettre du stock car on à atteint 0.");
                    // ici dans le cas où le stock de billet est supérieur à ce qu'il faut donner c'est le cas classique.
                } else {
                    amountDue = amountDue % BILLET_50_VALUE;
                    System.out.println("j'ai rendu " + requiredBillOf50 + " billet de 50e et il reste " + amountDue + " euros à rendre.");
                }
            }
            if (amountDue >= BILLET_20_VALUE && billet20StockAvailable > 0) {
                int requiredBillOf20 = amountDue / BILLET_20_VALUE;
                int billetToGive20   = billet20StockAvailable;
                if (requiredBillOf20 > billetToGive20) {
                    amountDue -= billetToGive20 * BILLET_20_VALUE;
                    System.out.println("j'ai rendu " + billetToGive20 + " billet de 20e et il reste " + amountDue + " euros à rendre. #Note : Sécurité remettre du stock car on à atteint 0.");
                    } else {
                    amountDue  = amountDue % BILLET_20_VALUE;
                    System.out.println("j'ai rendu " + requiredBillOf20 + " billet de 20e et il reste " + amountDue + " euros à rendre.");
                    }
            }
            if (amountDue >= BILLET_10_VALUE && billet10StockAvailable > 0) {
                int requiredBillOf10 = amountDue / BILLET_10_VALUE;
                int billetToGive10   = billet10StockAvailable;
                if (requiredBillOf10 > billetToGive10) {
                    amountDue -= billetToGive10 * BILLET_10_VALUE;
                    System.out.println("j'ai rendu " + billetToGive10 + " billet de 10e et il reste " + amountDue + " euros à rendre. #Note : Sécurité remettre du stock car on à atteint 0.");
                } else {
                    amountDue  = amountDue % BILLET_10_VALUE;
                    System.out.println("j'ai rendu " + requiredBillOf10 + " billet de 10e et il reste " + amountDue + " euros à rendre.");
                }
            }
            if (amountDue >= BILLET_5_VALUE && billet5StockAvailable > 0) {
                int requiredBillOf5 = amountDue / BILLET_5_VALUE;
                int billetToGive5   = billet5StockAvailable;
                if (requiredBillOf5 > billetToGive5) {
                    amountDue -= billetToGive5 * BILLET_5_VALUE;
                    System.out.println("j'ai rendu " + billetToGive5 + " billet de 5e et il reste " + amountDue + " euros à rendre. #Note : Sécurité remettre du stock car on à atteint 0.");
                } else {
                    amountDue  = amountDue % BILLET_5_VALUE;
                    System.out.println("j'ai rendu " + requiredBillOf5 + " billet de 5e et il reste " + amountDue + " euros à rendre.");
                }
            }
            if (amountDue >= BILLET_2_VALUE && billet2StockAvailable > 0) {
                int requiredBillOf2 = amountDue / BILLET_2_VALUE;
                int billetToGive2   = billet2StockAvailable;
                if (requiredBillOf2 > billetToGive2) {
                    amountDue -= billetToGive2 * BILLET_2_VALUE;
                    System.out.println("j'ai rendu " + billetToGive2 + " pièce de 2e et il reste " + amountDue + " euros à rendre. #Note : Sécurité remettre du stock car on à atteint 0.");
                } else {
                    amountDue  = amountDue % BILLET_2_VALUE;
                    System.out.println("j'ai rendu " + requiredBillOf2 + " pièce de 2e et il reste " + amountDue + " euros à rendre.");
                }
            }
            if (amountDue >= BILLET_1_VALUE && billet1StockAvailable > 0) {
                int requiredBillOf1 = amountDue / BILLET_1_VALUE;
                int billetToGive1   = billet1StockAvailable;
                if (requiredBillOf1 > billetToGive1) {
                    amountDue -= billetToGive1 * BILLET_1_VALUE;
                    System.out.println("j'ai rendu " + billetToGive1 + " pièce de 1e et il reste " + amountDue + " euros à rendre. #Note : Sécurité remettre du stock car on à atteint 0.");
                } else {
                    amountDue  = amountDue % BILLET_1_VALUE;
                    System.out.println("j'ai rendu " + requiredBillOf1 + " pièce de 1e et il reste " + amountDue + " euros à rendre.");
                }
            }


        }
    }
}

