//3. Write a Java program to reverse an array of integer values.

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray_Q3 {
    /*function reverses the elements of the array*/
    static void reverse(Integer myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }

    public static void main(String[] args)
    {
        Integer [] myArray = {11,13,15,17,19};
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray);
    }
}








