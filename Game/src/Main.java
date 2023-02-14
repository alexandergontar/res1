import Characters.*;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.SimpleFileVisitor;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws Exception {
        /*
         * Archer ar = new Archer();
         * ar.displaySpeed();
         * ar.greeting();
         * ar.personalGreeting();
         */

        /*logger.info("This is level info logging");

        logger.log(Level.WARNING, "This is level warning logging");

        logger.log(Level.SEVERE, "This is level severe logging");*/
        
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        //SimpleFormatter simpForm = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(simpForm);
       // ch.setFormatter(xml);
        fh.setFormatter(xml);
        logger.log(Level.INFO, "Test loggong");
        logger.info("Test Logging");


        //======================================
        String str = "";
        System.out.println("Start!");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200000; i++) {
            // str += "+";
            sb.append("+");
        }
        System.out.println("End!");

        try {
            String userDirPath = System.getProperty("user.dir");
            System.out.println(userDirPath);
            String filePath = userDirPath.concat("/src/data.txt");
            File f = new File(filePath);
            FileWriter fw = new FileWriter(f);
            fw.write("custom data");
            fw.close();
            long lastMod = f.lastModified();
            long size = f.length();
            System.out.println(f.getAbsolutePath());
            String str1 = String.format("%d  %d   ", lastMod, size);
            System.out.println(str1);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
