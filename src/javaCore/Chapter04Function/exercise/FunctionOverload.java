package javaCore.Chapter04Function.exercise;

public class FunctionOverload {

    public static void main(String[] args) {

        int result1 = sum(2, 8, 5);
        System.out.println(result1);



    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }



}
