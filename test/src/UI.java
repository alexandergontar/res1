import java.util.Scanner;
import java.util.Arrays;

public class UI implements IUI {
  private Scanner scan;

  public UI() {
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

  public int readInteger() {

    System.out.print("Ведите  число: ");
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

  public void clearScreen() {
    System.out.print("\033[H\033[2J");// Очистка экрана
  }

  public <T> void displayArray(T[] array) {
    System.out.println(Arrays.toString(array));
  }

  public void printResultToScreen(int[] factors, double result) {
    System.out.println(" a = " + factors[0] + ", b = " + factors[1] + ", c = " + factors[2]+".");
    //System.out.println(" a ^ b + c = " + (Math.pow(factors[0], factors[1]) + factors[2]));
    System.out.println(" a ^ b + c = " + result);
  }

}
