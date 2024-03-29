import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public abstract class TaskToDo {
    
    protected long id;
    protected String createDate;
    protected String createTime;
    protected String deadline;
    protected String fullName;
    protected String description;

    public TaskToDo(String deadline, String fullName){
        this.description = UUID.randomUUID().toString();
        this.id = this.hashCode();
        createDate = LocalDate.now().toString();
        createTime = LocalTime.now().toString();
        this.deadline = deadline;
        this.fullName = fullName;
    }
   // public TaskToDo(){}

    public String getCreateDate(){
        return createDate;
    }
    public String getCreateTime(){
        return createTime;
    }
 
    public String getDeadline(){
        return deadline;
    }
    public String getFullname(){
        return fullName;
    }
    public long getID(){
        return id;
    }
    public String getDescription(){
        return description;
    }


    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s", id, createDate, createTime, deadline, fullName, description);
    }

    
    



}
