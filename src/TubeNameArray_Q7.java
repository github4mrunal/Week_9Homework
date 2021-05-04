import java.util.ArrayList;

//7. Write a Java program to test an array list is empty or not.
// Define array list with underground tube names
public class TubeNameArray_Q7 {
    public static void main(String[] args) {
    ArrayList tube = new ArrayList();
    tube.add("Bakerloo");
    tube.add("Metropolitan");
    tube.add("Jubilee");
    tube.add("Northern");
    tube.add("Circle");
    tube.add("Hammersmith & City");
    tube.add("Central");
    tube.clear( );
        if(tube.isEmpty()){
            System.out.println("Its Empty");
        }else
            System.out.println("Not Empty");




    }
}