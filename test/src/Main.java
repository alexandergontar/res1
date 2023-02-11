//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.Random;

import Services.*;
import Model.*;

public class Main {    

    public static void main(String[] args) throws IOException {        
         new BL( new UI(), new ReadWrite(), new Calcul(), new DataModel()).run(); 
    }
}

