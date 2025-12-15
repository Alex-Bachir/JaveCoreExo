package javaCore.chapter02Condition.exercice;

public class ObfuscatedCodeV1 {
    public static void main(String[] args) {

        int modelVehicule = 1; // Type de véhicule (1 = moto, 2 = car, 3 = truck)
        double distanceInKm = 100; // Distance
        boolean isVehicule = true;
        double d = 0.03;
        double price = 0;

        // en fonction du véhicule on donne un coût de base.
        if (modelVehicule == 1) {
            price = distanceInKm * 0.10;
        }
        if (modelVehicule == 2) {
            price = distanceInKm * 0.20;
        }
        if (modelVehicule == 3) {
            price = distanceInKm * 0.35;
        }
        // on applique ici une reduction au coût de base peut importe le vehicule car isVehicule = true
        if (isVehicule) {
            price = price - (distanceInKm * d);
        }

        System.out.println("Le prix pour passer le péage est de : " + price + "€");

    }
}
