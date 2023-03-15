
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
            // System.out.println(task.toString());
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
        T t;
        if (priority == 1)
            t = (T) (new LowPriority(null, null));
        else if (priority == 2)
            t = (T) (new MediumPriority(null, null));
        else
            t = (T) (new UrgentPriority(null, null));
        t.id = (long) obj.get("id");
        System.out.print(t.id + ", ");
        t.fullName = (String) obj.get("fullName");
        System.out.print(t.fullName + ", ");
        t.createDate = (String) obj.get("createDate");
        System.out.print(t.createDate + " ");
        t.createTime = (String) obj.get("createTime");
        System.out.print(t.createTime + ", ");
        t.deadline = (String) obj.get("deadline");
        System.out.print(t.deadline + ", ");
        t.description = (String) obj.get("description");
        System.out.println(t.description);
        taskList.add(t);

    }

}
