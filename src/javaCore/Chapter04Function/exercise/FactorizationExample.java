package javaCore.Chapter04Function.exercise;

public class FactorizationExample {
    public static void main(String[] args) {

        affichage("1");
        affichage("2");
        affichage("3");
        affichage("4");
        affichage("5");
        affichage("6");
        affichage("7");
        affichage("8");
        affichage("9");
        affichage("10");


    }

    public static void affichage(String message) {
        // out et err on peut constater que le changement c'est propager dans la methode
        System.out.println(message);
    }

}
