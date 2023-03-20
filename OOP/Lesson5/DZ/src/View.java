import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class View implements IView{
    private Scanner scan;

    public View() {
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

      public <T> void displayArray(T[] array) {
        System.out.println(Arrays.toString(array));
      }

      public <T> void displayList(List<T> list) {
       for (T item : list) {
          System.out.println(item);
       }
      }    
    
      public void clearScreen() {
        System.out.print("\033[H\033[2J");// Очистка экрана
      }


}
