public class Model {    
    private JsonFormatter formatter;
    public Model(){
        formatter = new JsonFormatter();
    }
    
    public Contacts loadInfo(){
        Contacts contacts = new Contacts();        
        formatter.Read(contacts, "contacts.json");
        return contacts;
    }

    public void saveInfo(Contacts contacts){       
       
        formatter.Write(contacts, "contacts.json");
    }
}
