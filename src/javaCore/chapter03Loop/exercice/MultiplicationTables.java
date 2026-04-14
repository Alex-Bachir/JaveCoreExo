package javaCore.chapter03Loop.exercice;

public class MultiplicationTables {
    public static void main(String[] args) {

        // Ici, c'est un peu le même principe que les pyramides
        // La premiere boucle indique la table de multiplication si c'est, 1, 2, 3, 4 ...
        // La deuxième boucle récupère la valeur de table et fait la multiplication

        for(int table = 1; table <= 10; table++){
            System.out.println("Table de " + table + " :");
            System.out.println();
            for(int number = 1; number <= 10; number++){
                int result = table * number;
                System.out.println(table + " * " + number + " = " + result);
            }
            System.out.println();
        }
    }
}
