//import java.io.FileNotFoundException; // не нужно, код не работает с файлами

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            // abc = null; // будет пойман первым блокм catch - NullPointerException
            //abc[3] = 9; // будет пойман вторым блоком catch - IndexOutOfBoundsException
            abc[1] = 9; // избегает IndexOutOfBoundsException
        } /*
           * catch (Throwable ex) { // суперкласс делает недоступными все блоки catch нмже
           * System.out.println("Что-то пошло не так...");
           * }
           */catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) // throws FileNotFoundException / не нужно, метод не работает с
                                                      // файлами
    {
        System.out.println(a + b);
    }

}
