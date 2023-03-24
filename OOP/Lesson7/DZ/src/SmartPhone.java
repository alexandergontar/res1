public class SmartPhone extends MobilePhone implements Messenger{
   
    public void sendEmail(String message){
        System.out.println("e-mail >> "+message);
    }
    @Override
    public void sendMessage(String message) {
      voiceCall(message);
      sendFax(message);
      sendSMS(message);
      sendEmail(message);
       // throw new UnsupportedOperationException("Unimplemented method 'sendMessage'");
    }
}
