public class Parrot extends Pet implements ITalkingBird{

    public Parrot(String name, float price) {
        super(name, price);
        
    }

    @Override
    public void voice(Master m) {
        System.out.println("Hello, " + m.getName() +"!" );
    }

    public void fly(){
        System.out.println("Попугай " + super.name + " летит." );
      }
  
      public void sing(){
          System.out.println("Попугай " + super.name + " поет." ); 
      }

      public void talk(){
        System.out.println("Попугай " + super.name + " говорит \"Попка дурак!\" " ); 
    }
    @Override
    public String toString(){
        return String.format("Попугая зовут %s цена: %.2f", super.name, super.price);
    }
    
}
