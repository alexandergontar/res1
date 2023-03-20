public class Model implements IModel{    
    private IDataFormatter formatter;
    public Model(IDataFormatter formatter){
       // this.formatter = new JsonFormatter();
        this.formatter = formatter;
        
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
