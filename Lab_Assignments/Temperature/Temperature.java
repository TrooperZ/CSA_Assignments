import java.util.*;

import static java.lang.Double.parseDouble;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose temperature input unit: (1) Celsius | (2) Kelvin | (3) Fahrenheit | (4) Rankine");
        String inputunit = scan.nextLine();

        System.out.println("Enter temperature");
        String inputtemp = scan.nextLine();

        System.out.println("Converted temp: ");

        if (inputunit.equals("1")){
            double k = parseDouble(inputtemp) + 273.15;
            double f = parseDouble(inputtemp) * 1.8 + 32;
            double r = parseDouble(inputtemp) * 1.8 + 491.67;
            System.out.println( "Kelvin: " + String.format("%.3f",k) + " °K");
            System.out.println( "Fahrenheit: " + String.format("%.3f",f) + " °F");
            System.out.println( "Rankine: " + String.format("%.3f",r) + " °R");
        }
        if (inputunit.equals("2")){
            double c = parseDouble(inputtemp) - 273.15;
            double f = (parseDouble(inputtemp) - 273.15) * 1.8 + 32;
            double r = (parseDouble(inputtemp) - 273.15) * 1.8 + 491.67;
            System.out.println( "Celsius: " + String.format("%.3f",c) + " °C");
            System.out.println( "Fahrenheit: " + String.format("%.3f",f) + " °F");
            System.out.println( "Rankine: " + String.format("%.3f",r) + " °R");
        }
        if (inputunit.equals("3")){
            double k = parseDouble(inputtemp) + 273.15;
            double c = (parseDouble(inputtemp) - 32) * (5.0/9.0);
            double r = parseDouble(inputtemp) + 459.67;
            System.out.println( "Celsius: " + String.format("%.3f",c) + " °C");
            System.out.println( "Kelvin: " + String.format("%.3f",k) + " °K");
            System.out.println( "Rankine: " + String.format("%.3f",r) + " °R");
        }
        if (inputunit.equals("4")){
            double k = parseDouble(inputtemp) * (5.0/9.0);
            double c = (parseDouble(inputtemp) - 491.67) * (5.0/9.0);
            double f = parseDouble(inputtemp) - 459.67;
            System.out.println( "Kelvin: " + String.format("%.3f",k) + " °K");
            System.out.println( "Fahrenheit: " + String.format("%.3f",f) + " °F");
            System.out.println( "Celsius: " + String.format("%.3f",c) + " °C");
        }

    }
}
