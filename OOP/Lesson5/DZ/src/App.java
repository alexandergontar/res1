import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        
        /*Contacts outputContacts = new Contacts();
       
        Model model = new Model();
        View view = new View();
        
        outputContacts = model.loadInfo();
        view.displayList(outputContacts.getList());        

        
        view.showMessage("Добавить контакт. \n");
        Contact contact = new Contact(
                view.readInput("Введите имя: "),
                view.readInput("Введите тел. номер: "));

        outputContacts.add(contact);
        view.displayList(outputContacts.getList());
        
        model.saveInfo(outputContacts);*/

        Presenter presenter = new Presenter(new View(), new Model());
        presenter.listContacts();
        presenter.addContact();

      

    }
}
