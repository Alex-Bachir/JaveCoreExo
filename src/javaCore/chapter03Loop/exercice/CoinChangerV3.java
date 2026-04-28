package javaCore.chapter03Loop.exercice;

public class CoinChangerV3 {
    public static void main(String[] args) {

        // total de la facture à payer
        int totalBill  = 20;
        // montant que le client paye. J'ai fait exprès d'exagérer pour faire fonctionner plusieur fois la boucle while
        //pour la meme valeur de billet.
        int amountPaid = 173;
        // montant restant à payer
        int cashLeft   =  0;
        // nombre de billet ou piece à rendre
        int billChange =  0;

        if (amountPaid < totalBill) {
            totalBill =  totalBill - amountPaid;
            cashLeft  = amountPaid - totalBill;

        } else {
            cashLeft = amountPaid - totalBill;
            System.out.println("Le client à rendu " + amountPaid + ". En déduisant la facture il reste : " + cashLeft + " à rendre.");
        }

        System.out.println("Preparation de la monnaie à rendre.");

        // Pour la modification, on repère que ce qui ne bouge pas.
        // Pour mon cas les valeur des billets ne change pas.
        // Donc, on crée une liste avec chaque valeur de billet.
        // La boucle for itére sur une valeurs de billets.
        // Puis la boucle while rend un billet de la valeur de l'index et quand cashlest et enfin endessous de la valeur du billet on passe a la coupure inférieur


        Integer[] billetChangeValue = {50, 20, 10, 5, 2, 1};

        for(int billetIndexValue = 0; billetIndexValue < billetChangeValue.length; billetIndexValue++){
            while(cashLeft >= billetChangeValue[billetIndexValue]) {
                cashLeft -= billetChangeValue[billetIndexValue];
                System.out.println("j'ai rendu un billet de " + billetChangeValue[billetIndexValue] + " euros et il reste " + cashLeft + " euros à rendre.");
            }
        }




    }
}
