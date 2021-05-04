//Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterate_Array_Q5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();//Arraylist
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);



        Iterator itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next() + "");
    }
}




