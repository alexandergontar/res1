import Services.*;
public class BL {
    private IUI ui;    
    private ICalcul calc;
   
    public BL(IUI ui,  ICalcul calc){
        this.ui = ui;        
        this.calc = calc;
    }
    private void triangle(){
        ui.clearScreen();
        ui.showMessage("Создание \"треугольного\" числа. ");
        int number = ui.readInteger();
        int [][] triangle = calc.createNumericTriangle(number);
        ui.printArrayOfArrays(triangle);
        int sum = calc.triangleSum(number);
        ui.showMessage("\nСумма \"треугольного\" числа: "+sum);
        sum = calc.recursTriangleSum(number);
        ui.showMessage("\nСумма \"треугольного\" числа рекурсивно: "+sum);
    }
    public void run(){
      triangle();
    }

    
}
