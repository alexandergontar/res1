import java.util.Random;
public class App {
    
    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
static void heapify(int arr[], int n, int i)
{
    int largest = i; // Инициализируем наибольший элемент как корень
    int l = 2*i + 1; // левый = 2*i + 1
    int r = 2*i + 2; // правый = 2*i + 2

       // Если левый дочерний элемент больше корня
    if (l < n && arr[l] > arr[largest])
        largest = l;

      // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
    if (r < n && arr[r] > arr[largest])
        largest = r;
   // Если самый большой элемент не корень
    if (largest != i)
    {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;

      // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
        heapify(arr, n, largest);
    }
}

public static void sort(int arr[])
    {
        int n = arr.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Один за другим извлекаем элементы из кучи   
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
     static void fillArray(int [] array)
     {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
          array[i]  = rand.nextInt(20);
        }
     }
    public static void main(String[] args) throws Exception {
       int [] randomArray = new int[20];
        fillArray(randomArray);
        QuickSort quickSort = new QuickSort();
        SimpleSort simpleSort = new SimpleSort();
        Search search = new Search();
        //int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array is");
        printArray(randomArray);        
        sort(randomArray);
        System.out.println("Sorted array is");
        printArray(randomArray);
        
        //int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        fillArray(randomArray);
        System.out.println("Было");        
        printArray(randomArray);
        int low = 0;
        int high = randomArray.length - 1;
        quickSort.quickSort(randomArray, low, high);
        System.out.println("Стало");
        printArray(randomArray);
        //============================
        //int[] y = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        fillArray(randomArray);
        System.out.println("Было");        
        printArray(randomArray);
        simpleSort.bubbleSort(randomArray);
        System.out.println("Стало");
        printArray(randomArray);
        System.out.println(search.binarySearchRec(randomArray, 0, randomArray.length - 1, 10));
        
    }
}
