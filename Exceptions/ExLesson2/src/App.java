public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Начало");
        try {
            int а = 0;
            int b = 42 / а;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Конец");

        try {
            int a = 10;
            a -= 10;
            int b = 42 / a;
            int[] с = { 1, 2, 3 };
            с[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " +
                    e);
        }
        System.out.println("Пocлe блока операторов try/catch");
        try {
            //int a = 10;
           // a -= 10;
            //int b = 42 / a;
            int[] с = { 1, 2, 3 };
            с[42] = 99;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
