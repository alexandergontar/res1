import java.util.ArrayList;
//import java.util.Comparator;
public class Person implements Comparable<Person>{
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

    @Override
    public int compareTo(Person o) {
        if(this.fullName.length() > o.fullName.length()){
            return 1;
        }
        else if(this.fullName.length() < o.fullName.length()){
            return -1;
        }
        else return 0;
        
    }

   

    
}
