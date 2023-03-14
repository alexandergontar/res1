import java.util.ArrayList;
import java.util.List;

public class TaskList<T extends TaskToDo> {
    List<T> taskList;

    private String name;

    public TaskList(String name) {
        this.taskList = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T task) {
        taskList.add(task);
    }
    

    public List<T> getList(){
        return taskList;
    }

    
}
