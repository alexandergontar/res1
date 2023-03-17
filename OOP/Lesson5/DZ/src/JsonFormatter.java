import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFormatter {
    @SuppressWarnings("unchecked")

    public void Write(Contacts contacts, String fileName) {
        JSONArray objList = new JSONArray();
        for (Contact contact : contacts) {
            JSONObject obj = new JSONObject();
            obj.put("name", contact.getName());
            obj.put("telNumber", contact.getTelNumber());
            objList.add(obj);
        }

        try (FileWriter file = new FileWriter(fileName)) {
            file.write(objList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }

    public void Read(Contacts contacts, String fileName){
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(fileName)) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray objList = (JSONArray) obj;
            // Iterate over task array
            objList.forEach(o -> parseUserObject((JSONObject) o, contacts));
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
     private void parseUserObject(JSONObject obj, Contacts contacts){
        Contact contact = new Contact(null, null);
        
        contact.name = (String) obj.get("name");
        //System.out.print(contact.name + ", ");  
        contact.telNumber = (String) obj.get("telNumber");
        //System.out.println(contact.telNumber);     
        contacts.add(contact);

     }   

}
