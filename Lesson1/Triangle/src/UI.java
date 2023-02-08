import java.util.Scanner;

public class UI implements IUI{
    private Scanner scan;
    public UI(){
        scan = new Scanner(System.in, "Cp866");
    }      
    public int readInteger(){    
        
        System.out.print("Ведите  число: ");
        String inputNumber = scan.nextLine();
        try{
             int n = Integer.parseInt(inputNumber);       
             return  n;       
        }
        catch(Exception ex){
            System.out.println(ex);
            return 0;
        }                
      } 
       @Override
      public void showMessage(String message){
          
        System.out.println(message);
      }

      public void clearScreen(){
        System.out.print("\033[H\033[2J");}
    
    public  void printArrayOfArrays(int [][] arrays)
    {
        for(int[] arr: arrays) {
            for(int n: arr) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

}
