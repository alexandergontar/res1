public class LowPriority extends TaskToDo{

    public LowPriority(String deadline, String fullName) {
        super(deadline, fullName);
               
    }
    @Override
    public String getDescription(){
        return "low -"+description;
    }
    
}
