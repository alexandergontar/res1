public class UrgentPriority extends TaskToDo{

    public UrgentPriority(String deadline, String fullName) {
        super(deadline, fullName);       
    }
    @Override
    public String getDescription(){
        return "urgent -"+description;
    }
    
}
