package wk6;

import java.util.HashMap;
import java.util.Map;

public class Task11 {
    public static void main(String[] args) {
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Nepal", "Kathmandu");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Pakistan", "Islamabad");
        countryCapitals.put("Bangladesh", "Dhaka");
        countryCapitals.put("Sri Lanka", "Colombo");

        printMap(countryCapitals);
        String country = "Nepal";
        System.out.println("\nCapital of " + country + ": " + getCapital(countryCapitals, country));
        String capital = "Dhaka";
        System.out.println("Does the capital " + capital + " exist? " + containsCapital(countryCapitals, capital));
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }

    public static void printMap(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
    public static String getCapital(HashMap<String, String> map, String country) {
        return map.getOrDefault(country, "Capital not found");
    }
    public static boolean containsCapital(HashMap<String, String> map, String capital) {
        return map.containsValue(capital);
    }
}



