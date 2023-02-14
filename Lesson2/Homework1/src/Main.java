
public class Main { 

    static String RecInverseString(int n, String reversed, String input) {
        if (n == 0) { 
            reversed += input.charAt(n);
            return reversed;
        } 
        reversed += input.charAt(n);
        return RecInverseString(n - 1, reversed, input);
    }

    public static void main(String[] args) throws Exception {
        // Пункт 1
        System.out.println("\nПункт 1\nПроверка на вхождение одной строки в другую");
        String str1 = "Ключ от квартиры, где деньги лежат";
        String str2 = "деньги";
        System.out.println(str1.indexOf(str2) != -1);
        // Пункт 2
        System.out.println("\nПункт 2\nПроверка на обратное вхождение");
        str1 = "asdfg";
        str2 = "gfdsa";
        StringBuilder line1 = new StringBuilder(str1);
        StringBuilder line2 = new StringBuilder(str2);
        StringBuilder temp = line2.reverse();
        System.out.println(temp.toString().equals(line1.toString()));        
        //Пункт 3      
        System.out.println("\nПункт 3\nРекурсивный разворот");
        String reversed = "";
        String straight = "7 x 8 = 56";
        System.out.println(straight);
        reversed = RecInverseString(straight.length() - 1, reversed, straight);
        System.out.println(reversed);
        // Пункт 4
        System.out.println("\nПункт 4\nВывод 3-х строк.");
        int n1 = 3, n2 = 56;
        // 1 строка
        StringBuilder line = new StringBuilder();
        line.append(Integer.toString(n1));
        line.append("+");
        line.append(Integer.toString(n2));
        line.append("=");
        line.append(Integer.toString(n1 + n2));
        System.out.println(line);
        // 2 строка
        line = new StringBuilder();
        line.append(Integer.toString(n1));
        line.append("-");
        line.append(Integer.toString(n2));
        line.append("=");
        line.append(Integer.toString(n1 - n2));
        System.out.println(line);
        // 3 строка
        line = new StringBuilder();
        line.append(Integer.toString(n1));
        line.append("*");
        line.append(Integer.toString(n2));
        line.append("=");
        line.append(Integer.toString(n1 * n2));
        System.out.println(line);
        // Пункты 5 и 6
        System.out.println("\nПункты 5 и 6\nЗамена \"= на равно\"");        
        String input = "5 + 8 = 13";
        System.out.println(input);
        String ravno = "равно";
        int index = input.indexOf("=");
        // 1 способ
        StringBuilder sb = new StringBuilder(input);
        sb.deleteCharAt(index);
        sb.insert(index, ravno);
        System.out.println(sb.toString());
        // 2 способ
        sb = new StringBuilder(input);
        sb.replace(index, index + 1, ravno);
        System.out.println(sb.toString());   

        
        // Пункт 7
        System.out.println("\nПункт 7\nРабота с длинными строками");
        String veryLongString = "";
        long begin = System.currentTimeMillis();
        veryLongString += "5+8";      
        for (int i = 0; i < 1000; i++)
            veryLongString += "=";
        veryLongString += "13";
        
        for (int i = 0; i < 1000; i++)
            veryLongString = veryLongString.replace("=", ravno);
        
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения со строками: " + (end - begin) + " милисекунд.");

        StringBuilder veryLongBuilder = new StringBuilder();
        begin = System.currentTimeMillis();
        veryLongBuilder.append("5+8");
        for (int i = 0; i < 1000; i++)
            veryLongBuilder.append("=");
        veryLongBuilder.append("13");
        
        for (int i = 0; i < 1000; i++) {
            index = veryLongBuilder.indexOf("=");
            veryLongBuilder = veryLongBuilder.replace(index, index + 1, ravno);
        }

        end = System.currentTimeMillis();
        System.out.println("Время выполнения со стрингбилдером: " + (end - begin) + " милисекунд.");

    }
}
