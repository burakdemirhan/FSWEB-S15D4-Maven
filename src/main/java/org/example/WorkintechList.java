package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WorkintechList<T extends Comparable<T>>extends ArrayList<T> {
    @Override
    public boolean add(T element) {
        if(!this.contains(element)){
            return super.add(element);
        }
      return false;
    }

    @Override
    public void add(int index, T element) {
        if (!this.contains(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean addAll(java.util.Collection<? extends T> c) {
      boolean isModified = false;
      for (T element :  c){
          if(!this.contains(element)){
              super.add(element);
             isModified = true;
          }
      }
      return isModified;
    }

    @Override
    public boolean addAll(int index, java.util.Collection<? extends T> c) {
        boolean isModified = false;
        for(T element : c){
          if(!this.contains(element)){
              super.add(index++, element);
              isModified = true;
          }

        }
        return isModified;
    }
    public void sort() {
        // WorkintechList içindeki elemanları sıralar
        Collections.sort(this);
    }

    public static void main(String[] args) {
        WorkintechList<String> stringList = new WorkintechList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Banana"); // Eklenmez, çünkü tekrar ediyor
        stringList.add("Cherry");

        System.out.println("Before sort: " + stringList);
        stringList.sort();
        System.out.println("After sort: " + stringList);

        WorkintechList<Integer> intList = new WorkintechList<>();
        intList.add(5);
        intList.add(3);
        intList.add(5); // Eklenmez, çünkü tekrar ediyor
        intList.add(10);

        System.out.println("Before sort: " + intList);
        intList.sort();
        System.out.println("After sort: " + intList);
    }
}


