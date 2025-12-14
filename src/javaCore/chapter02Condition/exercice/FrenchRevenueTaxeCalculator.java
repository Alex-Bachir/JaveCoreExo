package javaCore.chapter02Condition.exercice;

public class FrenchRevenueTaxeCalculator {

    public static void main(String[] args) {
        // test 11000, 19500, 65000, 98000, 250000
        // annual salary
        double grossAnnualSalary = 98000;
        // Here we have the contribution percentages for workers and executives.
        // I will use double for calculation precision because it is necessary to be accurate in tax calculations.
        double socialTaxeWorker = 23;
        double socialTaxeManager = 25;

        double netSalaryWorker = grossAnnualSalary - (grossAnnualSalary * socialTaxeWorker / 100);
        double netSalaryManager = grossAnnualSalary - (grossAnnualSalary * socialTaxeManager / 100);
        System.out.println("Annual worker salary: " + netSalaryWorker);
        System.out.println("Annual Manager salary: " + netSalaryManager);

        // calculating for salary worker
        if (netSalaryWorker > 180294) {
            double taxBracket0 = 0;
            double taxOnBracket0 = taxBracket0 * 0;
            double taxBracket1 = 29315 - 11498;
            double taxOnBracket1 = taxBracket1 * 0.11;
            double taxBracket2 = 83823 - 29316;
            double taxOnBracket2 = taxBracket2 * 0.30;
            double taxBracket3 = 180294 - 83823;
            double taxOnBracket3 = taxBracket3 * 0.41;
            double taxBracket4 = netSalaryWorker - 180294;
            double taxOnBracket4 = taxBracket4 * 0.45;
            double taxBracketTotal = taxOnBracket0 + taxOnBracket1 + taxOnBracket2 + taxOnBracket3 + taxOnBracket4;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");

        }

        if (netSalaryWorker >= 83824 && netSalaryWorker <= 180294) {
            double taxBracket0 = 0;
            double incomeTax0 = taxBracket0 + 0;
            double taxBracket1 = 29315 - 11498;
            double incomeTax1 = taxBracket1 * 0.11;
            double taxBracket2 = 83823 - 29316;
            double incomeTax2 = taxBracket2 * 0.30;
            double taxBracket3 = netSalaryWorker - 83823;
            double incomeTax3 = taxBracket3 * 0.41;
            double taxBracketTotal = incomeTax0 + incomeTax1 + incomeTax2 + incomeTax3;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
        }

        if (netSalaryWorker >= 29316 && netSalaryWorker <= 83824) {
            double taxBracket0 = 0;
            double incomeTax0 = taxBracket0 + 0;
            double taxBracket1 = 29315 - 11498;
            double incomeTax1 = taxBracket1 * 0.11;
            double taxBracket2 = 83823 - 29316;
            double incomeTax2 = taxBracket2 * 0.30;
            double taxBracketTotal = incomeTax0 + incomeTax1 + incomeTax2;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
        }

        if (netSalaryWorker >= 11498 && netSalaryWorker <= 29316) {
            double taxBracket0 = 0;
            double incomeTax0 = taxBracket0 + 0;
            double taxBracket1 = 29315 - 11498;
            double incomeTax1 = taxBracket1 * 0.11;
            double taxBracketTotal = incomeTax0 + incomeTax1;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
        }

        if (netSalaryWorker <= 11498) {
            double taxBracket0 = 0;
            double incomeTax0 = taxBracket0 + 0;
            double taxBracketTotal = incomeTax0 + 0;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
        }

        // Calculate for income manager
        if (netSalaryManager > 180294) {
            double taxBracket0 = 0;
            double taxOnBracket0 = taxBracket0 * 0;
            double taxBracket1 = 29315 - 11498;
            double taxOnBracket1 = taxBracket1 * 0.11;
            double taxBracket2 = 83823 - 29316;
            double taxOnBracket2 = taxBracket2 * 0.30;
            double taxBracket3 = 180294 - 83823;
            double taxOnBracket3 = taxBracket3 * 0.41;
            double taxBracket4 = netSalaryWorker - 180294;
            double taxOnBracket4 = taxBracket4 * 0.45;
            double taxBracketTotal = taxOnBracket0 + taxOnBracket1 + taxOnBracket2 + taxOnBracket3 + taxOnBracket4;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");

        }

        if (netSalaryManager >= 83824 && netSalaryManager <= 180294) {
            double taxBracket0 = 0;
            double incomeTax0 = taxBracket0 + 0;
            double taxBracket1 = 29315 - 11498;
            double incomeTax1 = taxBracket1 * 0.11;
            double taxBracket2 = 83823 - 29316;
            double incomeTax2 = taxBracket2 * 0.30;
            double taxBracket3 = netSalaryWorker - 83823;
            double incomeTax3 = taxBracket3 * 0.41;
            double taxBracketTotal = incomeTax0 + incomeTax1 + incomeTax2 + incomeTax3;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
        }

        if (netSalaryManager >= 29316 && netSalaryManager <= 83824) {
            double taxBracket0 = 0;
            double incomeTax0 = taxBracket0 + 0;
            double taxBracket1 = 29315 - 11498;
            double incomeTax1 = taxBracket1 * 0.11;
            double taxBracket2 = 83823 - 29316;
            double incomeTax2 = taxBracket2 * 0.30;
            double taxBracketTotal = incomeTax0 + incomeTax1 + incomeTax2;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
        }

        if (netSalaryManager >= 11498 && netSalaryManager <= 29316) {
            double taxBracket0 = 0;
            double incomeTax0 = taxBracket0 + 0;
            double taxBracket1 = 29315 - 11498;
            double incomeTax1 = taxBracket1 * 0.11;
            double taxBracketTotal = incomeTax0 + incomeTax1;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
        }

        if (netSalaryManager <= 11498) {
            double taxBracket0 = 0;
            double incomeTax0 = taxBracket0 + 0;
            double taxBracketTotal = taxBracket0 + 0;
            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
        }

    }

}