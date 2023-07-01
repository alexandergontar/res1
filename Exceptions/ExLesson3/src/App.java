import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    static String[] inputStringData() throws InputFormatException {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.println("Ведите Ваши данные через пробел. ");
        System.out.println("Формат: Фамилия Имя Отчество №телефона дата_рождения(дд-мм-гггг) пол(f/m)  ");
        String input = scan.nextLine();
        if (input.trim().isEmpty()) { // если введна пустая строка или пробелы
            scan.close();
            throw new InputFormatException("Пустое сообщение!\nСообщение должно иметь содержание.");
        }
        String[] inputData = input.split(" ");
        scan.close();
        return inputData;
    }

    static void writeToTextFile(String[] data, String path) throws IOException {
        File file = new File(path);
        boolean fileExists = false;
        if (file.exists()) {
            fileExists = true;
            System.out.println("Exists!!!");
        }
        try (FileOutputStream stream = new FileOutputStream(file, fileExists);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));) {
            if (fileExists) {
                writer.write("\n");
            }
            for (int i = 0; i < data.length; i++) {
                writer.write(data[i] + " ");

            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    static boolean validateJavaDate(String stringDate) {

        if (stringDate.trim().equals("")) {
            return false;
        } else {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            format.setLenient(false);
            try {
                format.parse(stringDate);
                System.out.println(stringDate + " is valid date format");
            }            
            catch (ParseException e) {
                System.out.println(stringDate + " is Invalid Date format");
                return false;
            }            
            return true;
        }
    }

    static boolean validateTelNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    static void checkInputFormat(String[] data) throws InputFormatException {
        if (data.length != 6) {
            throw new InputFormatException("Количество данных не соответствуют формату.");
        }
        if (!validateTelNumber(data[3])) {
            throw new InputFormatException("Негодный тел. номер!");
        }
        if (!validateJavaDate(data[4])) {
            throw new InputFormatException("Неверная дата рождения!");
        }
        if (!data[5].equals("m")) {
            if (!data[5].equals("f")) {
                throw new InputFormatException("Неправильный указатель пола ");
            }
        }

    }

    public static void main(String[] args) throws Exception {

        try {
            String[] inputData = inputStringData();
            System.out.println(Arrays.toString(inputData));
            checkInputFormat(inputData);
            writeToTextFile(inputData, inputData[0] + ".txt");

        } catch (InputFormatException | IOException e) {
            System.out.println(e.toString());
        }

    }
}
