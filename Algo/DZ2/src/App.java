import java.util.Random;

public class App {

    static void heapify(int array[], int heapSize, int currentRoot) {
        int largest = currentRoot; // Сначала индексом наибольшего элемента считаем индекс корня
        // находим индексы детей
        int leftChild = 2 * currentRoot + 1; // левый
        int rightChild = 2 * currentRoot + 2; // правый

        // Если левый больше корня, то пока он наибольший
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        // Если правый больше, чем наибольший, то теперь он наибольший
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;
        // Если наибольний не корень, то они меняются значениями
        if (largest != currentRoot) {
            int tmp = array[currentRoot];
            array[currentRoot] = array[largest];
            array[largest] = tmp;
            // И рекурсивно идем ниже по дереву, теперь текущий корень - бывший наибольший
            // сын
            heapify(array, heapSize, largest);
        }
    }

    public static void sort(int array[]) {
        int arraySize = array.length;

        // Построение кучи (начальный индекс - середина массива, начало правой части
        // дерева) Дальше просеиваем (heapify) пока не дойдем до 0, теперь array[0] = max
        for (int i = arraySize / 2 - 1; i >= 0; i--)
            heapify(array, arraySize, i);

        // Переставляем array[0] с последним элементом
        for (int i = arraySize - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец, а последний элемент на его место
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Делаем просеивание, пока размер кучи будет уменьшаться с i-- до 0
            heapify(array, i, 0);
        }
    }

    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    static void fillArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
    }

    public static void main(String[] args) throws Exception {
        int[] randomArray = new int[20];
        fillArray(randomArray);
        System.out.println("Исходный массив:");
        printArray(randomArray);
        sort(randomArray);
        System.out.println("Отсортированный массиив:");
        printArray(randomArray);
    }
}
