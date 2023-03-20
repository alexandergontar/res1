import java.util.List;

public interface IView {
    public String readInput(String prompt);
    public int readInteger(String prompt);
    public void showMessage(String message);
    public <T> void displayList(List<T> list);
   // public <T> void displayArray(T[] array);
    public void clearScreen(); 
}
