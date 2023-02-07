import Services.*;

import java.io.FileNotFoundException;
public class BL {
    IUI ui;
    IReadWrite rw;
    ICalcul calc;

    final  String INFILE = "notes.txt";

    public BL(IUI ui, IReadWrite rw, ICalcul calc){
      this.ui = ui;
      this.rw = rw;
      this.calc = calc;
    }

    private void testIO() throws FileNotFoundException {        
        ui.clearScreen();
        ui.showMessage("Добрый день");
        int num = ui.readInteger();
        int result = calc.MultiplyBy5(num);
        ui.showMessage("Результат: " + result);      
        String msg = ui.readInput();
        ui.showMessage(msg);        
        String [] arr = {"12","Бобик", "Tobik"};
        ui.displayArray(arr);        
        String[] arr1 = rw.readDataFromFile(INFILE);        
        ui.displayArray(arr1);
        
    }

    public void run() {
        try {
            testIO();
        } catch (FileNotFoundException e) {            
            e.printStackTrace();
        } 
    }
    
}
