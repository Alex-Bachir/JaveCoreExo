package javaCore.chapter02Condition.exercice;

public class CoinChangerV2 {
    public static void main(String[] args) {

        final int BILLET_50 = 50;
        final int BILLET_20 = 20;
        final int BILLET_10 = 10;
        final int BILLET_5  =  5;
        final int BILLET_2  =  2;
        final int BILLET_1  =  1;

        int billet50Count = 50;
        int billet20Count = 10;
        int billet10Count = 7;
        int billet5Count  = 21;
        int billet2Count  = 9;
        int billet1Count  = 10;

        // total de la facture à payer
        int totalBill  = 66;
        // montant que le client paye
        int amountPaid = 70;
        // montant restant à payer
        int cashLeft   =  0;
        // nombre de billet ou piece à rendre
        int billChange =  0;

        cashLeft  = amountPaid - totalBill;

        if (cashLeft >= BILLET_50 && billet50Count > 0) {
            cashLeft = cashLeft - BILLET_50;
            billet50Count --;
            System.out.println("J'ai rendu un billet de " + BILLET_50 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet50Count + " billet de 50 euros." );
            if (cashLeft >= BILLET_50 && billet50Count > 0) {
                cashLeft = cashLeft - BILLET_50;
                billet50Count --;
                System.out.println("J'ai rendu un billet de " + BILLET_50 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet50Count + " billet de 50 euros." );
            }
        }

        if (cashLeft >= BILLET_20 && billet20Count > 0) {
            cashLeft = cashLeft - BILLET_20;
            billet20Count --;
            System.out.println("J'ai rendu un billet de " + BILLET_20 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet20Count + " billet de 20 euros." );
            if (cashLeft >= BILLET_20 && billet20Count > 0) {
                cashLeft = cashLeft - BILLET_20;
                billet20Count --;
                System.out.println("J'ai rendu un billet de " + BILLET_20 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet20Count + " billet de 20 euros." );

            }
        }

        if (cashLeft >= BILLET_10 && billet10Count > 0) {
            cashLeft =  cashLeft - BILLET_10;
            billet10Count --;
            System.out.println("J'ai rendu un billet de " + BILLET_10 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet10Count + " billet de 10 euros." );
            if (cashLeft >= BILLET_10 && billet10Count > 0) {
                cashLeft = cashLeft - BILLET_10;
                billet10Count --;
                System.out.println("J'ai rendu un billet de " + BILLET_10 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet10Count + " billet de 10 euros." );

            }
        }

        if (cashLeft >= BILLET_5 && billet5Count > 0) {
            // je donne 1 billet car si je suis dans cette condition c'est que j'ai au moins 1 billet.
            cashLeft = cashLeft - (BILLET_5 * 1);
            // décompte
            billet5Count --;
            System.out.println("J'ai rendu un billet de " + BILLET_5 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet5Count + " billet de 5 euros." );
            if (cashLeft >= BILLET_5 && billet5Count > 0) {
                // je donne 1 billet car si je suis dans cette condition c'est que j'ai au moins 1 billet.
                cashLeft = cashLeft - (BILLET_5 * 1);
                // décompte
                billet5Count --;
                System.out.println("J'ai rendu un billet de " + BILLET_5 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet5Count + " billet de 5 euros." );
            }
        }

        if (cashLeft >= BILLET_2 &&  billet2Count > 0) {
            cashLeft = cashLeft - (BILLET_2 * 1);
            billet2Count --;
            System.out.println("J'ai rendu un pièce de " + BILLET_2 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet2Count + " pièce de 2 euros." );
            if (cashLeft >= BILLET_2 &&  billet2Count > 0) {
                cashLeft = cashLeft - (BILLET_2 * 1);
                billet2Count --;
                System.out.println("J'ai rendu un pièce de " + BILLET_2 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet2Count + " pièce de 2 euros." );
            }
            if (cashLeft >= BILLET_2 &&  billet2Count > 0) {
                cashLeft = cashLeft - (BILLET_2 * 1);
                billet2Count --;
                System.out.println("J'ai rendu un pièce de " + BILLET_2 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet2Count + " pièce de 2 euros." );
            }
            if (cashLeft >= BILLET_2 &&  billet2Count > 0) {
                cashLeft = cashLeft - (BILLET_2 * 1);
                billet2Count --;
                System.out.println("J'ai rendu un pièce de " + BILLET_2 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet2Count + " pièce de 2 euros." );
            }
        }

        if (cashLeft >= BILLET_1 &&  billet1Count > 0) {
            cashLeft = cashLeft - (BILLET_1 * 1);
            billet1Count --;
            System.out.println("J'ai rendu une pièce de " + BILLET_1 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet1Count + " pièce de 1 euros." );
            if (cashLeft >= BILLET_1 &&  billet1Count > 0) {
                cashLeft = cashLeft - (BILLET_1 * 1);
                billet1Count --;
                System.out.println("J'ai rendu un pièce de " + BILLET_1 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet1Count + " pièce de 1 euros." );
            }
            if (cashLeft >= BILLET_1 &&  billet1Count > 0) {
                cashLeft = cashLeft - (BILLET_1 * 1);
                billet1Count --;
                System.out.println("J'ai rendu un pièce de " + BILLET_1 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet1Count + " pièce de 1 euros." );
            }
            if (cashLeft >= BILLET_1 &&  billet1Count > 0) {
                cashLeft = cashLeft - (BILLET_1 * 1);
                billet1Count --;
                System.out.println("J'ai rendu un pièce de " + BILLET_1 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet1Count + " pièce de 1 euros." );
            }
            if (cashLeft >= BILLET_1 &&  billet1Count > 0) {
                cashLeft = cashLeft - (BILLET_1 * 1);
                billet1Count --;
                System.out.println("J'ai rendu un pièce de " + BILLET_1 + " euros. Il reste " + cashLeft + " euros à rendre. #Note : il reste " + billet1Count + " pièce de 1 euros." );
            }
        }
    }
}
