package lesson3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Quantity {

    private static String[] data = {
        "Lermontov",
        "Pushkin",
        "Tsoi",
        "Lermontov",
        "Tolstoi",
        "Tsoi"
    };


    public static void main(String[] args) {
        Map<String, Integer> frequencyByLastname = new LinkedHashMap<>();
        for (String str : data) {
            Integer frequency = frequencyByLastname.getOrDefault(str, 0);
            frequencyByLastname.put(str, frequency + 1);
        }
        for (String str : frequencyByLastname.keySet()) {
            Integer frequency = frequencyByLastname.get(str);
            System.out.println(str + ": " + frequency);
        }
    }
}
