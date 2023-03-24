public class FixedPhone extends Phone implements Messenger{  

    public void sendFax(String message){       
        views.get(0).showMessage("fax >>"+message);
    }
    @Override
    public void sendMessage(String message) {
        voiceCall(message);
        sendFax(message);     
    }
}
