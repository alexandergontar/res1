package Services;

public class Calcul implements ICalcul {
   public int MultiplyBy5(int inputNumber) {
      return inputNumber * 5;
   }

   public double polynomeResult(int[] factors) {
      double result = Math.pow(factors[0], factors[1]) + factors[2];
      return result;
   }

   public int[] parseFactors(String[] data) {
      String a = "a";
      String b = "b";
      int[] factors = new int[3];
      for (int i = 0; i < 6; i = i + 2) {
         if (data[i].equals(a)) {
            factors[0] = Integer.parseInt(data[i + 1]);
         } else if (data[i].equals(b)) {
            factors[1] = Integer.parseInt(data[i + 1]);
         } else {
            factors[2] = Integer.parseInt(data[i + 1]);
         }
      }
      return factors;
   }

}
