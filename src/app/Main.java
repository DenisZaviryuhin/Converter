package app;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    static double kilometers;
    static double convertValue;
    static final double CONST = 1.609;

    public static void main(String[] args) {
        System.out.println("Converter from kilometers to miles v2.0");
        System.out.print( "In miles : " + doConvertMiles());

    }
    private static String doConvertMiles(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kilometers :");
        kilometers = scanner.nextDouble();
        convertValue = kilometers / CONST;
        return roundValue(convertValue);
    }
    public static String roundValue(double value) {
        return new DecimalFormat("#.000").format(value);
    }
}