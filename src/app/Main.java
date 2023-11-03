package app;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    static double kms;
    static double convertValue;

    public static void main(String[] args) {
        System.out.println("Converter from miles to kilometers");
        System.out.print("In kilometers : " + doConvertMiles());

    }

    private static String doConvertMiles() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles :");
        kms = scanner.nextDouble();
        convertValue = kms * 1.609;
        return roundValue(convertValue);
    }

    public static String roundValue(double value) {
        return new DecimalFormat("#.000").format(value);
    }
}