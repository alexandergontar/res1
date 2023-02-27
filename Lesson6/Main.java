package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(4);
        mySet.add(0);
        mySet.add(7);
        mySet.add(5);
        mySet.add(9);
        mySet.add(4);
        System.out.println(mySet.toString());
        System.out.println(mySet.size());
        System.out.println(mySet.get(mySet.size()-1));
        ArrayList<Integer> list = mySet.toArrayList();
        System.out.println(list);
        System.out.println(mySet.contain(3));
        System.out.println(mySet.contain(4));
        System.out.println(mySet.headSet(7));
        System.out.println(mySet.tailSet(7));
        System.out.println(mySet.subSet(4,7));
    }
}
class MySet{
    private Map<Integer,Object> map = new HashMap<>();
    private static final Object OBJECT = new Object();

    public void add(int key){
        map.put(key,OBJECT);
    }
    public Integer size(){
        return map.size();
    }
    public int get(int key){
        return (int)map.keySet().toArray()[key];
    }
    public MySet headSet(int key){
        MySet set = new MySet();
        for(int i=0; i<map.size();i++) {
            if((int)map.keySet().toArray()[i]==key){
                set.add((int)map.keySet().toArray()[i]);
                break;
            }
            else set.add((int)map.keySet().toArray()[i]);
        }
        return set;
    }
    public MySet tailSet(int key){
        MySet set = new MySet();
        for(int i=map.size()-1; i>=0;i--) {
            if((int)map.keySet().toArray()[i]==key){
                set.add((int)map.keySet().toArray()[i]);
                break;
            }
            else set.add((int)map.keySet().toArray()[i]);
        }
        return set;
    }
    public MySet subSet(int key1, int key2){
        MySet set = new MySet();
        boolean flag = false;
        for(int i=0; i<map.size();i++) {
            if((int)map.keySet().toArray()[i]==key1) flag = true;
            if(flag) set.add((int)map.keySet().toArray()[i]);
            if((int)map.keySet().toArray()[i]==key2) break;
        }
        return set;
    }
    public ArrayList toArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<map.size();i++)
            list.add((int)map.keySet().toArray()[i]);
        return list;
    }
    public boolean contain(int key){
        return map.containsKey(key);
    }
    @Override
    public String toString() {
        return map.keySet().toString();
    }
}