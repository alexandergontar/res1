import java.util.Scanner;

public class Task4 {
    static String inputString() {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.print("Ведите сообщение: ");
        String input = scan.nextLine();
        if (input.trim().isEmpty()) {  // если введна пустая строка или пробелы          
            scan.close();
            throw new RuntimeException("Пустое сообщение!\nСообщение должно иметь содержание.");
        }
        scan.close();
        return input;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Task4");
        try {
           System.out.println(inputString()); 
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
        
    }
}
