public class Master {
    private String name;
    
    public Master(String name) {
        this.name = name;
    }

    public void callPet(Pet pet){
       pet.voice(this);
       
    }

    @Override
    public String toString(){
        return String.format("Хозяина зовут: %s", name);
    }
}
