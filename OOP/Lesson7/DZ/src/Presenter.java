import java.util.ArrayList;
import java.util.List;

public class Presenter {
    private List<Messenger> messengers = new ArrayList<>();
    private List<IView> views = new ArrayList<>();   
    public Presenter(){}
    public Presenter(Messenger ... messengers ){
       for (Messenger messenger : messengers) {
          this.messengers.add(messenger);
       }
    }
    public void setMesengers(Messenger ... messengers){
        for (Messenger messenger : messengers) {
            this.messengers.add(messenger);
        }
    }
    public void setViewers(IView ... views){
        for (IView view : views) {
            this.views.add(view);
        }
    }

    public void run(){    
        IView textView = views.get(0);
        while (true) {
           int index =  textView.readInteger(" Choose phone: \n 1 - Fixed,\n 2 - Mobile,\n 3 - Smart,\n 0 - Exit: ");
           index -=1;
           if (index < 0 || index > 2) {
             textView.showMessage("\n Выход ...");
             break;
           }
           this.messengers.get(index).sendMessage("message!");
        }
    }
} 
