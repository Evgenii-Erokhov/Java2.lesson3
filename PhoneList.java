package lesson3;

import java.util.Set;

public interface PhoneList {

    void add(String lastname, String number);

    Set<String> get(String lastname);

    Set<String> getLastnames();
}
