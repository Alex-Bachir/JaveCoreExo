package javaCore.chapter02Condition.practice;

public class PracticeOperator {

    public static void main(String[] args) {
        int a =30;
        int b = 40;

        boolean isEqual = a == b;
        boolean isNotEqual = a != b;

        System.out.println("Est ce que " + a + " est different de " + b +" : " + isNotEqual);

        System.out.println(isEqual);
        // ici prendre conscience qu'il  y'a une priorité de calcul ensuite de comparaison et pour finir l'affectation
        boolean priorityTest = 10 + a == 40;

        System.out.println(priorityTest);

        boolean isDoubleLessThanInt = 5.5 < 6;

        System.out.println(" test inter type (5.5 < 6) : " +  isDoubleLessThanInt);



    }
}
