package trial;

import java.util.Scanner;

/**
 *
 * @author Daniel Nettey
 */

//This is a program designed to get and store the length of a string  
public class Trial {

    
    public static void main(String[] args) {
        //Asks user for input
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        
        //Gets and stores the length of the input given by the user
        int strLength = input.length();
        System.out.println(strLength);
        

    }
    
}
