import java.util.Scanner;

public class App {
    

    static float inputFloatNumber() {
        Scanner scan = new Scanner(System.in, "Cp866");
        float result = 0;
        while (true) {
            try {
                System.out.print("Введите  число: ");
                String inputNumber = scan.nextLine();
                result = Float.parseFloat(inputNumber);                
                scan.close();
                break;
            } catch (NumberFormatException e) {                
                System.out.println("Проверьте ввод!!!");
            }

        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        // 1
        System.out.println("Задание 1: ");
        System.out.println(inputFloatNumber());
        // 2
        System.out.println("Задание 2: ");
        int [] intArray = {0, 1, 2, 3, 4, 5, 6}; // добавляем входной массив
        try {
           // int d = 0;
            int d = 2; // избегаем деления на ноль
           // double catchedRes1 = intArray[8] / d;
            double catchedRes1 = intArray[5] / d; // избегаем выход за границы массива
            System.out.println("catchedRes1 = " + catchedRes1);
            // перехвытываем эти исключения, если не избежали выше
        } catch (IndexOutOfBoundsException | ArithmeticException e) { 
            System.out.println("Catching exception: " + e);
        }


    }
}
