package Lesson_07.Ex007;
 
public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100)+100);
        this.maxMana = Magician.r.nextInt(100)+50;
        this.mana = maxMana;
    }
    @Override
    public String getInfo() {
        //return String.format("%s  Mana: %d",super.getInfo(), this.mana);
        return "I am a disko dancer!";
    }
}