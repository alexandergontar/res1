/* 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
*/

public class App {
   // @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
       
        TaskList<LowPriority> lowPriority = new TaskList<>("low priority list");      
        lowPriority.add(new LowPriority("2023-05-05", "Vasya Pupkin"));
        lowPriority.add(new LowPriority("2023-05-06", "Dima Ivanov"));
        lowPriority.add(new LowPriority("2023-05-07", "Petia Petrov"));
        JsonFormatter<LowPriority> jf = new JsonFormatter<>();
        jf.Write(lowPriority, "low_priority.json");
        jf.Read("low_priority.json", null);



    }
}
