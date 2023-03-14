
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
   static <T> T getElementFromUCollection(List<T> col, int index) {
      return col.get(index);
   }

   public static void main(String[] args) throws Exception {
       JSONObject obj = new JSONObject();
     /*  List<String> list = new ArrayList<>();
      for (int index = 0; index < 5; index++) {
         list.add(String.format("string:  %d", index));
      }
      System.out.println(list);

      String s = getElementFromUCollection(list, 3);
      System.out.println(s);

      List<Integer> data = new ArrayList<>(Arrays.asList(5, 17, 30));
      Integer k =  getElementFromUCollection(data, 0);
      System.out.println(k);
      ParameterizedWorker<Integer> worker = new ParameterizedWorker<Integer>(17, "Tobik", "Bobik", 40, 1000);
      System.out.println(worker.getId());
        */
      //===========================
        /*Box<Integer> b  = new Box<>();
        Integer [] arr = {1, 2, 3, 4};
        b.setArray(arr);
        Integer [] ar = b.getArray();
        b.dispArray(ar);*/

      //============================
      Repository<AudioContent> audioStorage = new Repository<>("audioStorage");
      audioStorage.add(new AudioContent("track_001.mp3"));
      audioStorage.add(new AudioContent("03 Дорожка 03.wma"));
      
      for (int index = 0; index < audioStorage.count(); index++) {
          System.out.println(audioStorage.get(index));
      }
      
      Repository<VideoContent> videoStorage = new Repository<>("videoStorage");
      videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
      videoStorage.add(new VideoContent("Новый фильм 5.3gp")); 

      for (int index = 0; index < videoStorage.count(); index++) {
          System.out.println(videoStorage.get(index));
      }

      //#region проблема
      audioStorage.add(new AudioContent("Дорожка 005.wav"));      
      videoStorage.add(new VideoContent("jfvjdhdf7768.mp4")); 
      //#endregion

   }
}
