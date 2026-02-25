package javaCore.chapter02Condition.exercice;

public class AgeValidation {
    public static void main(String[] args) {

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

        int dayOfBirth   =    26;
        int monthOfBirth =     2;
        int yearOfBirth  =  2008;

        int dayCheck   =   currentDay   -    dayOfBirth;
        int monthCheck =   currentMonth -  monthOfBirth;
        int yearCheck  =   currentYear  -   yearOfBirth;

        // on teste quand ça fait au moins 1 an que la personne à la majorité / on test yearCheck
        // on teste pour quelqu'un qui aura la majorité dans l'année / on test monthCheck
        // on teste pour quelqu'un qui aura la majorité dans le mois / on test dayCheck
        // 21, 18 ans et 2 mois, 18 0 mois et 2 jours
        if (yearCheck >= LEGALE_AGE_MAJORITY && monthCheck >= 0 && dayCheck >= 0) {
            System.out.println("Tu es majeur. ");
        } else if (yearCheck == LEGALE_AGE_MAJORITY && monthCheck < 0) {
            System.out.println("Tu es encore mineur. ");
        } else if (yearCheck == LEGALE_AGE_MAJORITY && monthCheck == 0 && dayCheck < 0) {
            System.out.println("Tu es toujours mineur.");
        }



    }
}


//// ici on vérifie le nombre de jour
//int dayCheck = dayOfBirth - currentDay;
//int monthCheck = monthOfBirth - currentMonth;
//int yearCheck = currentYear - yearOfBirth;
//
//// ici la condition marche si dayCheck est inférieur à 0
//// le but est d'emprunter 1 mois donc 30 j pour ensuite soustraire le resultat au jour de l'anniversaire
//// comme on a emprunter 1 mois il faut décrémenter le mois de l'anniversaire
//        if (dayCheck < 0) {
//int dayPast = dayCheck + DAY_IN_MONTH;
//dayCheck =  dayPast - dayOfBirth;
//monthOfBirth --;
//        }
//        // pareil on emprunt 1 an donc 12 mois
//        if (monthCheck < 0) {
//int monthPast = monthCheck + MONTH_IN_YEAR;
//monthCheck =  monthPast - monthOfBirth;
//
//        } else {
//yearOfBirth ++;
//yearCheck = currentYear - yearOfBirth;
//        }
//
//                System.out.println("Tu as " + yearCheck + " ans " + monthCheck + " mois et " + dayCheck + " jours.");
//        System.out.println("Je fête mon anniversaiire dans " + monthCheck + " mois et " + dayCheck + " jours.");
//
//// si la personne n'ai pas encore majeur alors on soustrait l'age de la majortité moins l'année
//        if (yearCheck <= LEGALE_AGE_MAJORITY) {
//        System.out.println("Tu seras majeur dans " +  monthCheck + " mois et " + dayCheck + " jours.");
//        }