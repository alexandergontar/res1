
//import java.util.ArrayList;
//import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");

        if (ivan instanceof Person) {
            ivan = (Person) ivan;
        }

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        irina.setFamily(new Reserch(gt).getRelatives(irina, Relationship.parent));
        vasya.setFamily(new Reserch(gt).getRelatives(vasya, Relationship.parent));

        UI ui = new UI();
        ui.viewRelatives(vasya);
        ui.viewRelatives(irina);

        Box<Integer> b  = new Box<>();
        Integer [] arr = {1, 2, 3, 4};
        b.setArray(arr);
        Integer [] ar = b.getArray();
        b.dispArray(ar);
    }

}

class Box<T> {
    // T stands for "Type"    
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }
    public T [] getArray() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        return array;
    }

    public void dispArray(T[] array){
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }


}
