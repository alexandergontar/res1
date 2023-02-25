import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws Exception {
        
        System.out.println("============= Map ===================");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("str1", "один");
        hashMap.put("str2", "два");
        hashMap.put("str3", "три");
        hashMap.put("str4", "четыре");
        hashMap.put("str5", "пять");
        hashMap.put("str6", "шесть");
        hashMap.forEach((k,v) -> System.out.printf("%s ", v));
        System.out.println("\n"+hashMap);

        System.out.println("============= Добавить !  ==================="); 
        for (String item : hashMap.keySet()) {
            hashMap.compute(item, (k, v) -> v+"!");
        }
        System.out.println(hashMap);

        System.out.println("============= Объединение по совпадению ключей  ===================");
        Map <String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("st1", " plus 1");
        hashMap2.put("str2", " plus 2");
        hashMap2.put("st3", " plus 3");
        hashMap2.put("str4", " plus 4");
        hashMap2.put("st5", " plus 5");
        hashMap2.put("str6", " plus 6");
        System.out.println(hashMap2);
        for (String item : hashMap.keySet()) {
            hashMap.merge(item, hashMap2.getOrDefault(item, ""), (nV, tV) -> nV + tV); 
         }
         System.out.println(hashMap);


       

       
    }    
}
 