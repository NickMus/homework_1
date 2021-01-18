package hw23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {

    private HashMap<String, Set<String>> phBook = new HashMap<>();

    public void add(String name, String phone) {
        Set<String> tell = phBook.getOrDefault(name, new HashSet<>());
        tell.add(phone);
        phBook.put(name, tell);

    }
    public Set<String> get(String name) {
        return phBook.get(name);
    }
}
