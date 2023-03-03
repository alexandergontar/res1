//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
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
    }
  
}
