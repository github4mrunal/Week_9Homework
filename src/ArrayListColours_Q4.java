import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//4. Write a Java program to create a new array list, add some colours (string) and
// printout the collection using for each loop.
public class ArrayListColours_Q4 {
    public static void main(String[] args) {


    //How to add value into the list
    List<String> list = new ArrayList<String>();
        list.add("Red");//autoboxing ---wrapping
        list.add("Yellow");
        list.add("Green");
        list.add("Purple");
        list.add("Blue");
        list.add("Black");

    //How to fetch the values from the list
      //  System.out.println(list.get(4));

        //System.out.println(list);

    // Print the size of list
        System.out.println(list.size());


           // Iterating the list using for each loop
        for (String value:list) {

            System.out.println(value);
        }

    //for each loop (most used loop)

    }











}
