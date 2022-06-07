import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    final HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String phone, String name) {
        phoneBook.put(phone, name);
    }

    public ArrayList<String> foundPhone(String name) {
        ArrayList<String> result = new ArrayList<>();

        for(Map.Entry<String, String> phoneEntry : phoneBook.entrySet()) {
            if (phoneEntry.getValue().equals(name)) {
                result.add(phoneEntry.getKey());
            }
        }
        System.out.println(result + " - " + name);
        return result;
    }
}
