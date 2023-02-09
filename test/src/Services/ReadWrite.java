package Services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite implements IReadWrite {

    public String[] readDataFromFile(String path) {
        File file = new File(path);
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] data = line.split(" ");
            scanner.close();
            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

    public void printResultToFile(int[] factors, double result, String fileName) throws IOException {
        FileWriter file = new FileWriter(fileName);
        //double result = Math.pow(factors[0], factors[1]) + factors[2];
        file.write(" a ** b + c = " + result);
        file.write("\n Where : {a , b, c} => {" + factors[0] + ", " + factors[1] + ", " + factors[2] + "}");
        file.write("\n The calculation result is : " + result);
        file.close();
    }

}
