import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       /*  Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack());
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());*/
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = rand.nextInt( teamCount);
        int priestCount = teamCount - magicianCount;
        System.out.println("======================================");
        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount];
        Magician[] magicians = new Magician[magicianCount]; 

        for (int i = 0; i < priestCount; i++) {
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }


    }
}
