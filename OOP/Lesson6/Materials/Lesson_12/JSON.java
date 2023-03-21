
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        JSONArray objList = new JSONArray();
        String name = "New name";
        List<String> numbers = new ArrayList<>();
        numbers.add("name1");
        numbers.add("name2");
        numbers.add("name3");
        obj.put("name", name);
        obj.put("numbers", numbers);
        objList.add(obj);
        System.out.println(obj);
        System.out.println(objList);
        
        name = "second name";
        List<String> numbers2 = new ArrayList<>();
        JSONObject obj2 = new JSONObject();
        numbers2.add("name11");
        numbers2.add("name22");
        numbers2.add("name33");
        obj2.put("name", name);
        obj2.put("numbers", numbers2);
        objList.add(obj2);
        System.out.println(obj);
        System.out.println(objList);
       
        try (FileWriter file = new FileWriter("data.json")) {
            file.write(objList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
