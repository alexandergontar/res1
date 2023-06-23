import java.util.Arrays;

public class App {

    static class Count {
        private int count;

        public Count() {
        }

        public Count(int count) {
            this.count = count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        public void increment() {
            if (this.count < 0) {
                throw new RuntimeException("Count can't be negative, check your input!!");
            }
            this.count++;
        }
    }

    static void loop(int bound, Count count) {
        for (int index = 0; index < bound; index++) {
            count.increment();
        }
    }

    static int displayCount(Count count) {
        if (count == null) {
            throw new NullPointerException("Your count object is null!!");
        }
        return count.getCount();
    }

    static int[] trimArray(int[] array, int bound) {
        if (bound < 0 || bound > array.length) {
            throw new ArrayIndexOutOfBoundsException("Check your index, it is out of bounds!!");
        }
        int[] newArray = new int[bound];
        for (int index = 0; index < bound; index++) {
            newArray[index] = array[index];
        }
        return newArray;
    }

    static int [] subtractTwoArrays(int [] arrayA, int [] arrayB){
       if (arrayA.length != arrayB.length) {
         throw new RuntimeException("Arrays' length is not equal, check you input data!!");
       }
        int [] outputArray = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
          outputArray[i] = arrayA[i] - arrayB[i];  
        }
        return outputArray;
    }

    public static void main(String[] args) throws Exception {
        Count count = new Count(10);
        System.out.println("Check methode 1:");// case 1
        try {

            System.out.println(displayCount(count));
            count = null;
            System.out.println(displayCount(count));
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Check methode 2:");// case 2
        int[] array = { 0, 1, 2, 3, 4, 5 };
        try {
            System.out.println(Arrays.toString(trimArray(array, 3)));
            System.out.println(Arrays.toString(trimArray(array, 7)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Check methode 3:");// case 3
        try {
            count = new Count(0);
            count.increment();
            System.out.println(count.getCount());
            count.setCount(-3);
            count.increment();
            System.out.println(count.getCount());

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Check methode 4:");// case 3
        int[] arrayA = { 0, 1, 2, 3, 4, 5 };
        int[] arrayB = { 5, 4, 3, 2, 1, 0 };
        int[] arrayC = { 5, 4, 3 };
        subtractTwoArrays(arrayA, arrayB);
        System.out.println(Arrays.toString(subtractTwoArrays(arrayA, arrayB)));
        System.out.println(Arrays.toString(subtractTwoArrays(arrayA, arrayC)));
    }

}
