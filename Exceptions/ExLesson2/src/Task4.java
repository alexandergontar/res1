import java.util.Scanner;
public class Task4 {
    static float inputFloatNumber() {
        Scanner scan = new Scanner(System.in, "Cp866");
        float result = 0;
        while (true) {
            try {
                System.out.print("Ведите  число: ");
                String inputNumber = scan.nextLine();
                if(inputNumber.trim().isEmpty()){
                    System.out.println("String is empty or contains spaces only!");
                }               
                
                result = Float.parseFloat(inputNumber);                
                scan.close();
                break;
            } catch (NumberFormatException e) {                
                System.out.println("Check your input!!!");
            }

        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Task4");
        System.out.println(inputFloatNumber());
    }
}
