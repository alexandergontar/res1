public class FixedPhone extends Phone implements Messenger{
  

    public void sendFax(String message){
        System.out.println("fax >> "+message);
    }

    @Override
    public void sendMessage(String message) {
        voiceCall(message);
        sendFax(message);
      
    }
}
