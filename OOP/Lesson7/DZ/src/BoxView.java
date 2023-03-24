import java.awt.*;
import javax.swing.JOptionPane;
public class BoxView implements IView{
    private static final Component frame = null;
    @Override
    public String readInput(String prompt) {
        return "";        
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    @Override
    public int readInteger(String prompt) {
        return 0;        
    }    
}
