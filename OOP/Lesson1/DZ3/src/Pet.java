import java.util.ArrayList;

public abstract class Pet implements Comparable<Pet>{

    protected float price = 00.f;
    protected String name;
    protected ArrayList<Master> masters = new ArrayList<>();

    public Pet(String name, float price) {
        this.name = name;
        this.price = price;
    }

    //public abstract void voice(Master m);
    @Override
    public int compareTo(Pet o1){
        return (int)(this.price - o1.price);
        //return 0;
    } 

    public float getPrice() {
        return price;
    }

    public void addMaster(Master master) {
        masters.add(master);
    }
}
