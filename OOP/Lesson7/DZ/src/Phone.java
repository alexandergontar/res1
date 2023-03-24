import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    protected List<IView> views = new ArrayList<>();
   
    public void voiceCall(String message){
        System.out.println("voice >> "+message);
        //views.get(0).showMessage("voice >>"+message);
    }

}
