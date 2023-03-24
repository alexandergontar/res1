import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    protected List<IView> views = new ArrayList<>();
    public Phone(){
        views.add(new TextView());
        views.add(new BoxView());
        views.add(new UserAudio());
    }
   
    public void voiceCall(String message){        
        views.get(0).showMessage("voice >>"+message);
        views.get(2).showMessage("voice >>"+message);
    }
}
