public class MobilePhone extends FixedPhone implements Messenger{
    
    public void sendSMS(String message){       
        views.get(1).showMessage("sms >>"+message);
    }
    @Override
    public void sendMessage(String message) {
        voiceCall(message);
        sendFax(message);
        sendSMS(message);        
    }
}
