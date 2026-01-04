package javaCore.chapter02Condition.exercice;

public class FrenchRevenueTaxeCalculator {

    public static <booleen> void main(String[] args) {
        // test 11000, 19500, 65000, 98000, 250000
        // annual salary
        double grossAnnualSalary = 250000;

        // Here we have the contribution percentages for workers and executives.
        // I will use double for calculation precision because it is necessary to be accurate in tax calculations.
        double socialTaxeWorker = 23;
        double socialTaxeManager = 25;

        boolean isWorker = true;

        // Calculate netSalary
        double netSalaryWorker = grossAnnualSalary - (grossAnnualSalary * socialTaxeWorker / 100);
        double netSalaryManager = grossAnnualSalary - (grossAnnualSalary * socialTaxeManager / 100);


        // tax bracket ici on initialise les tranches de taxe avec la plage maximum
        double taxBracket1 = (29316 - 11498) * 0.11;
        double taxBracket2 = (83823 - 29316) * 0.30;
        double taxBracket3 = (180294 - 83823) * 0.41;


        // bracket tax worker
        double taxBracketWorker1 = (29316 - netSalaryWorker) * 0.11;
        double taxBracketWorker2 = (83823 - netSalaryWorker) * 0.30;
        double taxBracketWorker3 = (180294 - netSalaryWorker) * 0.41;
        double taxBracketWorker4 = (netSalaryWorker - 180294) * 0.45;


        // bracket tax manadger
        double taxBracketManager1 = (29316 - netSalaryManager) * 0.11;
        double taxBracketManager2 = (83823 - netSalaryManager) * 0.30;
        double taxBracketManager3 = (180294 - netSalaryManager) * 0.41;
        double taxBracketManager4 = (netSalaryManager - 180294) * 0.45;


        if (isWorker == true && netSalaryWorker <= 11498) {
            System.out.println(" 0 Worker dont't pay tax");
        } else if (isWorker == false && netSalaryManager <= 11498) {
            System.out.println(" 0 Manager don't pay tax");


        } else if (isWorker == true && netSalaryWorker <= 29316) {
            double taxBracketTotal = taxBracketWorker1;
            System.out.println(" 1 Worker Tax total: " + taxBracketTotal);
        } else if (isWorker == false && netSalaryManager <= 29316) {
            double taxBracketTotal = taxBracketManager1;
            System.out.println(" 1 Manager Tax total: " + taxBracketTotal);


        } else if (isWorker == true && netSalaryWorker <= 83823) {
            double taxBracketTotal = taxBracket1 + taxBracketWorker2;
            System.out.println(" 2 Worker Tax total: " + taxBracketTotal);
        } else if (isWorker == false && netSalaryManager <= 83823) {
            double taxBracketTotal = taxBracket1 + taxBracketManager2;
            System.out.println(" 2 Manager Tax total: " + taxBracketTotal);


        } else if (isWorker == true && netSalaryWorker <= 180294) {
            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracketWorker3;
            System.out.println(" 3 Worker Tax total: " + taxBracketTotal);
        } else if (isWorker == false && netSalaryManager <= 180294) {
            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracketManager3;
            System.out.println(" 3 Manager Tax total: " + taxBracketTotal);


        } else if (isWorker == true && netSalaryWorker > 180294) {
            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracket3 + taxBracketWorker4;
            System.out.println(" 4 Manager Tax total: " + taxBracketTotal);
        } else if (isWorker == false && netSalaryManager > 180294) {
            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracket3 + taxBracketManager4;
            System.out.println(" 4 Manager Tax total: " + taxBracketTotal);
        }
    }
}









































//        if (isWorker == true && netSalaryWorker > 180294) {
//            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracket3 + taxOnBracketWorker4;
//            System.out.println(" 4 Worker Tax total: " + taxBracketTotal);
//        } else if (isWorker == false && netSalaryManager > 180294) {
//            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracket3 + taxOnBracketManager4;
//            System.out.println(" 4 Manager Tax total: " + taxBracketTotal);
//
//
//        } else if (isWorker == true && netSalaryWorker <= 180294) {
//            double taxBracketTotal = taxBracket1 + taxBracket2 + taxOnBracketWorker3;
//            System.out.println(" 3 Worker Tax total: " + taxBracketTotal);
//        } else if (isWorker == false && netSalaryManager <= 180294) {
//            double taxBracketTotal = taxBracket1 + taxBracket2 + taxOnBracketManager3;
//            System.out.println(" 3 Manager Tax total: " + taxBracketTotal);
//
//
//        } else if (isWorker == true && netSalaryWorker <= 83823) {
//            double taxBracketTotal = taxBracket1 + taxOnBracketWorker2;
//            System.out.println(" 2 Worker Tax total: " + taxBracketTotal);
//        } else if (isWorker == false && netSalaryManager <= 83823) {
//            double taxBracketTotal = taxBracket1 + taxOnBracketManager2;
//            System.out.println(" 2 Manager Tax total: " + taxBracketTotal);
//
//
//        } else if (isWorker == true && netSalaryWorker <= 29316) {
//            double taxBracketTotal = taxOnBracketWorker1;
//            System.out.println(" 1 Worker Tax total: " + taxBracketTotal);
//        } else if (isWorker == false && netSalaryManager <= 29316) {
//            double taxBracketTotal = taxOnBracketManager1;
//            System.out.println(" 1 Manager Tax total: " + taxBracketTotal);
//
//
//         if (isWorker == true && netSalaryWorker <= 11498) {
//            System.out.println(" 0 Worker dont't pay tax");
//        } else if (isWorker == false && netSalaryManager <= 11498) {
//            System.out.println(" 0 Manager don't pay tax");
//
//
//        } else {
//            System.out.println("Error entry a salary");
//        }
//    }
//



        // j'ai laissé en commentaire pour voir l'evolution du code

//    if ( netSalaryWorker <= 11498) {
//        System.out.println(" 0 Ne paye pas de taxe");
//
//    } else if ( netSalaryWorker <= 29316 ) {
//        double taxBracketTotal = taxOnBracket1;
//        System.out.println(" 1 Tax total: " + taxBracketTotal);
//
//    } else if ( netSalaryWorker <= 83823 ) {
//        double taxBracketTotal = taxOnBracket1 + taxOnBracket2;
//        System.out.println(" 2 Tax total: " + taxBracketTotal);
//
//    } else if ( netSalaryWorker <= 180294) {
//        double taxBracketTotal = taxOnBracket1 + taxOnBracket2 + taxOnBracket3;
//        System.out.println(" 3 Tax total: " + taxBracketTotal);
//
//    } else if ( netSalaryWorker > 180294) {
//        double taxBracketTotal = taxOnBracket1 + taxOnBracket2 + taxOnBracket3 + taxOnBracket4;
//        System.out.println(" 4 Tax total: " + taxBracketTotal);
//
//    }


//        // calculating for salary worker
//        if (netSalaryWorker > 180294) {
//            double taxBracket0 = 0;
//            double taxOnBracket0 = taxBracket0 * 0;
//            double taxBracket1 = 29315 - 11498;
//            double taxOnBracket1 = taxBracket1 * 0.11;
//            double taxBracket2 = 83823 - 29316;
//            double taxOnBracket2 = taxBracket2 * 0.30;
//            double taxBracket3 = 180294 - 83823;
//            double taxOnBracket3 = taxBracket3 * 0.41;
//            double taxBracket4 = netSalaryWorker - 180294;
//            double taxOnBracket4 = taxBracket4 * 0.45;
//            double taxBracketTotal = taxOnBracket0 + taxOnBracket1 + taxOnBracket2 + taxOnBracket3 + taxOnBracket4;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
//
//        }
//
//        if (netSalaryWorker >= 83824 && netSalaryWorker <= 180294) {
//            double taxBracket0 = 0;
//            double incomeTax0 = taxBracket0 + 0;
//            double taxBracket1 = 29315 - 11498;
//            double incomeTax1 = taxBracket1 * 0.11;
//            double taxBracket2 = 83823 - 29316;
//            double incomeTax2 = taxBracket2 * 0.30;
//            double taxBracket3 = netSalaryWorker - 83823;
//            double incomeTax3 = taxBracket3 * 0.41;
//            double taxBracketTotal = incomeTax0 + incomeTax1 + incomeTax2 + incomeTax3;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
//        }
//
//        if (netSalaryWorker >= 29316 && netSalaryWorker <= 83824) {
//            double taxBracket0 = 0;
//            double incomeTax0 = taxBracket0 + 0;
//            double taxBracket1 = 29315 - 11498;
//            double incomeTax1 = taxBracket1 * 0.11;
//            double taxBracket2 = 83823 - 29316;
//            double incomeTax2 = taxBracket2 * 0.30;
//            double taxBracketTotal = incomeTax0 + incomeTax1 + incomeTax2;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
//        }
//
//        if (netSalaryWorker >= 11498 && netSalaryWorker <= 29316) {
//            double taxBracket0 = 0;
//            double incomeTax0 = taxBracket0 + 0;
//            double taxBracket1 = 29315 - 11498;
//            double incomeTax1 = taxBracket1 * 0.11;
//            double taxBracketTotal = incomeTax0 + incomeTax1;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
//        }
//
//        if (netSalaryWorker <= 11498) {
//            double taxBracket0 = 0;
//            double incomeTax0 = taxBracket0 + 0;
//            double taxBracketTotal = incomeTax0 + 0;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryWorker + " euros");
//        }
//
//        // Calculate for income manager
//        if (netSalaryManager > 180294) {
//            double taxBracket0 = 0;
//            double taxOnBracket0 = taxBracket0 * 0;
//            double taxBracket1 = 29315 - 11498;
//            double taxOnBracket1 = taxBracket1 * 0.11;
//            double taxBracket2 = 83823 - 29316;
//            double taxOnBracket2 = taxBracket2 * 0.30;
//            double taxBracket3 = 180294 - 83823;
//            double taxOnBracket3 = taxBracket3 * 0.41;
//            double taxBracket4 = netSalaryWorker - 180294;
//            double taxOnBracket4 = taxBracket4 * 0.45;
//            double taxBracketTotal = taxOnBracket0 + taxOnBracket1 + taxOnBracket2 + taxOnBracket3 + taxOnBracket4;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
//
//        }
//
//        if (netSalaryManager >= 83824 && netSalaryManager <= 180294) {
//            double taxBracket0 = 0;
//            double incomeTax0 = taxBracket0 + 0;
//            double taxBracket1 = 29315 - 11498;
//            double incomeTax1 = taxBracket1 * 0.11;
//            double taxBracket2 = 83823 - 29316;
//            double incomeTax2 = taxBracket2 * 0.30;
//            double taxBracket3 = netSalaryWorker - 83823;
//            double incomeTax3 = taxBracket3 * 0.41;
//            double taxBracketTotal = incomeTax0 + incomeTax1 + incomeTax2 + incomeTax3;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
//        }
//
//        if (netSalaryManager >= 29316 && netSalaryManager <= 83824) {
//            double taxBracket0 = 0;
//            double incomeTax0 = taxBracket0 + 0;
//            double taxBracket1 = 29315 - 11498;
//            double incomeTax1 = taxBracket1 * 0.11;
//            double taxBracket2 = 83823 - 29316;
//            double incomeTax2 = taxBracket2 * 0.30;
//            double taxBracketTotal = incomeTax0 + incomeTax1 + incomeTax2;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
//        }
//
//        if (netSalaryManager >= 11498 && netSalaryManager <= 29316) {
//            double taxBracket0 = 0;
//            double incomeTax0 = taxBracket0 + 0;
//            double taxBracket1 = 29315 - 11498;
//            double incomeTax1 = taxBracket1 * 0.11;
//            double taxBracketTotal = incomeTax0 + incomeTax1;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
//        }
//
//        if (netSalaryManager <= 11498) {
//            double taxBracket0 = 0;
//            double incomeTax0 = taxBracket0 + 0;
//            double taxBracketTotal = taxBracket0 + 0;
//            System.out.println("The income tax is: " + taxBracketTotal + " euros for an income of " + netSalaryManager + " euros");
//        }
//
//    }