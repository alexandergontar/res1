public class MediumPriority extends TaskToDo{

    public MediumPriority(String deadline, String fullName) {
        super(deadline, fullName);        
    }
    @Override
    public String getDescription(){
        return "medium -"+description;
    }
    
}
