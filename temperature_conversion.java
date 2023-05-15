import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Tool");
        System.out.println("----------------------------");

        System.out.print("Enter conversion type (1 for Fahrenheit to Celsius, 2 for Celsius to Fahrenheit): ");
        int conversionType = scanner.nextInt();

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        double convertedTemperature;

        if (conversionType == 1) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C");
        } else if (conversionType == 2) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F");
        } else {
            System.out.println("Invalid conversion type. Please enter 1 or 2.");
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

