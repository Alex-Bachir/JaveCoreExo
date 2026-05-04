package javaCore.Chapter04Function.practice;

public class PracticeFunctionParameter {

    public static void main(String[] args) {

        displaySection(1, "Bonjour");

        System.out.println();

        displaySection(2, "salut salut");

        System.out.println();

        displaySection(3, "au revoir");


    }

    public static void displaySection(int sectionNumber, String sectionContent) {

        System.out.println("-- Début de section " + sectionNumber);
        displaySeparator();
        System.out.println("-- Contenus de section " + sectionNumber);
        System.out.println(sectionContent);
        displaySeparator();
        System.out.println("-- Fin de la section "  + sectionNumber);


    }

    public static void displaySeparator() {
        System.out.println("--------------------");
    }




}
