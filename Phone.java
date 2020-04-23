package lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phone implements PhoneList {

    private Map<String, Set<String>> numbersByLastname = new TreeMap<>();

    @Override
    public void add(String lastname, String number) {
        Set<String> numbers = getNumbers(lastname);
        numbers.add(number);
    }

    private Set<String> getNumbers(String lastname) {
        Set<String> numbers = numbersByLastname.getOrDefault(lastname, new HashSet<>());
        if (numbers.isEmpty()) {
            numbersByLastname.put(lastname, numbers);
        }
        return numbers;
    }

    @Override
    public Set<String> get(String lastname) {
        return getNumbers(lastname);
    }

    @Override
    public Set<String> getLastnames() {
        return numbersByLastname.keySet();
    }
}