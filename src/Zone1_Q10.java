//10. Write the programme that tell you which line pass through particular stations.
//Just use Zone 1 stations name.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Zone1_Q10 {
    public static void main(String[] args) {
        String stations[][] = {{"Metropolitan", "Aldgate", "Liverpool St", "Moorgate", "Kings Cross", "Euston"},
                {"Northern Line", "Bank", "Moorgate", "Old Street", "Angel", "Kings Cross"},
                {"Victoria", "Kings Cross", "Euston", "Warren Street", "Oxford Circus", "Green Park"}};
        String lines = ""; //variable to list all the lines passing through the destination
        Scanner scan = new Scanner(System.in);
        System.out.println("Select the station from above to find out the line: Aldgate,Liverpool Street," +
                "Moorgate,Kings Cross,Euston,Bank,Old Street,Angel," +
                "Warren Street,Oxford Circus,Green Park");
        String destination = scan.nextLine(); //Variable to get destination station

        for (int i = 0; i < 3; i++) { //First look to move through each row
            for (int j = 0; j < 6; j++) { //Second loop to move through each columns (stations in a row)
                if (destination.equals(stations[i][j])) {//To check if a line passes through the destination station
                    if (!lines.isEmpty())
                        lines = lines + ", "; //Putting comma is the list is not empty to add next line
                    lines = lines + stations[i][0];
                }
            }
        }
        if (lines.isEmpty())
            System.out.println("The station is not on any lines");
        else
            System.out.println(lines + " tube lines pass through " + destination);
    }

}
















