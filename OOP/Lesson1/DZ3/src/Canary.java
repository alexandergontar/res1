public class Canary extends Pet implements IBird{

    public Canary(String name, float price) {
        super(name, price);
        
    }

    @Override
    public void voice(Master m) {
        System.out.println("Tweet - tweet - tweet!" );
    }

    public void fly(){
      System.out.println("Канарейка " + super.name + " летит." );
    }

    public void sing(){
        System.out.println("Канарейка " + super.name + " поет." ); 
    }
    @Override
    public String toString(){
        return String.format("Кенаря зовут %s цена: %.2f", super.name, super.price);
    }
    
}
