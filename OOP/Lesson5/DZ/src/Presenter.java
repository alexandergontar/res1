import java.util.Collections;

public class Presenter {
    private IView view;
    private IModel model;
    private Contacts contacts;

    public Presenter(IView view, IModel model) {
        this.view = view;
        this.model = model;
        this.contacts = model.loadInfo();
    }

    private void addContact() {
        Contacts contacts = model.loadInfo();
        view.showMessage("Добавить контакт. \n");
        Contact contact = new Contact(
                view.readInput("Введите имя: "),
                view.readInput("Введите тел. номер: "));

        contacts.add(contact);
        view.displayList(contacts.getList());
        model.saveInfo(contacts);
    }

    private void listContacts() {
        contacts = model.loadInfo();
        Collections.sort(contacts.getList());
        view.displayList(contacts.getList());
    }

    private Contact findContactByName() {
        contacts = model.loadInfo();
        String name = view.readInput("Введите имя: ");
        view.showMessage("-------" + name + "-------");
        for (Contact contact : contacts) {            
            if (contact.name.equals(name)) {
                view.showMessage(name + " найден, телефон: " + contact.telNumber);
                return contact;
            }
        }
        view.showMessage("Контакт не найден.");
        return null;
    }

    private void deleteContact() {
        view.showMessage("Удаление по имени.");
        contacts = model.loadInfo();
        String name = view.readInput("Введите имя: ");
        for (Contact contact : contacts) {            
            if (contact.name.equals(name)) {
                view.showMessage(name + " найден, телефон: " + contact.telNumber);
                contacts.delete(contact);
                model.saveInfo(contacts);
                return;                
            }             
        }
        view.showMessage("Контакт не найден.");
    }

    public void mainLoop() {
        while (true) {
            String key = view.readInput(
                    " 1 - List Contacts,  2 - Add Contact, 3 - Find by name, 4 - Delete by name, 0 - Exit: \n>>");           
            view.clearScreen();    
            switch (key) {
                case "1":
                    listContacts();
                    break;
                case "2":
                    addContact();
                    break;
                case "3":
                    findContactByName();
                    break;
                case "4":
                    deleteContact();
                    break;
                case "0":
                    return;
                default:
                    view.showMessage("Такой команды нет");
                    break;
            }
        }
    }
}
