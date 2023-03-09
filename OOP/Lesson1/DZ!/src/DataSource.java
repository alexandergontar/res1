import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataSource implements IDataSource{
    ArrayList<Person> persons = new ArrayList<>();
    //Map<Person, Person> children = new HashMap<Person, Person>();
    public ArrayList<Person> loadData(){      
        
        persons.add(new Person("Ирина"));
        persons.add(new Person("Вася"));
        persons.add(new Person("Маша"));
        persons.add(new Person("Женя"));
        persons.add(new Person("Ваня"));

        putChildren();

        return persons;
    }

    private void putChildren(){
        persons.get(0).addChild(persons.get(1));
        persons.get(0).addChild(persons.get(2));
        persons.get(1).addChild(persons.get(3));
        persons.get(1).addChild(persons.get(4));
       // persons.get(0).children.add(persons.get(1));
       // persons.get(0).children.add(persons.get(2));
       // persons.get(1).children.add(persons.get(3));
       // persons.get(1).children.add(persons.get(4));
    }
}
