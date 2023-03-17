public class Model {    
    public Contacts loadInfo(){
        Contacts contacts = new Contacts();
        JsonFormatter formatter = new JsonFormatter();
        formatter.Read(contacts, "contacts.json");
        return contacts;
    }

    public void saveInfo(Contacts contacts){       ;
        JsonFormatter formatter = new JsonFormatter();
        formatter.Write(contacts, "contacts.json");
    }
}
