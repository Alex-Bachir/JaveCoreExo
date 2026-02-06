package javaCore.chapter02Condition.exercice;

public class AgeValidation {
    public static void main(String[] args) {

        final double MINIMUM_LEGAL_AGE = 18;
        final double HOURS_IN_DAY      = 24;
        final double DAYS_IN_MONTH     = 30;
        final double MONTHS_IN_YEAR    = 12;
        final double SECONDS_IN_MINUTE = 60;
        final double SECONDS_IN_HOUR   = SECONDS_IN_MINUTE * SECONDS_IN_MINUTE; // 3600 secondes
        final double SECONDS_IN_DAY    = HOURS_IN_DAY * SECONDS_IN_HOUR;        // 86 400 secondes
        final double SECONDS_IN_MONTH  = DAYS_IN_MONTH * SECONDS_IN_DAY;        // 2 592 000 secondes
        final double SECONDS_IN_YEAR   = MONTHS_IN_YEAR * SECONDS_IN_MONTH;     // 31 536 000 secondes

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
        // A cette date 02.02.2026, les personnes nées en 2008 sont majeurs en 2026.

        int userDayBirth   =   15; // jour de naissance
        int userMonthBirth =    2; // mois de naissance
        int userYearBirth  = 2020; // année de naissance

        // plus court chemin pour connaitre approximativement la personne est majeur.

        double userSinceBirth = currentYear - userYearBirth;

        if (userSinceBirth > MINIMUM_LEGAL_AGE) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
        System.out.println("Vous êtes né le " + userDayBirth + "/" + userMonthBirth + "/" + userYearBirth + ". Vous avez donc " +  userSinceBirth + " ans.");


        // ici on va essayer de connaître si il est majeur au jour près.



    }
}
