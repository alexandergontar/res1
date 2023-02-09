public interface IUI {
  void clearScreen();
  void showMessage(String message); 
  String readInput();
  int readInteger();
  <T>void displayArray(T[] array);
  public void printResultToScreen(int[] factors, double result);
}
 