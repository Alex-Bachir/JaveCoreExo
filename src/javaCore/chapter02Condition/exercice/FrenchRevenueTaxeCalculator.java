package javaCore.chapter02Condition.exercice;

public class FrenchRevenueTaxeCalculator {

    public static void main(String[] args) {
        // test 11000, 19500, 65000, 250000
        // annual salary

        final double   SOCIAL_CONTRIBUTION_RATE;
        double         grossAnnualSalary        = 88000;
        final double   SOCIAL_TAXE_WORKER       = 23;
        final double   SOCIAL_TAXE_MANAGER      = 25;
        final double   ABATTEMENT_MAX_AMOUNT    = 10000;
        final double   ABATTEMENT_RATE          = 0.10;
        boolean        isWorker                 = false;

        final double TAX_RATE_5 = 0.45;
        final double TAX_RATE_4 = 0.41;
        final double TAX_RATE_3 = 0.30;
        final double TAX_RATE_2 = 0.11;
        final double TAX_RATE_1 = 0;

        final double TAX_BRACKET_5 = 177106;
        final double TAX_BRACKET_4 = 82342;
        final double TAX_BRACKET_3 = 28797;
        final double TAX_BRACKET_2 = 11295;

        double taxBracket5 = 0;
        double taxBracket4 = 0;
        double taxBracket3 = 0;
        double taxBracket2 = 0;
        double taxBracket1 = 0;

        // Ici on détermine si c'est un ouvrier ou un manager
        if (isWorker) {
            SOCIAL_CONTRIBUTION_RATE = SOCIAL_TAXE_WORKER;
        } else {
            SOCIAL_CONTRIBUTION_RATE = SOCIAL_TAXE_MANAGER;
        }

        // Calculate netSalary
        double netSalary = grossAnnualSalary - (grossAnnualSalary * SOCIAL_CONTRIBUTION_RATE / 100);

        double netSalaryAfterDeduction = 0;
        double netSalaryAbattementDifference = netSalary * ABATTEMENT_RATE;
        // test
        System.out.println(netSalaryAbattementDifference);

        if(netSalaryAbattementDifference >= ABATTEMENT_MAX_AMOUNT){
            netSalaryAfterDeduction = netSalary - ABATTEMENT_MAX_AMOUNT;
        } else {
            netSalaryAfterDeduction = netSalary - (netSalary * ABATTEMENT_RATE);
        }


        if (netSalaryAfterDeduction > TAX_BRACKET_5) {
            taxBracket5 = ((netSalaryAfterDeduction - TAX_BRACKET_5) * TAX_RATE_5);
            netSalaryAfterDeduction = TAX_BRACKET_5;
        }

        if (netSalaryAfterDeduction >= TAX_BRACKET_4) {
            taxBracket4 = ((netSalaryAfterDeduction - TAX_BRACKET_4) * TAX_RATE_4);
            netSalaryAfterDeduction = TAX_BRACKET_4;
        }

        if (netSalaryAfterDeduction >= TAX_BRACKET_3) {
            taxBracket3 = ((netSalaryAfterDeduction - TAX_BRACKET_3) * TAX_RATE_3);
            netSalaryAfterDeduction = TAX_BRACKET_3;
        }

        if (netSalaryAfterDeduction >= TAX_BRACKET_2) {
            taxBracket2 = ((netSalaryAfterDeduction - TAX_BRACKET_2) * TAX_RATE_2);
            netSalaryAfterDeduction = TAX_BRACKET_2;
        }

        if (netSalaryAfterDeduction < TAX_BRACKET_2) {
            taxBracket1 = ((netSalaryAfterDeduction - TAX_BRACKET_2) * TAX_RATE_1);
            netSalaryAfterDeduction = TAX_BRACKET_2;
        }

        double taxTotal = taxBracket5 + taxBracket4 + taxBracket3 + taxBracket2 + taxBracket1;

        System.out.println(String.format("Le salaire brute est de " +"%.2f", grossAnnualSalary));
        System.out.println("Vous êtes un ouvrier votre cotisation social sera de 23%");
        System.out.println("Vous êtes un cadre votre cotisation social sera de 25%");
        System.out.println(String.format("On applique la cotisation social au salaire brute ce qui fait : " +"%.2f", netSalary));
        System.out.println(String.format("La taxe de la tranche 5 est de : " + "%.2f", taxBracket5));
        System.out.println(String.format("La taxe de la tranche 4 est de : " + "%.2f", taxBracket4));
        System.out.println(String.format("La taxe de la tranche 3 est de : " + "%.2f", taxBracket3));
        System.out.println(String.format("La taxe de la tranche 2 est de : " + "%.2f", taxBracket2));
        System.out.println(String.format("Voici la taxe en totalité prélever sur votre salaire net annuel : " + "%.2f", taxTotal ));
        System.out.println(String.format("Le salaire net apès imposition est de : " + "%.2f", netSalary - taxTotal));

    }

}








































//v.3


//if (netSalary > 177106) {
//double taxBracketTotal = ((netSalary - 177106) * 0.45);
//            System.out.println("La taxe total pour un salaire supérieur à 177106 € est de " + taxBracketTotal + " c'est la tranche maximal.");
//        }
//
//                if (netSalary >= 82342) {
//double taxBracketTotal = ((177106 - netSalary) * 0.41);
//            System.out.println("La taxe total pour un salaire de la tranche entre 82341€ à 177106€ est de " + taxBracketTotal + " c'est la tranche 4.");
//        }
//
//                if (netSalary >= 28798) {
//double taxBracketTotal =((82341 - netSalary) * 0.30);
//            System.out.println("La taxe total pour un salaire de la tranche entre 28798 € à 82341 € est de " + taxBracketTotal + " c'est la tranche 3.");
//        }
//
//                if (netSalary >= 11295) {
//double taxBracketTotal = (28798 - netSalary) * 0.11;
//            System.out.println("La taxe total pour un salaire de la tranche entre 11295 € à 28798 € est de " + taxBracketTotal + " c'est la tranche 2.");
//        }
//
//                if (netSalary <= 11294) {
//        System.out.println("Vous ne payer pas de taxe supplémentaire. C'est la tranche 1.");
//        }





// v.2
// tax bracket, ici on initialise les tranches de taxe avec la plage maximum,
// on récupère la/les taxes nécessaires pour le salaire donné

//
//
// bracket tax worker, ici on initialise les tranches de salaire des ouvriers
// * on piochera la variable pour la tranche voulu
//double taxBracketWorker1 = (28797 - netSalary) * 0.11;
//double taxBracketWorker2 = (82341 - netSalary) * 0.30;
//double taxBracketWorker3 = (177106 - netSalary) * 0.41;
//double taxBracketWorker4 = (netSalary - 177106) * 0.45;

//        // si c'est un ouvrier et que le salaire est inférieur ou egale à 11.498 €.
//        if (isWorker == true && netSalaryWorker <= 11498) {
//            System.out.println(" 0 Worker dont't pay tax");
//            // si ce n'est pas un ouvrier et que le salaire est inférieur ou égale à 11.498 €.
//        } else if (isWorker == false && netSalaryManager <= 11498) {
//            System.out.println(" 0 Manager don't pay tax");
//
//
//        } else if (isWorker == true && netSalaryWorker <= 29316) {
//            double taxBracketTotal = taxBracketWorker1;
//            System.out.println(" 1 Worker Tax total: " + taxBracketTotal);
//        } else if (isWorker == false && netSalaryManager <= 29316) {
//            double taxBracketTotal = taxBracketManager1;
//            System.out.println(" 1 Manager Tax total: " + taxBracketTotal);
//
//
//        } else if (isWorker == true && netSalaryWorker <= 83823) {
//            double taxBracketTotal = taxBracket1 + taxBracketWorker2;
//            System.out.println(" 2 Worker Tax total: " + taxBracketTotal);
//        } else if (isWorker == false && netSalaryManager <= 83823) {
//            double taxBracketTotal = taxBracket1 + taxBracketManager2;
//            System.out.println(" 2 Manager Tax total: " + taxBracketTotal);
//
//
//        } else if (isWorker == true && netSalaryWorker <= 180294) {
//            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracketWorker3;
//            System.out.println(" 3 Worker Tax total: " + taxBracketTotal);
//        } else if (isWorker == false && netSalaryManager <= 180294) {
//            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracketManager3;
//            System.out.println(" 3 Manager Tax total: " + taxBracketTotal);
//
//
//        } else if (isWorker == true && netSalaryWorker > 180294) {
//            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracket3 + taxBracketWorker4;
//            System.out.println(" 4 Manager Tax total: " + taxBracketTotal);
//        } else if (isWorker == false && netSalaryManager > 180294) {
//            double taxBracketTotal = taxBracket1 + taxBracket2 + taxBracket3 + taxBracketManager4;
//            System.out.println(" 4 Manager Tax total: " + taxBracketTotal);
//        }
//    }


// v.1

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