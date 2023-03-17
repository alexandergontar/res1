import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contacts implements Iterable<Contact>{
    List<Contact> contacts;
    public Contacts(){
       contacts = new ArrayList<Contact>();
    }
    public void add(Contact contact) {
        contacts.add(contact);
    }
    
    public void delete(Contact contact){
        contacts.remove(contact);
    }
    public List<Contact> getList(){
        return contacts;
    }
    @Override
    public Iterator<Contact> iterator() {
        return contacts.iterator();       
    }
}
