package javaCore.chapter03Loop.exercice;

public class ChessboardDrawing {
    public static void main(String[] args) {
        for(int row = 0; row < 5; row++) {
            for(int column = 0; column < 5; column++) {
                if((column + row) % 2 == 0) {
                    System.out.print(" . ");
                } else {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}
