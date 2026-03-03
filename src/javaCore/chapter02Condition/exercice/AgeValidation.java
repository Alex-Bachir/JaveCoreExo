package javaCore.chapter02Condition.exercice;

public class AgeValidation {
    public static void main(String[] args) {

        final int LEGALE_AGE_MAJORITY = 18;
        final int DAY_IN_MONTH = 30;
        final int MONTH_IN_YEAR = 12;

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear = currentDate.getYear();       // Année courante (202X)

        System.out.println("Nous somme le " + currentDay + "/" + currentMonth + "/" + currentYear);


        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */

        // Écrivez votre code ci-dessous...
        // On va tester un utilisateur majeur, puis un utilisateur pas majeur et un utilisateur présque majeur
        // A cette date 17.02.2026, les personnes nées en 2008 sont majeurs en 2026.

        int dayOfBirth = 3;
        int monthOfBirth = 4;
        int yearOfBirth = 2008;
        int dayCheck = currentDay - dayOfBirth;
        int monthCheck = currentMonth - monthOfBirth;
        int yearCheck = currentYear - yearOfBirth;

        if (yearCheck > LEGALE_AGE_MAJORITY) {
            System.out.println("Tu es majeur.");
        } else if (yearCheck < LEGALE_AGE_MAJORITY) {
            System.out.println("Tu es mineur.");
        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth == monthOfBirth && currentDay == dayOfBirth) {
            System.out.println("Bon anniversaire ! Tu es majeur.");

        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth == monthOfBirth && currentDay < dayOfBirth) {
            System.out.println("Tu vas fêter ton  18eme anniversaire dans le mois");
        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth == monthOfBirth && currentDay > dayOfBirth) {
            System.out.println("Tu viens d'avoir 18 ans.");

        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth > monthOfBirth && currentDay > dayOfBirth) {
            System.out.println("Test 8");
        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth > monthOfBirth && currentDay < dayOfBirth) {
            System.out.println("Test 1");
        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth < monthOfBirth && currentDay > dayOfBirth) {
            System.out.println("Test 2");
        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth < monthOfBirth && currentDay < dayOfBirth) {
            System.out.println("Test 3");

        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth < monthOfBirth && currentDay == dayOfBirth) {
            System.out.println("Test 6");
        } else if (yearCheck == LEGALE_AGE_MAJORITY && currentMonth > monthOfBirth && currentDay == dayOfBirth) {
            System.out.println("Test 7");
        }
    }
}
// v2


//if (yearCheck > LEGALE_AGE_MAJORITY) {
//            System.out.println("Tu es majeur.");
//
//        } else if (yearCheck < LEGALE_AGE_MAJORITY ) {
//            System.out.println("Tu es mineur.");
//
//        } else if (yearCheck == LEGALE_AGE_MAJORITY && monthCheck == 0 && dayCheck == 0){
//            System.out.println("Bon anniversaire ! Tu es majeur !");
//
//        } else if (yearCheck == LEGALE_AGE_MAJORITY && monthCheck == 0 && dayCheck != 0) {
//            if (dayCheck > currentDay) {
//                System.out.println("Tu es majeur !");
//            }
//            System.out.println("Tu es à quelque jour d'être majeur.");
//
//        } else if (yearCheck == LEGALE_AGE_MAJORITY && monthCheck != 0) {
//            System.out.println("Tu es bientôt majeur.");
//        }

// v1
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