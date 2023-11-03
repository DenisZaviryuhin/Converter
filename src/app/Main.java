package app;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    static double miles;
    static double kilometers;
    static double convertValue;
    static final double CONST = 1.609;

    public static void main(String[] args) {
        System.out.println("Simple Converter");
        System.out.println("Converter from miles to kilometers");
        System.out.print("In km : " + doConvertKilometers());
        System.out.println("Converter from kilometers to miles v2.0");
        System.out.print( "In miles : " + doConvertMiles());

    }

    private static String doConvertKilometers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles :");
        miles = scanner.nextDouble();
        convertValue = miles * CONST;
        System.out.print("Enter kilometers :");
        kilometers = scanner.nextDouble();
        convertValue = kilometers / CONST;
        return roundValue(convertValue);
    }
    public static String roundValue(double value) {
        return new DecimalFormat("#.000").format(value);
    }
}
