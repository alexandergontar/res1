import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Date;

public class App {

    static String[] inputStringData() {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.print("Ведите Ваши данные: ");
        String input = scan.nextLine();
        if (input.trim().isEmpty()) { // если введна пустая строка или пробелы
            scan.close();
            throw new RuntimeException("Пустое сообщение!\nСообщение должно иметь содержание.");
        }
        String[] inputData = input.split(" ");
        scan.close();
        return inputData;
    }

    static void writeToTextFile(String[] data, String path) throws IOException {
        File file = new File(path);
        FileOutputStream stream = new FileOutputStream(file);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));

        for (int i = 0; i < data.length; i++) {
            writer.write(data[i]);
            writer.newLine();
        }

        writer.close();
    }

    static boolean validateJavaDate(String strDate) {
        /* Check if date is 'null' */
        if (strDate.trim().equals("")) {
            return true;
        }
        /* Date is not 'null' */
        else {
            /*
             * Set preferred date format,
             * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.
             */
            SimpleDateFormat sdfrmt = new SimpleDateFormat("MM-dd-yyyy");
            sdfrmt.setLenient(false);
            /*
             * Create Date object
             * parse the string into date
             */
            try {
                 sdfrmt.parse(strDate);
                System.out.println(strDate + " is valid date format");
            }
            /* Date format is invalid */
            catch (ParseException e) {
                System.out.println(strDate + " is Invalid Date format");
                return false;
            }
            /* Return true if date format is valid */
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        validateJavaDate("12/29/2016");
        validateJavaDate("12-29-2016");
        validateJavaDate("12,29,2016");
        String[] inputData = inputStringData();
        if (inputData.length != 4) {
            // throw new RuntimeException("Введенные данные не соответствуют формату.");
        }
        System.out.println(Arrays.toString(inputData));
        writeToTextFile(inputData, inputData[0] + inputData[1] + ".txt");

    }
}
