import Services.*;

//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Arrays;
public class BL {
   private IUI ui;
   private IReadWrite rw;
   private ICalcul calc;

   private final  String INFILE = "notes.txt";
   private final  String OUTFILE = "notes_new.txt";
    public BL(IUI ui, IReadWrite rw, ICalcul calc){
      this.ui = ui;
      this.rw = rw;
      this.calc = calc;
    }

    private void testIO() throws IOException {        
        ui.clearScreen();
        ui.showMessage("Вычисление выражения:");
             
        String[] data = rw.readDataFromFile(INFILE);        
        ui.displayArray(data);
        int [] factors = calc.parseFactors(data);
        double result = calc.polynomeResult(factors);
        
        ui.printResultToScreen(factors, result);
        rw.printResultToFile(factors, result, OUTFILE);
        
    }

    public void run(){
        try {
            testIO();
        } catch (Exception e) {            
            e.printStackTrace();
        } 
    }
    
}
