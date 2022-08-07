package _5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericMain {
    private static class MyClass {
        private int aField;

        public MyClass(int aField) {
            this.aField = aField;
        }
    }

    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();
        l1.add("1");
        l1.add("3");
        sort(l1);
        myAdd(l1, "4");

        List<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(3);
        sort(l2);

        doSomething("asdf", "fff");


        List<Integer> li1 = new ArrayList<>();
        List<Number> ln2 = new ArrayList<>();
        List<Object> lo3 = new ArrayList<>();

        addNumbers1to10(li1);
        addNumbers1to10(ln2);
        addNumbers1to10(lo3);

        System.out.println(li1);
        System.out.println(ln2);
        System.out.println(lo3);
    }

    public static void addNumbers1to10(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    private static <FOOBAR extends Comparable<FOOBAR>> void sort(List<FOOBAR> list) {
        FOOBAR e0 = list.get(0);
        FOOBAR e1 = list.get(1);
        int i = e0.compareTo(e1);
    }

    private static <FOOBAR> void myAdd(List<FOOBAR> list, FOOBAR s) {
        list.add(s);
    }

    private static <FOO, BAR> void doSomething(FOO f, BAR b) {
//        f.to
    }
}
