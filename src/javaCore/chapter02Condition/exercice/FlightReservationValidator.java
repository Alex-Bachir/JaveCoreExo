package javaCore.chapter02Condition.exercice;

public class FlightReservationValidator {
    public static void main(String[] args) {

        // demande client:
        // le vol est vip ou pas
        // plus de siege dispo
        // vous etes majeur/ mineur


        boolean isLoggedIn = true;
        boolean isAdult = true;
        int seatsAvailable = 6;
        double flightPrice = 580;
        double flightPriceAfterPremium = 0;
        // reduction du prix du vol en pourcentage
        double volReductionPrice = 0.15;
        boolean isPremiumMember = true; // es ce que c'est une client VIP
        boolean isVIPFlight = false; // es ce que c'est un vol reservé aux VIP

        if(!isLoggedIn){
            System.out.println("Tu n'es pas connecté !");
            return;
        }

        if(!isAdult) {
            System.out.println("Tu n'es pas un adult.");
            return;
        }

        if (seatsAvailable > 0) {
            System.out.println("Il reste des sièges disponible !");
        } else {
            System.out.println("Désolé le vol est plein.");
            return;
        }


        if (isPremiumMember) {
            flightPriceAfterPremium = flightPrice - (flightPrice * volReductionPrice);
            System.out.println("Avec votre status premium vous recevez une reduction de 15% ce qui fera " + String.format ("%.1f", flightPriceAfterPremium) + " euros. Merci d'avoir choisi notre compagnie bon vol.");
        } else {
            System.out.println("Tu n'a pas accés au vol VIP.");
            System.out.println("Le prix du billet est de " +  String.format ("%.1f", flightPrice) + " merci d'avoir choisi notre compagnie.");
        }

    }
}
