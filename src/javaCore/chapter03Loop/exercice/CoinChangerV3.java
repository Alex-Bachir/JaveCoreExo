package javaCore.chapter03Loop.exercice;

public class CoinChangerV3 {
    public static void main(String[] args) {
        // total de la facture à payer
        int totalBill  = 20;
        // montant que le client paye
        int amountPaid = 150;
        // montant restant à payer
        int cashLeft   =  0;
        // nombre de billet ou piece à rendre
        int billChange =  0;

        if (amountPaid < totalBill) {
            totalBill =  totalBill - amountPaid;
            cashLeft  = amountPaid - totalBill;

        } else {
            cashLeft = amountPaid - totalBill;
            System.out.println(" Il reste : " + cashLeft + " à rendre.");
        }

        System.out.println("Preparation de la monnaie à rendre.");

        // Pour la modification, on repère que ce qui ne bouge pas.
        // Pour mon cas les valeur des billets ne change pas.
        // Donc, on crée une liste avec chaque valeur des billets.
        // La boucle for itére sur les billets.
        // Puis la boucle while marche tant que cashLeft est supérieur à la valeur du billet.

        Integer[] billetChangeValue = {50, 20, 10, 5, 2, 1};
        // ici tant que i est plus petit que la longueur du tableau, il incrémente.
        for(int i = 0; i < billetChangeValue.length; i++){
            while(cashLeft >= billetChangeValue[i]) {
                cashLeft -= billetChangeValue[i];
                System.out.println("j'ai rendu un billet de " + billetChangeValue[i] + " euros et il reste " + cashLeft + " euros à rendre.");
            }
        }




    }
}
