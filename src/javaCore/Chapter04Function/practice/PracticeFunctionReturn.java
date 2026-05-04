package javaCore.Chapter04Function.practice;

public class PracticeFunctionReturn {
    public static void main(String[] args) {

        int result1 = sumNumbers(8, 4);
        System.out.println(result1);

        int result2 = sumNumbers(14, 7);
        System.out.println(result2);

        int result3 = sumNumbers(25, 9);
        System.out.println(result3);


    }

    public static int sumNumbers(int number1, int number2) {


        int result = number1 + number2;

        return result;


    }
}
