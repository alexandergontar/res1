public class Presenter {
    private View view;
    private Model model;

    public Presenter (View view, Model model){
       this.view = view;
       this.model = model;
    }

    public void addContact(){
        Contacts contacts =  model.loadInfo();
        view.showMessage("Добавить контакт. \n");
        Contact contact = new Contact(
                view.readInput("Введите имя: "),
                view.readInput("Введите тел. номер: "));

        contacts.add(contact);
        view.displayList(contacts.getList());        
        model.saveInfo(contacts);
    }

    public void listContacts(){
        Contacts contacts =  model.loadInfo();
        view.displayList(contacts.getList());
    }
    

}
