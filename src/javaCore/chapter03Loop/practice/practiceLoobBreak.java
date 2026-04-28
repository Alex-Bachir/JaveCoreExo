package javaCore.chapter03Loop.practice;

public class practiceLoobBreak {

    public static void main (String[] args) {

        int num = 0;
        for( num = 0; num <=10; num++) {
            if (num == 3) {
                break;
            }
            System.out.println(num);
        }

    }
}
