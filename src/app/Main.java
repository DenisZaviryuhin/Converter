package app;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    static double miles;
    static double convertValue;
    static final double CONST = 1.609;

    public static void main(String[] args) {
        System.out.println("Simple Converter");
        System.out.println("Converter from miles to kilometers");
        System.out.print("In km : " + doConvertKilometers());

    }

    private static String doConvertKilometers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles :");
        miles = scanner.nextDouble();
        convertValue = miles * CONST;
        return roundValue(convertValue);
    }

    public static String roundValue(double value) {
        return new DecimalFormat("#.000").format(value);
    }
}
