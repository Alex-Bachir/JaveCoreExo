package javaCore.chapter02Condition.exercice;

public class ConditionError {
    public static void main(String[] args) {

        int age = 101;

        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        }
        else if(age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        }
        else if(age == 18) {
            System.out.println("Vous êtes majeur.");
        }
        // il a oublié de mettre une limite haute car sans "age <= 59" tout ce qui sera plus grand que 18 sera forcément un adulte
        else if(age >= 18 && age <= 59) {
            System.out.println("Vous êtes un adulte.");
        }
        else if(age >= 60 && age <= 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        }
        else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

    }
}
