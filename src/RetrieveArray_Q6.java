import java.util.ArrayList;

//6. Write a Java program to retrieve an element (at a specified index) from a given array list
public class RetrieveArray_Q6 {

    public static void main(String[] args) {
        ArrayList retrieve = new ArrayList();
        retrieve.add ("I");
        retrieve.add("AM");
        retrieve.add("AUTOMATION");
        retrieve.add("TESTER");

        System.out.println(retrieve.get(2));
    }

}
