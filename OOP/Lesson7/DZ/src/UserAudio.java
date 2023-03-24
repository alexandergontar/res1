import java.awt.*;
public class UserAudio implements IView{

    @Override
    public String readInput(String prompt) {
        Toolkit.getDefaultToolkit().beep();
        return  "";        
    }

    @Override
    public void showMessage(String message) {
        Toolkit.getDefaultToolkit().beep();        
    }

    @Override
    public int readInteger(String prompt) {
        Toolkit.getDefaultToolkit().beep();
        return 0;      
    }
    
}
