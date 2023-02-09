import Services.*;
import Model.*;

//import java.io.FileNotFoundException;
import java.io.IOException;

//import java.util.Arrays;
public class BL {
    private IUI ui;
    private IReadWrite rw;
    private ICalcul calc;
    private IDataModel model;

    private final String INFILE = "notes.txt";
    private final String OUTFILE = "notes_new.txt";

    public BL(IUI ui, IReadWrite rw, ICalcul calc, IDataModel model) {
        this.ui = ui;
        this.rw = rw;
        this.calc = calc;
        this.model = model;
    }

    private void testIO() throws IOException {
        ui.clearScreen();
        ui.showMessage("Вычисление выражения:");

        String[] data = rw.readDataFromFile(INFILE);
        ui.displayArray(data);
        // int [] factors = calc.parseFactors(data);
        model.setFactors(calc.parseFactors(data));
        double result = calc.polynomeResult(model.getFactors());
        ui.printResultToScreen(model.getFactors(), result);
        rw.printResultToFile(model.getFactors(), result, OUTFILE);

    }

    public void run() {
        try {
            testIO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
