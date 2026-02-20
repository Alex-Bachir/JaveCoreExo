package javaCore.chapter02Condition.exercice;

public class AgeValidation {
    public static void main(String[] args) {

        final int MINIMUM_LEGAL_AGE = 18;
        final int dayInMonth = 30;
        final int monthInYear = 12;

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

        int dayOfBirth   =    17;
        int monthOfBirth =     2;
        int yearOfBirth  =  1994;



        int dayCheck = dayOfBirth - currentDay;

        if (dayCheck < 0) {
            int dayPast = dayCheck + dayInMonth;
            System.out.println(dayPast);
        }


        int monthCheck = currentMonth - monthOfBirth;




        int yearCheck = currentYear - yearOfBirth;



    }
}
