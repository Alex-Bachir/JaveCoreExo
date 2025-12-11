package javaCore.chapter02Condition.exercice;

public class FrenchRevenueTaxeCalculator {
    public static void main(String[] args) {
        // test salaire  11000, 19500, 65000, 98000, 250000
        double salary = 11000;

        if ( salary > 180294) {
            double tranche0 = 0;
            double impot0 = tranche0 + 0;
            double tranche1 = 29315 - 11498;
            double impot1 = tranche1 * 0.11;
            double tranche2 = 83823 - 29316;
            double impot2 = tranche2 * 0.30;
            double tranche3 = 180294 - 83823;
            double impot3 = tranche3 * 0.41;
            double tranche4 = salary - 180294;
            double impot4 = tranche4 * 0.45;

            double irTotal = impot0 + impot1 + impot2 + impot3 + impot4;

            System.out.println("L'impot sur le revenue est de : " + irTotal + " euros pour un revenus de " + salary + " euros");

        }

        if (salary >= 83824 && salary <= 180294 ) {
            double tranche0 = 0;
            double impot0 = tranche0 + 0;
            double tranche1 = 29315 - 11498;
            double impot1 = tranche1 * 0.11;
            double tranche2 = 83823 - 29316;
            double impot2 = tranche2 * 0.30;
            double tranche3 = salary - 83823;
            double impot3 = tranche3 * 0.41;

            double irTotal = impot0 + impot1 + impot2 +  impot3;

            System.out.println("L'impot sur le revenue est de : " + irTotal + " euros pour un revenus de " + salary + " euros");
        }

        if (salary >= 29316 && salary <= 83824) {
            double tranche0 = 0;
            double impot0 = tranche0 + 0;
            double tranche1 = 29315 - 11498;
            double impot1 = tranche1 * 0.11;
            double tranche2 = salary - 29316;
            double impot2 = tranche2 * 0.30;

            double irTotal = impot0 + impot1 + impot2;

            System.out.println("L'impot sur le revenue est de : " + irTotal + " euros pour un revenus de " + salary + " euros");
        }

        if (salary >= 11498 && salary <= 29316) {
            double tranche0 = 0;
            double impot0 = tranche0 + 0;
            double tranche1 = salary - 11498;
            double impot1 = tranche1 * 0.11;

            double irTotal = impot0 + impot1;

            System.out.println("L'impot sur le revenue est de : " + irTotal + " euros pour un revenus de " + salary + " euros");
        }

        if (salary <= 11498) {
            double tranche0 = 0;
            double impot0 = tranche0 + 0;

            double irTotal = impot0 + 0;

            System.out.println("L'impot sur le revenue est de : " + irTotal + " euros pour un revenus de " + salary + " euros");
        }








    }
}
