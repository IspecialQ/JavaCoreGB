import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] someWords = {
                "red", "dress", "chain", "shirt", "blue", "purple", "purple", "shoes", "snapback",
                "dress", "watch", "chain", "shirt", "watch", "purple"};

        uniqueWords(someWords);

        System.out.println();

        PhoneBook actorsPhoneBook = new PhoneBook();
        actorsPhoneBook.addContact("88005553535", "Schwarzenegger");
        actorsPhoneBook.addContact("89163556213", "Diaz");
        actorsPhoneBook.addContact("83272377727","Stallone");
        actorsPhoneBook.addContact("80923929543","Carrey");
        actorsPhoneBook.addContact("88004777224","Schwarzenegger");
        actorsPhoneBook.addContact("83756564530","Stallone");
        actorsPhoneBook.addContact("89203943034","Willis");


        actorsPhoneBook.foundPhone("Stallone");
        actorsPhoneBook.foundPhone("Willis");
    }

    public static void uniqueWords(String[] array) {
        HashMap<String, Integer> countWords = new HashMap<>();
        final int countOne = 1;
        for (String word : array) {
            if (countWords.containsKey(word)) {
                int count = countWords.get(word);
                countWords.put(word, count + 1);
            } else {
                countWords.put(word, countOne);
            }
        }

        System.out.println("Unique words");
        for (Map.Entry<String, Integer> wordEntry : countWords.entrySet()) {
            if (wordEntry.getValue() == countOne) {
                System.out.println(wordEntry.getKey());
            }
        }

        System.out.println("Not unique words");
        for (Map.Entry<String, Integer> wordEntry : countWords.entrySet()) {
            if (wordEntry.getValue() != countOne) {
              System.out.println(wordEntry.getKey() + " - " + wordEntry.getValue());
            }
        }
    }
}


