package Characters;

public abstract  class Hero {
    protected int speed = 5;
    public abstract void personalGreeting();

    public  void greeting(){
        System.out.println("Идущие на смерть  приветствуют тебя!");  
    }   
    
    public void displaySpeed(){
        System.out.println(speed);
    }
}
