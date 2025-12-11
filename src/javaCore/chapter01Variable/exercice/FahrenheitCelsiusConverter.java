package javaCore.chapter01Variable.exercice;

public class FahrenheitCelsiusConverter {
    public static void main(String[] args) {

        double degreEnFahrenheit = 69;
        double degreEnCelsius = (degreEnFahrenheit - 32) / 1.8;
        System.out.println("Fahrenheit : " + degreEnFahrenheit + " ---> Celsius : " + degreEnCelsius);
    }
}
