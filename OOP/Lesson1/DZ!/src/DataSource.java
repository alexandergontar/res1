import java.util.ArrayList;

public class DataSource implements IDataSource{
    public ArrayList<Person> loadData(){        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ирина"));
        persons.add(new Person("Вася"));
        persons.add(new Person("Маша"));
        persons.add(new Person("Женя"));
        persons.add(new Person("Ваня"));

        return persons;

    }
}
