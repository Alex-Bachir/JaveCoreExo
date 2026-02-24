package javaCore.chapter02Condition.exercice;

public class AgeValidation {
    public static void main(String[] args) {

        final int DAY_IN_MONTH = 30;
        final int MONTH_IN_YEAR = 12;
        final int LEGALE_AGE_MAJORITY = 18;
        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear  = currentDate.getYear();       // Année courante (202X)

        System.out.println("Nous somme le " + currentDay + "/" + currentMonth + "/" + currentYear);


        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */

        // Écrivez votre code ci-dessous...
        // On va tester un utilisateur majeur, puis un utilisateur pas majeur et un utilisateur présque majeur
        // A cette date 17.02.2026, les personnes nées en 2008 sont majeurs en 2026.

        int dayOfBirth   =     26;
        int monthOfBirth =     2;
        int yearOfBirth  =  2008;


        // ici on vérifie le nombre de jour
        int dayCheck = dayOfBirth - currentDay;
        int monthCheck = monthOfBirth - currentMonth;



        // ici la condition marche si dayCheck est inférieur à 0
        // le but est d'emprunter 1 mois donc 30 j pour ensuite soustraire le resultat au jour de l'anniversaire
        // comme on a emprunter 1 mois il faut décrémenter le mois de l'anniversaire
        if (dayCheck < 0) {
            int dayPast = dayCheck + DAY_IN_MONTH;
            dayCheck =  dayPast - dayOfBirth;
            monthOfBirth --;
        }
        // pareil on emprunt 1 an donc 12 mois
        if (monthCheck < 0) {
            int monthPast = monthCheck + MONTH_IN_YEAR;
            monthCheck =  monthPast - monthOfBirth;
            yearOfBirth --;
        }
        // j'ai mis ma variable ici car l'année de  naissance décrémente et on a besoin de la modification
        int yearCheck = currentYear - yearOfBirth;

        System.out.println("J'ai " + yearCheck + " ans " + monthCheck + " mois et " + dayCheck + " jours.");
        System.out.println("Je fête mon anniversaiire dans " + monthCheck + " mois et " + dayCheck + " jours.");

        // si la personne n'ai pas encore majeur alors on soustrait l'age de la majortité moins l'année
        if (yearCheck < LEGALE_AGE_MAJORITY) {
            int majorityBirth = LEGALE_AGE_MAJORITY - yearCheck;
            System.out.println("Tu seras majeur dans " + majorityBirth + " an(s) " +  monthCheck + " mois et " + dayCheck + " jours.");
        }










    }
}
