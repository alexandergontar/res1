import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View {
    private Scanner scan;

    public View() {
        scan = new Scanner(System.in, "Cp866");
    }

    public String readInput() {

        System.out.print("Ведите слово: ");
        try {
            String msg = scan.nextLine();
            return msg;
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public  void listContacts(Map<String, List<String>> contacts) {
        if (!contacts.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
                System.out.println(entry.getKey());
                for (String number : entry.getValue()) {
                    System.out.println(number);
                }
                System.out.println();
            }
        } else {
            System.out.println("No records found, the phone book is empty!");
        }

        System.out.println();
        System.out.println("Type a command or 'exit' to quit. For a list of valid commands use 'help':");
    }

    public  void showContact(Map<String, List<String>> contacts) {
        System.out.println("Enter the name you are looking for:");
        String name = scan.nextLine().trim();

        if (contacts.containsKey(name)) {
            System.out.println(name);
            for (String number : contacts.get(name)) {
                System.out.println(number);
            }
        } else {
            System.out.println("Sorry, nothing found!");
        }

        System.out.println();
        System.out.println("Type a command or 'exit' to quit. For a list of valid commands use 'help':");
    }

}
