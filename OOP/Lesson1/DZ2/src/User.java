import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Integer> keylist = new ArrayList<>();
    //private int [] keys ;

    public User(String name, int [] keys) {
        this.name = name;
       // this.keys = keys;
        for (int key : keys) {
           keylist.add(key); 
        }
    }

    public boolean openClose(boolean open){
         return open;
    }

    public ArrayList<Integer> getKeys(){
        return keylist;
    }

    @Override
    public String toString(){
        return name;
    }
}
