
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

    public void Write(TaskList<T> priority, String fileName) {
        
        List<T> priorityList = (List<T>) priority.getList();
        JSONArray taskList = new JSONArray();
        for (T task : priorityList) {
            JSONObject taskDetails = new JSONObject();
            taskDetails.put("id", task.id);
            taskDetails.put("createDate", task.getCreateDate());
            taskDetails.put("createTime", task.getCreateTime());
            taskDetails.put("deadline", task.getDeadline());
            taskDetails.put("fullName", task.getFullname());
            taskDetails.put("description", task.getDescription());
            taskList.add(taskDetails);
            System.out.println(task.toString());
        }
        System.out.println(taskList);
        try (FileWriter file = new FileWriter(fileName)) {

            file.write(taskList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> Read(String fileName, TaskList<T> priority) {
        // JSON parser object to parse read file
        List<T> priorityList = (List<T>) priority.getList();
        
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(fileName)) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray taskList = (JSONArray) obj;

            // Iterate over task array
            
            taskList.forEach(task -> parseUserObject((JSONObject) task, priorityList));
           return priorityList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return priorityList;
    }

    private void parseUserObject(JSONObject task, List<T> priorityList) {
      // System.out.println(priorityList.get(0).getClass().getName());
       
        
        long id = (long) task.get("id");
       // t.id = id;
        System.out.print(id + ", ");
        String fullName = (String) task.get("fullName");
        System.out.print(fullName +", ");
        String createDate = (String) task.get("createDate");
        System.out.print(createDate+ " ");
        String createTime = (String) task.get("createTime");
        System.out.print(createTime+ ", ");
        String deadline = (String) task.get("deadline");
        System.out.print(deadline+ ", ");       
        String description = (String) task.get("description");
        System.out.println(description);
       // priorityList.add(t);

    }

}
