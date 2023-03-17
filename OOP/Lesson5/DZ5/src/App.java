import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    private static final String DATA_PATH = "contacts.csv";
   
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
