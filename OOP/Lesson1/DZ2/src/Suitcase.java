public class Suitcase {
    private int id;
    private boolean openClose = false;

    public Suitcase(int id) {
        this.id = id;
    }

    public void setOpenClose(boolean openClose, User user){
       
        if (user.getKeys().contains(id)) {
        this.openClose = openClose;
        System.out.println("Пользователь "+user.toString()+" открыл шкаф "+id+".");
       } else {
        System.out.println("Ключи пользователя "+user.toString()+" не подходят!");
       }
    }

    @Override
    public String toString(){
        if(openClose)
        return String.format("Шкаф %d открыт", id);
        else return String.format("Шкаф %d закрыт", id);
    }


}
