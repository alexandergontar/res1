
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class App {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        JSONObject obj = new JSONObject();
        obj.put("name", "alex");
        obj.put("birth-date", "02-11-1968");
        
        System.out.println(obj.get("name"));
    }
}
