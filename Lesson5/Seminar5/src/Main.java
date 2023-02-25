import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
       
        System.out.println("============= Map ===================");
        Map<Integer, String> db = new HashMap<>();
       db.put(1, "one");
       db.put(2, "two");
       db.put(null, "!null");
       System.out.println(db);
       System.out.println(db.get(44));
       System.out.println(db.containsValue("two"));
       System.out.println(db.containsKey(3));
       System.out.println(db.values());
       System.out.println(db.keySet());
       

       for (Entry<Integer, String> item : db.entrySet()) {
        System.out.printf("[%d, %s] ",item.getKey(), item.getValue());
       }
       System.out.println("\n============= TreeMap ===================");
       TreeMap <Integer, String> tMap = new TreeMap<>();
       tMap.put(1, "one"); System.out.println(tMap);
       tMap.put(6, "six"); System.out.println(tMap);
       tMap.put(4, "four"); System.out.println(tMap);
       tMap.put(3, "three"); System.out.println(tMap);
       tMap.put(2, "two"); System.out.println(tMap);
       tMap.put(2, "two"); System.out.println(tMap.descendingKeySet());
       tMap.put(2, "two"); System.out.println(tMap.descendingMap());
       System.out.println("\n============= LinkedHashMap ===================");
       Map <Integer, String> linkmap = new LinkedHashMap <> ();
       linkmap.put(11, "one one");
       linkmap.put(2, "two");
       linkmap.put(1, "one");
       System.out.println(linkmap); 
       Map <Integer, String> map = new HashMap<>();
       map.put(11, "one one");
       map.put(2, "two");
       map.put(1, "one");
       System.out.println(map);

       System.out.println("\n============= HashMap Merge ===================");
        // create an HashMap
    HashMap<String, Integer> prices = new HashMap<>();

    // insert entries to the HashMap
    prices.put("Shoes", 200);
    prices.put("Bag", 300);
    prices.put("Pant", 150);
    System.out.println("HashMap: " + prices);

    int returnedValue = prices.merge("Shirt", 100, (oldValue, newValue) -> oldValue + newValue);
    System.out.println("Price of Shirt: " + returnedValue);

    // print updated HashMap
    System.out.println("Updated HashMap: " + prices);
     /*  Map <String, Integer> db = new HashMap<String, Integer>();
        db.put("str1", 1);
        db.put("str2", 2);
        db.put("str3", 4);
        db.put("str4", 8);
        db.put("str5", 16);
        db.put("str6", 32);

        db.forEach((k,v) -> System.out.printf("%s ", v));
        System.out.println("\n"+db);*/
         
        /*  System.out.println("========= Старшие биты =============");
        for (String item : db.keySet()) {
           db.compute(item, (k, v) -> Integer.toBinaryString(v).length());            
        }
        System.out.println(db);*/

       /*  System.out.println("========= Merge =============");
        Map <String, Integer> db2 = new HashMap<String, Integer>();
        db2.put("st1", 1);
        db2.put("str2", 2);
        db2.put("st3", 3);
        db2.put("str4", 4);
        db2.put("st5", 5);

        for (String item : db.keySet()) {
           db.merge(item, db2.getOrDefault(item, 0), (nV, tV) -> nV + tV); 
        }
        System.out.println(db);*/


    }
}
