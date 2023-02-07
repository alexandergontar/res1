import java.util.Scanner;
public class UI implements IUI{
    private Scanner scan;
    public UI(){
        scan = new Scanner(System.in, "Cp866");
    }      
    public String readInput(){
        
        System.out.print("Ведите слово: ");         
        try{
        String msg = scan.nextLine();                
         return msg;
        } catch(Exception ex){
          return ex.toString();
        }     
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
  
      public void showMessage(String message){
          
        System.out.println(message);
      }

      public void clearScreen(){
        System.out.print("\033[H\033[2J");//Очистка экрана
      }
         
}
