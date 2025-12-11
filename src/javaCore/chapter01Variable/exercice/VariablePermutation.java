package javaCore.chapter01Variable.exercice;

public class VariablePermutation {
    public static void main(String[] args) {
        int a = 7;
        int b = 12;

        // ici il a fallut creer une variable temporaire
        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);


    }
}
