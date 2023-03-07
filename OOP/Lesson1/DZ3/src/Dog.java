public class Dog extends Pet implements IPet{

    public Dog(String name, float price) {
        super(name, price);
        
    }

    @Override
    public void voice(Master m){
        if(masters.contains(m))
        System.out.println("Гав!");
        else System.out.println("Р-ррррр!");
        //System.out.println("Гав!");
    }

    @Override
    public String toString(){
        return String.format("Собаку зовут %s цена: %.2f", super.name, super.price);
    }
    
    
}
