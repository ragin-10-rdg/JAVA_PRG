package week4;
public class WeatherForecast {
    public double convertTemperature(double temp, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            return (temp * 9 / 5) + 32;
        } else if (unit.equalsIgnoreCase("F")) {
            return (temp - 32) * 5 / 9;
        } else {
            System.out.println("Invalid unit provided.");
            return temp;
        }
    }
    public String getWeatherAdvice(double temperature, String weatherCondition) {
        String advice = "Weather advice: ";

        if (weatherCondition.equalsIgnoreCase("Rainy")) {
            advice += "Carry an umbrella and wear waterproof gear.";
        } else if (weatherCondition.equalsIgnoreCase("Sunny")) {
            advice += "Wear sunglasses and light clothes.";
        } else if (weatherCondition.equalsIgnoreCase("Snowy")) {
            advice += "Wear a heavy coat, gloves, and boots.";
        } else {
            advice += "Check the forecast for more details.";
        }
        if (temperature < 10) {
            advice += " It’s cold! Wear warm layers.";
        } else if (temperature > 25) {
            advice += " It’s warm! Stay hydrated.";
        }

        return advice;
    }

    // Main method to test the weather forecast system
    public static void main(String[] args) {
        WeatherForecast wf = new WeatherForecast();

        double tempCelsius = 20;
        double convertedToFahrenheit = wf.convertTemperature(tempCelsius, "C");
        System.out.println(tempCelsius + "°C in Fahrenheit: " + convertedToFahrenheit + "°F");

        double tempFahrenheit = 68;
        double convertedToCelsius = wf.convertTemperature(tempFahrenheit, "F");
        System.out.println(tempFahrenheit + "°F in Celsius: " + convertedToCelsius + "°C");

        // Get weather advice
        String advice = wf.getWeatherAdvice(tempCelsius, "Sunny");
        System.out.println(advice);
    }
}
