public class SmartPhone extends MobilePhone implements Messenger{
   
    public void sendEmail(String message){
       
        views.get(1).showMessage("e-mail >>"+message);
    }
    @Override
    public void sendMessage(String message) {
      voiceCall(message);
      sendFax(message);
      sendSMS(message);
      sendEmail(message);
       
    }
}
