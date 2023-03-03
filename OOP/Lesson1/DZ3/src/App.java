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
    }

}
