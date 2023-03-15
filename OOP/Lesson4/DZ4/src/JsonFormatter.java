
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFormatter<T extends TaskToDo> {
    @SuppressWarnings("unchecked")

    public void Write(TaskList<T> tasks, String fileName) {
        
        List<T> taskList = (List<T>) tasks.getList();
        JSONArray objList = new JSONArray();
        for (T task : taskList) {
            JSONObject obj = new JSONObject();
            obj.put("id", task.id);
            obj.put("createDate", task.getCreateDate());
            obj.put("createTime", task.getCreateTime());
            obj.put("deadline", task.getDeadline());
            obj.put("fullName", task.getFullname());
            obj.put("description", task.getDescription());
            objList.add(obj);
            //System.out.println(task.toString());
        }
       // System.out.println(objList);
        try (FileWriter file = new FileWriter(fileName)) {

            file.write(objList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> Read(String fileName, TaskList<T> tasks, int priority) {        
        List<T> taskList = (List<T>) tasks.getList();

        // JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(fileName)) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray objList = (JSONArray) obj;
            // Iterate over task array            
            objList.forEach(o -> parseUserObject((JSONObject) o, taskList, priority));
           return taskList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return taskList;
    }

    private void parseUserObject(JSONObject obj, List<T> taskList, int priority) {
       //System.out.println(priorityList.get(0).getClass().getName());
       T t;
         t = (T)(new LowPriority(null, null));
        long id = (long) obj.get("id");
        t.id = id;
        System.out.print(id + ", ");
        String fullName = (String) obj.get("fullName");
        t.fullName = fullName;
        System.out.print(fullName +", ");
        String createDate = (String) obj.get("createDate");
        t.createDate = createDate;
        System.out.print(createDate+ " ");
        String createTime = (String) obj.get("createTime");
        t.createTime = createTime;
        System.out.print(createTime+ ", ");
        String deadline = (String) obj.get("deadline");
        t.deadline = deadline;
        System.out.print(deadline+ ", ");       
        String description = (String) obj.get("description");
        t.description = description;
        System.out.println(description);
        taskList.add(t);

    }

}
