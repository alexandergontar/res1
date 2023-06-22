public class App {
    
    static class Count{
        private int count; 
        
        public Count() {
        }
        public Count(int count) {
            this.count = count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public int getCount() {
            return count;
        }        
        public void increment(){
            this.count++;
        }
    }
    static void loop(int bound, Count count){
       for (int index = 0; index < bound; index++) {
          count.increment();
       }
    }
    static int displayCount(Count count){
        if (count == null) {
            throw new NullPointerException("Count is not initialized!");
        }
        if (count.getCount() == 0) {
           throw new RuntimeException("Zero loop!"); 
        }
        return count.getCount();
    }
    public static void main(String[] args) throws Exception {
        Count count = new Count();
        //count = new Count(10);
        loop(0, count);
        count = null;
        System.out.println(displayCount(count));
    }
}
