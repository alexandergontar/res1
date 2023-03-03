public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Пользователи открывают шкафы ключами.\n");
        Suitcase st1 = new Suitcase(17);
        Suitcase st2 = new Suitcase(5);
        System.out.println(st1.toString());
        System.out.println(st2.toString());

        int [] keys = {1, 5, 15};
        int [] keys2 = {2, 17, 20};

        User us1 = new User("Иван Иванов", keys);
        User us2 = new User("Дмитрий Петров", keys2);
        
        st1.setOpenClose(true, us1);
        System.out.println(st1.toString());
        st1.setOpenClose(true, us2);      
        System.out.println(st1.toString());
        st2.setOpenClose(true, us1);
        System.out.println(st2.toString());
    }
}
