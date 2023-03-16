import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskList<T extends TaskToDo> implements Iterable<T>{
    List<T> taskList;

    private String name;

    public TaskList(String name) {
        this.taskList = new ArrayList<>();
        this.name = name;
       // System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T task) {
        taskList.add(task);
    }
    

    public List<T> getList(){
        return taskList;
    }
    public String getName(){
        return name;
    }

    @Override
    public Iterator<T> iterator() {        
        return taskList.iterator();       
    }

    
}
