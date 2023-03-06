import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Кошечки собачки");
        Pet p1 = new Cat("Мурзик", 10.00f);
        Pet p2 = new Dog("Тобик", 15.00f);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Master misha = new Master("Миша");
        Master vasya = new Master("Вася");
        Master petia = new Master("Петя");

        System.out.println(misha.toString());
        System.out.println(vasya.toString());
        System.out.println(petia.toString());
        // добавление хозяев питомцам
        p1.addMaster(misha);
        p2.addMaster(petia);

        misha.callPet(p1);
        petia.callPet(p2);
        vasya.callPet(p2);
        ArrayList<Pet> plist = new ArrayList<>();
        ArrayList<Cat> clist = new ArrayList<>();
        ArrayList<Dog> dlist = new ArrayList<>();

        plist.add(p1);
        plist.add(p2);
        plist.add(new Cat("barsik", 10.00f));
        plist.add(new Cat("pushok", 11.00f));
        plist.add(new Dog("tuzik", 11.00f));
        plist.add(new Dog("charlie", 11.00f));
        plist.add(new Dog("barbos", 11.00f));
        plist.add(new Dog("bobik", 11.00f));
        plist.add(new Dog("trezor", 11.00f));

        for (Pet pet : plist) {
            if (pet instanceof Dog) {
                dlist.add((Dog) pet);
            }
            if (pet instanceof Cat) {
                clist.add((Cat) pet);
            }

        }
       System.out.printf("dogs: %d, cats: %d", dlist.size(), clist.size());
    }
}
