public class MobilePhone extends FixedPhone implements Messenger{
    
    public void sendSMS(String message){
        System.out.println("sms >> "+message);
    }
    @Override
    public void sendMessage(String message) {
        voiceCall(message);
        sendFax(message);
        sendSMS(message);
        //throw new UnsupportedOperationException("Unimplemented method 'sendMessage'");
    }

}
