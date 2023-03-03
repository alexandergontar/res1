import java.util.ArrayList;

public class Pet {

    protected float price = 00.f;
    protected String name;
    protected ArrayList<Master> masters = new ArrayList<>();

    public Pet(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void voice(Master m) {

    }

    public float getPrice() {
        return price;
    }

    public void addMaster(Master master) {
        masters.add(master);
    }
}
