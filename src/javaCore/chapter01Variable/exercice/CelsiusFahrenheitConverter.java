package javaCore.chapter01Variable.exercice;

public class CelsiusFahrenheitConverter {
    public static void main(String[] args) {

        double degreEnCelsius = 19;

        double degreFarenheit = (degreEnCelsius * 1.8) + 32;
        System.out.println("Celsius : " + degreEnCelsius +" ---> Fahrenheit : " + degreFarenheit);
    }
}
