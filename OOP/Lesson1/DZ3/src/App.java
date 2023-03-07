import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Кошечки собачки");
        IPet cat = new Cat("Мурзик", 10.00f);
        IPet dog = new Dog("Тобик", 15.00f);
        IBird canary = new Canary("Тимка",15.00f );
        ITalkingBird parrot = new Parrot("Попка",25.00f );
        
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(parrot.toString());
        System.out.println(canary.toString());
        
        Master misha = new Master("Миша");
        Master vasya = new Master("Вася");
        Master petia = new Master("Петя");

        System.out.println(misha.toString());
        System.out.println(vasya.toString());
        System.out.println(petia.toString());
        // добавление хозяев некторым питомцам
        cat.addMaster(misha);
        dog.addMaster(petia);

        misha.callPet(cat);
        petia.callPet(dog);
        vasya.callPet(dog);

        misha.callPet(canary);
        vasya.callPet(parrot);

        canary.fly(); canary.sing();
        parrot.fly(); parrot.sing();
        parrot.talk();

        //===создание списков и сортировка ====

        ArrayList<IPet> plist = new ArrayList<>();
        ArrayList<Cat> clist = new ArrayList<>();
        ArrayList<Dog> dlist = new ArrayList<>();

        plist.add(cat);
        plist.add(dog);
        plist.add(new Cat("barsik", 10.00f));
        plist.add(new Cat("pushok", 11.00f));
        plist.add(new Dog("tuzik", 11.00f));
        plist.add(new Dog("charlie", 11.00f));
        plist.add(new Dog("barbos", 11.00f));
        plist.add(new Dog("bobik", 11.00f));
        plist.add(new Dog("trezor", 11.00f));

        for (IPet pet : plist) {
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
