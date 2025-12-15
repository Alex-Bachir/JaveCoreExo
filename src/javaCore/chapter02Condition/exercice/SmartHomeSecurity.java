package javaCore.chapter02Condition.exercice;

public class SmartHomeSecurity {
    public static void main(String[] args) {

        boolean isHouseEmpty  = false; // condition 1
        boolean isOwnerAsleep = true; // condition 2
        boolean areAllDoorsAndWindowsClosed  = true; // condition 3
        boolean isAlarmActivated = true; // condition 4
        // La condition 1 et 2 on l'évalue en premier grâce aux parentheses,
        // il y a une logique qui me dérange ici. S'il y a quelqu'un qui dort du coup forcément la maison n'est pas vide

        // La condition 3 et 4 sont obligatoires si une des conditions est false
        // ce sera forcément false, car une maison n'est pas sécurisé si elle a tout ouvert
        // et pareil pour l'alarme si elle n'est pas activé alors la maison n'est pas sécurisé.

        // "La maison est sécurisée SI (tout fermé) ET (alarme activée) ET (maison vide OU propriétaire dort)"
        boolean isSafeModeActivated = areAllDoorsAndWindowsClosed && isAlarmActivated && (isHouseEmpty || isOwnerAsleep);

        // envoyé un message au propriétaire si la maison est sécurisé ou pas.
        if (isSafeModeActivated) {
            System.out.println("La maison est sécurisé !");
        } else {
            System.out.println("La maison n'es pas sécurisé !");
        }

    }
}
