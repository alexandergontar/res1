package Services;
import java.util.Arrays;

public class Calcul implements ICalcul {
    
    public  int [][] createNumericTriangle(int num) { // " Визуальное представление "треугольного числа  
    System.out.printf("\nВизуальное представление 'треугольного числа' %d\n", num);
    
    int [][] arrays = new int [num][];

    for(int i = 1; i <= num ; i++){
        int[] array = new int[i];
        for(int j = 1; j <= i ; j++){
            array[j-1] = j;  
        }
        System.out.println (Arrays.toString( array));
        arrays[i-1] = array;
    }
    return arrays;
}
public int triangleSum(int num) { //Вычисление "треугольного числа" по формуле f(n) =  0,5 * n * (n+1)
int result = (int) (0.5 * num*(num +1));
//System.out.printf("\nЗначение треугольного числа (по формуле) при размерности %d равно %d\n", num ,result);
return(result);
}

public int recursTriangleSum(int num) { // Вычисление "треугольного числа" с использованием рекурсии
int result = 1;
if (num == 1 || num == 0) {
    //System.out.printf("\nЗначение треугольного числа (с рекурcией) при размерности %d равно %d",num ,result);
    return result;
}
result = num + recursTriangleSum(num-1);  
//System.out.printf("\nЗначение треугольного числа (с рекурcией) при размерности %d равно %d",num ,result);
return(result);
}
}
