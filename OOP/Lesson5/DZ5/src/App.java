import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    private static final String DATA_PATH = "contacts.csv";
    private static void loadContacts(Map<String, List<String>> contacts) {
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {

            Pattern pattern = Pattern.compile("^([^,\"]{2,50}),\"([0-9+, ]+)\"$");

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }

                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String[] numbers = matcher.group(2).split(",\\s*");
                    contacts.put(matcher.group(1), Arrays.asList(numbers));
                }
            }

        } catch (IOException ioex) {
            System.err.println("Could not load contacts, phone book is empty!");
        }
    }
    public static void main(String[] args) throws Exception {
        Map<String, List<String>> contacts = new TreeMap<>();
        //loadContacts(contacts);
        Model model = new Model(DATA_PATH);
        model.loadContacts(contacts);
        View view = new View();
        view.listContacts(contacts);
        view.showContact(contacts);
        System.out.println("Hello, World!");
    }
}
