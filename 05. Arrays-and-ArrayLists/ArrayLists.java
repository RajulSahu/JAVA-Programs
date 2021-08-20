package com.rajul;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(34);
        list.add(435);
        list.add(132);
        list.add(654);
        list.add(76);
        list.add(88);
        list.add(97);
        list.add(987);
        list.add(78);
        list.add(56);

        System.out.println(list);

        System.out.println(list.contains(97));

        list.set(0, 99);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        System.out.println(list.get(0));


    }
}
