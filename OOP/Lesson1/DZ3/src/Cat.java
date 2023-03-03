public class Cat extends Pet{

    public Cat(String name, float price) {
        super(name, price);
        
    }

    @Override
    public void voice(Master m){
        if(masters.contains(m))
         System.out.println("Мяу!");
         else System.out.println("Ф-ррррр!");
    }

    @Override
    public String toString(){
        return String.format("Кота зовут %s цена: %.2f", super.name, super.price);
    }

    
}
