package Services;

import java.io.IOException;

public interface IReadWrite {

    String[] readDataFromFile(String path);
    void printResultToFile(int[] factors, double result, String fileName) throws IOException;
    
}
