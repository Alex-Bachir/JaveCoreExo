package javaCore.chapter01Variable.exercice;

public class SalaryForecast {
    public static void main(String[] args) {

        double cotisation = 0.75;
        double impot = 0.895;
         int horaireBrut = 25;

         double semaineBrut = horaireBrut * 38.5;
         double moisBrut = semaineBrut * 4;
         double anneBrut = moisBrut * 12;

         System.out.println("On a " + horaireBrut + " euros brute par jour.\n" +
                                    "On a " + semaineBrut + " euros brute par semaine.\n" +
                                    "On a " + moisBrut + " euros brute par mois. \n" +
                                    "On a " + anneBrut + " euros brute par anne.");


         double moisNet = moisBrut * cotisation;
         double  anneNet = anneBrut * cotisation;

         System.out.println("Salaire mensuel net " + moisNet + "\n" +
                                    "Salaire annuel net " + anneNet);

         double moisNetApresImpot = moisNet * impot;
         double  anneNetApresImpot = anneNet * impot;

         System.out.println("Salaire mensuel net apres impot " + moisNetApresImpot + "\n" +
                                    "Salaire annuel net apres impot " +  anneNetApresImpot);
    }
}
