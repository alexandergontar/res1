import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import Services.*;

public class Main {

   /*  public static String[] readDataFromFile(String path) throws FileNotFoundException{
        File file =  new File(path);
        Scanner scanner = new Scanner(file);       
        String line = scanner.nextLine();
        String[] data = line.split(" ");
        scanner.close();        
        return data;
    }

    public static void displayArray(String[] array) {
        System.out.println(Arrays.toString(array));   
    }

    private static int[] parseFactors(String[] data) {
        String a = "a";
        String b = "b";
        int[] factors = new int[3];         
        for ( int i = 0; i < 6; i=i+2){
            if(data[i].equals(a)) {
                factors[0] = Integer.parseInt( data[i + 1]);
            }
            else if(data[i].equals(b)) {
                factors[1] = Integer.parseInt( data[i + 1]);
            }
            else {
                factors[2] = Integer.parseInt( data[i + 1]);
            }
        }
        return factors;
    }

    public static void printResultToScreen(int[] factors) {
        System.out.println(" a = "+factors[0]+ " b = " + factors[1] +" c = " +factors[2]);
        System.out.println(" a ** b + c = "+ ( Math.pow(factors[0], factors[1]) + factors[2])); 
    }

    private static void printResultToFile(int[] factors, String fileName ) throws IOException {
        FileWriter file = new FileWriter(fileName);
        double result = Math.pow(factors[0], factors[1]) + factors[2];
        file.write(" a ** b + c = "+ result);
        file.write("\n Where : {a , b, c} => {"+factors[0]+", "+factors[1]+", "+factors[2]+"}");
        file.write("\n The calculation result is : "+ result);
        file.close();
    }*/

    public static void main(String[] args) throws IOException{         
       /*  final  String INFILE = "notes.txt";
        final  String OUTFILE = "notes_new.txt";
        String[] data = readDataFromFile(INFILE);
        displayArray(data);
        int[] factors = parseFactors(data);
        printResultToScreen (factors);
        printResultToFile (factors, OUTFILE);*/
        
        // в одну строчку
        new BL(new UI(), new ReadWrite(), new Calcul()).run();
        /* 
        //или развернутая запись:
        IUI ui = new UI();
        IReadWrite rw = new ReadWrite();
        ICalcul calc = new Calcul();
        BL bl = new BL(ui, rw, calc);
        bl.run(); */
         
               
    }
}

