import java.util.Random;

public class Main {
    // определяет индекс старшего бита
    static int msbIndex(double n) {
        System.out.println("i binary: " + Integer.toBinaryString((int) n));
        double x = 0;
        int i = 0;
        while (x < n) {
            x = Math.pow(2, i);
            if (x > n)
                break;
            i++;
        }
        return i - 1;
    }

    // делятся/не делятся в зависимости от флага
    static int[] findMultiples(int min, int max, int divider, Boolean flag) {
        // счетчик
        int count = 0;
        if (divider == 0) return new int[0];
        for (int index = min; index <= max; index++) {
            Boolean cond = index % divider == 0;
            if (!flag)
                cond = !cond;
            if (cond) {
                count++;
            }
        }
        System.out.println("count = " + count);
        if (count == 0)
            return null;
        // создание и заполнение массива
        int[] array = new int[count];
        count = 0;
        for (int index = min; index <= max; index++) {
            Boolean cond = index % divider == 0;
            if (!flag)
                cond = !cond;
            if (cond) {
                array[count] = index;
                count++;
            }
        }
        return array;

    }

    public static void main(String[] args) throws Exception {
        int i = new Random().nextInt(2000);
        System.out.println("i = " + i);

        int n = msbIndex(i); // номер страшего бита, считая с 0
        System.out.println("Индекс старшего бита: " + n);

        System.out.println("Max Short: " + Short.MAX_VALUE);
        // запись в массивы кратных/ некратных чисел на заданных промежутках
        int[] m1 = findMultiples(i, Short.MAX_VALUE, n, true);
        int[] m2 = findMultiples(Short.MIN_VALUE, i, n, false);
        System.out.println(m1.length);
        System.out.println(m2.length);
        /*
         * //test
         * int [] m1 = findMultiples(1, Short.MAX_VALUE, n, true);
         * int [] m2 = findMultiples(1, Short.MAX_VALUE, n, false);
         * System.out.println(m2.length + m1.length);
         * System.out.println(Short.MAX_VALUE);
         * // m2.length + m1.length = Short.MAX_VALUE
         */

    }

}
