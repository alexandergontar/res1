import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Milk("молоко"));
        latte.addComponent(new Beans("бобы"));
       
        for (Ingredient ingredient : latte) {
            System.out.println(ingredient);
        }
        
        Iterator<Ingredient> it = latte.iterator();
        while(it.hasNext()){
            Ingredient ing = it.next();
            System.out.println(ing);
        }
    }
}
