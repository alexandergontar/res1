import java.util.ArrayList;
public class Person {
    protected String fullName;
    private ArrayList<Person> family = new ArrayList<>();
    
    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public ArrayList<Person> getFamily(){
        return family;
    }

    public void setFamily(ArrayList<Person> relatives){
        family = relatives;
    }

    @Override
    public String toString(){
        return fullName;
    }
}
