package javaCore.chapter01Variable.exercice;

public class PrimitiveOverflow {
    public static void main(String[] args) {
        short hourSecond = 3600;
        int daySecond = hourSecond * 24;
        int weekSecond = daySecond * 7;
        int monthSecond = daySecond * 30;
        int yearSecond = daySecond * 365;

        System.out.println(" Dans un jour il y'a : " + daySecond + " secondes");
        System.out.println(" Dans une semaine il y'a : " + weekSecond + " secondes");
        System.out.println(" Dans un mois il y'a : " + monthSecond + " secondes");
        System.out.println(" Dans une année il y'a : " + yearSecond + " secondes");
    }
}
