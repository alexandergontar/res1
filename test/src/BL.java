public class BL {
    IUI ui;

    public BL(IUI ui){
      this.ui = ui;
    }

    private void testIO(){        
        ui.clearScreen();
        ui.showMessage("Добрый день");
        int num = ui.readInteger();
        System.out.println(num * 5);
        String msg = ui.readInput();
        System.out.println(msg);
    }

    public void run(){
        testIO(); 
    }
    
}
