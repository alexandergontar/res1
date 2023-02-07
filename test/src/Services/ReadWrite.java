package Services;
import java.io.File;
import java.io.FileNotFoundException;



import java.util.Scanner;
public class ReadWrite implements IReadWrite {

    public  String[] readDataFromFile(String path)  {
        File file =  new File(path);
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] data = line.split(" ");
            scanner.close();        
            return data;
        } catch (FileNotFoundException e) {            
            e.printStackTrace();
        }
        return null;
    }
    
}
