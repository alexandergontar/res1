import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
//import java.util.Objects;
import java.util.Scanner;

public class Main {
    //  перестановка значений индексов в порядке возрастания age
    public static void bubleSortAge(ArrayList<Integer> age, LinkedList<Integer> index) {
        ArrayList<Integer> ageTmp = new ArrayList<>(age);

        boolean sort = true;
        int k = ageTmp.size();
        while (sort) {
            sort = false;
            for (int i = 0; i < k - 1; i++) {
                if (ageTmp.get(i) > ageTmp.get(i + 1)) {
                    int temp = ageTmp.get(i);
                    ageTmp.set(i, ageTmp.get(i + 1));
                    ageTmp.set(i + 1, temp);
                     // расстановка индексов в том же порядке, что age
                    int temp2 = index.get(i);
                    index.set(i, index.get(i + 1));
                    index.set(i + 1, temp2);
                    sort = true;
                }
            }
            k--;
        }
    }

    public static void sortGender(ArrayList<Boolean> gender, LinkedList<Integer> index) {
        // добавляем сортировку по gender
        LinkedList<Integer> indexTemp = new LinkedList<>();      
        
        for (int i = 0; i < index.size(); i++) {
          if (!gender.get(index.get(i))) {
            indexTemp.add(index.get(i));
            index.remove(i); 
          }  
        }
        for (int i = 0; i < indexTemp.size(); i++){
            index.addLast(indexTemp.get(i));
        }
        
    }

    public static void main(String[] args) throws Exception {        
        LinkedList<Integer> index = new LinkedList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in, "Cp866")) {
            System.out.println("Ф.И.О Возраст и пол - вводить все через пробел. Выход х");

            boolean run = true;
            while (run) {
                String in = scanner.nextLine();
                if (in.equals("x")) {
                    run = false;
                } else {
                    String[] data = in.split(" ");
                    index.add(lastName.size()); // изначальная индексация
                    lastName.add(data[0]);
                    firstName.add(data[1]);
                    patronymic.add(data[2]);
                    age.add(Integer.parseInt(data[3]));
                    gender.add(data[4].contains("м"));
                }
            }
        }
        for (int i = 0; i < lastName.size(); i++) {
            StringBuilder str = new StringBuilder();
            str.append(lastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ")
                    .append(patronymic.get(i).charAt(0)).append(". ").append("---").append(index.get(i));
            System.out.println(str);
        }
        System.out.println("************");
       // пересатновка индексов в порядке age
        bubleSortAge(age, index);
       // вывод по индексам
        for (int i : index) {
            StringBuilder str = new StringBuilder();
            str.append(lastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ")
                    .append(patronymic.get(i).charAt(0)).append(". ").append(age.get(i)).append(". ")
                    .append(gender.get(i));
            System.out.println(str);
        }
        System.out.println("*************");
       
        // перестановка индексов по gender
        sortGender(gender, index);
        // вывод по индексам
        for (int i : index) {
            StringBuilder str = new StringBuilder();
            str.append(lastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ")
                    .append(patronymic.get(i).charAt(0)).append(". ").append(age.get(i)).append(". ")
                    .append(gender.get(i));
            System.out.println(str);
        }

    }
}
