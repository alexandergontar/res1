import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("======== Set ========");
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(12);
        set.add(123);
        set.add(1234);
        set.add(1234);
        System.out.println(set.contains(12));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(12);
        for (Integer item : set) {
            System.out.printf("%d ",item);
        }
        set.clear();
        System.out.println(set);
        System.out.println("\nSet Operations");
        Set<Integer> a = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7 ));
        Set<Integer> b = new HashSet<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        Set<Integer> u = new HashSet<Integer>(a); u.addAll(b);
        Set<Integer> r = new HashSet<Integer>(a); r.retainAll(b);
        Set<Integer> s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(u);
        System.out.println(r);
        System.out.println(s);

    }
}
