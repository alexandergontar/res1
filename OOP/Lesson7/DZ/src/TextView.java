import java.util.Scanner;

public class TextView implements IView{
    private Scanner scan;

    public TextView() {
        scan = new Scanner(System.in, "Cp866");
    }

    public String readInput(String prompt) {

        System.out.print(prompt);
        try {
            String input = scan.nextLine();
            return input;
        } catch (Exception ex) {
            return ex.toString();
        }
    }
    public int readInteger(String prompt) {    
        System.out.print(prompt);
        String inputNumber = scan.nextLine();
        try {
          int n = Integer.parseInt(inputNumber);
          return n;
        } catch (Exception ex) {
          System.out.println(ex);
          return 0;
        }
      }
    public void showMessage(String message) {    
        System.out.println(message);
      }
}
