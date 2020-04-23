package lesson3;

import java.util.Set;

public class List {

    public static void main(String[] args) {
        PhoneList phonelist = new Phone();
        phonelist.add("Lermontov", "3215648");
        phonelist.add("Pushkin", "1235489");
        phonelist.add("Tsoi", "2135875");
        phonelist.add("Tolstoi", "6849561");
        phonelist.add("Lermontov", "2315435");

        Set<String> lastnames = phonelist.getLastnames();
        for (String lastname : lastnames) {
            Set<String> numbers = phonelist.get(lastname);
            System.out.printf("%s: %s%n", lastname, numbers);
        }
    }
}
