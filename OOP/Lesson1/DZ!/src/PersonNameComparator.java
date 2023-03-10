import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
    public PersonNameComparator(Boolean reverse){
        if(reverse) comparator = comparator.reversed();
    }
    public PersonNameComparator(){
        
    }
    
    @Override
    public int compare(Person p1, Person p2) {      
        
        return comparator.compare(p1.fullName, p2.fullName);        
    }

}
