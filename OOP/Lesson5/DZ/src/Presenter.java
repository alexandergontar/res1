public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }
    public void addContact() {
        Contacts contacts = model.loadInfo();
        view.showMessage("Добавить контакт. \n");
        Contact contact = new Contact(
                view.readInput("Введите имя: "),
                view.readInput("Введите тел. номер: "));

        contacts.add(contact);
        view.displayList(contacts.getList());
        model.saveInfo(contacts);
    }
    public void listContacts() {
        Contacts contacts = model.loadInfo();
        view.displayList(contacts.getList());
    }

    public void findContactByName(){
        Contacts contacts = model.loadInfo();
        String name = view.readInput("Введите имя: ");
        view.showMessage("-------"+name+"-------");
        for (Contact contact : contacts) {
            System.out.println(contact.name);
            if (contact.name.equals(name)) {
                view.showMessage(name+" найден, телефон: "+ contact.telNumber);
            }
        }
    }
    public void userInterfaceLoop() {
        while (true) {
            String key = view.readInput(" 1 - List Contacts,  2 - Add Contact, 3 - Find by name,  0 - Ecit: \n>>");
            view.showMessage("\033[H\033[J");
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
                case "0":
                    return;
                default:
                    view.showMessage("Такой команды нет");
                    break;
            }
        }

    }

}
