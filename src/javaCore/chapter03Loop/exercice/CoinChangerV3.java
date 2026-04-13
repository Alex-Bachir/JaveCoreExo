package javaCore.chapter03Loop.exercice;

public class CoinChangerV3 {
    public static void main(String[] args) {
        // total de la facture à payer
        int totalBill  = 66;
        // montant que le client paye
        int amountPaid = 72;
        // montant restant à payer
        int cashLeft   =  0;
        // nombre de billet ou piece à rendre
        int billChange =  0;

        if (amountPaid < totalBill) {
            totalBill =  totalBill - amountPaid;
            cashLeft  = amountPaid - totalBill;

        } else {
            cashLeft = amountPaid - totalBill;
        }

        Integer[] billetChangeValue = {50, 20, 10, 5, 2, 1};

        for(int i = 0; i < billetChangeValue.length; i++){
            if(cashLeft >= billetChangeValue[i]) {
                cashLeft -= billetChangeValue[i];
                System.out.println("j'ai rendu un billet de " + billetChangeValue[i] + " euros et il reste " + cashLeft + " euros à rendre.");
            }
        }


    }
}
