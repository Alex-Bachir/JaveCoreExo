package javaCore.chapter03Loop.exercice;

public class BasicStopwatch {
    public static void main(String[] args) throws InterruptedException {

        int i       = 0;
        int seconde = 0;
        int minute  = 0;
        int hour    = 0;

        /*
         * Une boucle while qui itèrera 100x grâce à l'incrémentation de la variable i (à la fin de la boucle)
         */
        while(i < 100) {

            /*
             * Effectue une "pause" de 1000 millisecondes / 1 seconde
             */
            Thread.sleep(1000);
            System.out.println("1 seconde s'est écoulée");

            /*
             * Incrémente "i = i + 1;" pour atteindre la condition de la boucle while
             */
            i++;
        }

    }
}
