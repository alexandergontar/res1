import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import javax.lang.model.element.VariableElement;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper;

public class Main {
    public static void main(String[] args) throws Exception {
        // Point 1
        System.out.println("Пункт 1\nЗадаем список: ");
        List<String> list = new ArrayList<>();

        list.add("red");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("orange");
        list.forEach(n -> System.out.println(n));
        // Point 2
        System.out.println("Пункт 2\nДобавляем \"!\": ");
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            temp += "!";
            list.set(i, temp);
        }
        list.forEach(n -> System.out.println(n));
        // Point 3
        System.out.println("Пункт 3\nВставить на 1-ю позицию: ");
        list.add(1, "pink");
        list.forEach(n -> System.out.println(n));
        // Point 4
        System.out.println("\nПункт 4\nИзвлечение по указанной позиции:");
        int pos = 4;
        System.out.printf("Позиция %d, элемент: %s", pos, list.get(pos));
        // list.remove(pos);

        // Point 5
        System.out.println("\nПункт 5\nОбновение элемента:");
        String temp = list.get(pos);
        temp += " обновленный";
        list.set(pos, temp);
        list.forEach(n -> System.out.println(n));

        // Point 6
        System.out.println("\nПункт 6\nУдаление 3-го элемента:");
        list.remove(3);
        list.forEach(n -> System.out.println(n));

        // Point 7
        System.out.println("\nПункт 7\nПоиск элемента по строке:");
        int index = 0;
        for (String str : list) {
            // System.out.println(str);
            if (str.contains("red!")) {
                System.out.printf("%s найден, index = %d", str, index);
                break;
            }
            index++;
        }
        // Point 8
        System.out.println("\nПункт 8\nНовый список с элементами старого:");
        List<String> list2 = new ArrayList<>();
        list2.add(list.get(0));
        list2.add(list.get(1));
        list2.add(list.get(2));
        list2.forEach(n -> System.out.println(n));
        // Point 9
        System.out.println("\nПункт 9\nУдаление из старого списка элементов, отсутствующих в новом:");
        list.retainAll(list2);
        list.forEach(n -> System.out.println(n));
        // Poin 10
        System.out.println("\nПункт 10\nСортировка списка");
        list.add("blue");
        list.add("green");
        list.add("violet");
        list.add("silver");

        System.out.println("Исходный список:");
        list.forEach(n -> System.out.println(n));

        System.out.println("Отсортированный по алфавиту:");
        list.sort(String.CASE_INSENSITIVE_ORDER);
        list.forEach(n -> System.out.println(n));
        // Point 11
        System.out.println("\nПункт 11\nТест производительности");
        list.clear();
        list.add("0");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("0");
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, "pink");
        }
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения ArrayList: " + (end - begin) + " мс.");

        begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, "pink");
        }
        end = System.currentTimeMillis();
        System.out.println("Время выполнения LinkedList: " + (end - begin) + " мс.");
        // Queue
        Queue<Integer> queu = new LinkedList<Integer>();
        begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            queu.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Время add выполнения Queue: " + (end - begin) + " мс.");
        begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            queu.remove();
        }
        end = System.currentTimeMillis();
        System.out.println("Время remove выполнения Queue: " + (end - begin) + " мс.");
        // Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(118);
        pq.add(1);
        pq.add(18);
        pq.add(8);
        pq.add(81);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        // Deque
        Deque<Integer> dequeue = new ArrayDeque<Integer>();
        dequeue.addFirst(1);
        dequeue.addLast(2);
        // Stack
        // System.out.println(isDigit("12"));
        // System.out.println(isDigit("a"));
        String[] exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(exp);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;

                        case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;

                        case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;

                        case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;                    

                    default:
                        break;
                }
            }
            
        }

        System.out.printf("%d\n", st.pop());

    }

    private static boolean isDigit(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
