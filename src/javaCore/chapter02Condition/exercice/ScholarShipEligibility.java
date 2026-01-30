package javaCore.chapter02Condition.exercice;

public class ScholarShipEligibility {
    public static void main(String[] args) {


        // ici on va tester supérieur à 3.5; egale à 3.5; inférieur à 3.5
        double studentGpa = 4;
        // ici on va tester le revenus du foyer si il est inférieur à 40.000 puis tester entre 40k et 60k puis au dessus de 60k
        int householdIncome = 80000;
        // ici on va tester si il pratique une activé ou pas
        boolean hasExtracurricular = true;

//      Bourse complète :
//      GPA > 3.5 ET revenu < 40000 ET activité extracurriculaire = OUI

//      Bourse partielle :
//      GPA > 3.5 ET revenu entre 40000-60000 ET activité extracurriculaire = OUI

//      Pas de bourse (6 cas) :
//
//      GPA > 3.5 ET revenu < 40000 ET activité extracurriculaire = NON
//      GPA > 3.5 ET revenu entre 40000-60000 ET activité extracurriculaire = NON
//      GPA > 3.5 ET revenu > 60000 ET activité extracurriculaire = OUI
//      GPA > 3.5 ET revenu > 60000 ET activité extracurriculaire = NON
//      GPA ≤ 3.5 ET revenu < 40000 ET activité extracurriculaire = OUI
//      GPA ≤ 3.5 ET revenu < 40000 ET activité extracurriculaire = NON
//      GPA ≤ 3.5 ET revenu entre 40000-60000 ET activité extracurriculaire = OUI
//      GPA ≤ 3.5 ET revenu entre 40000-60000 ET activité extracurriculaire = NON
//      GPA ≤ 3.5 ET revenu > 60000 ET activité extracurriculaire = OUI
//      GPA ≤ 3.5 ET revenu > 60000 ET activité extracurriculaire = NON




        if (studentGpa > 3.5 && householdIncome < 40000 && hasExtracurricular) {
            System.out.println("L'etudiant est éligible à la bourse.");
        } else if (studentGpa > 3.5 && householdIncome < 60000 && hasExtracurricular) {
            System.out.println("L'etudiant est éligible à la bourse partielle.");
        } else if (studentGpa <= 3.5 && householdIncome >= 60000 && hasExtracurricular) {
            System.out.println("L'etudiant n'est pas éligible à la bourse.");
        } else {
            System.out.println("L'etudiant n'est pas éligible à la bourse.");
        }



    }
}
