import java.util.Comparator;

public class Contact implements Comparable<Contact> {
    protected String name;
    protected String telNumber;

    public Contact(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
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

    @Override
    public String toString() {
        return String.format("%s    %s", name, telNumber);
    }

    @Override
    public int compareTo(Contact o) {
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
       return comparator.compare(this.name, o.name);       
    }
}
