import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Contact implements Comparable<Contact> {
    protected String name;
    protected String telNumber;
    protected List<String> numbers;

    public Contact(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
        this.numbers = new ArrayList<String>();
        this.numbers.add(telNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }


    public void addNumber(String number){
       numbers.add(number);
    }

    public void setNumbers(List<String> numbers){
        this.numbers = numbers;
    }

    public List<String> getNumbers(){
        return this.numbers;
    }


    @Override
    public String toString() {
        return String.format("%s   %s   %s"  , name, telNumber, numbers);
    }

    @Override
    public int compareTo(Contact o) {
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
       return comparator.compare(this.name, o.name);       
    }

    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Contact)) {
          return false;  
        }
        Contact c = (Contact)obj;
        return name.equals(c.name) && telNumber.equals(c.telNumber);
        
    }
}
