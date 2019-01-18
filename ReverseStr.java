package trial;

import java.util.Scanner;

/**
 *
 * @author Daniel Nettey
 */

//This is a program designed to reverse the individual words in a sentence 
public class ReverseStr {
    
    public static void main(String[] args) {
        //Asks user for input
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        //reverse the whole sentence
        String reverse = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reverse = reverse + input.charAt(i);
        }
        
        //Create a list of words of the sentence
        String[] arrOfStr = reverse.split(" ");
        
        //Generate the reversed words
        String as = "";
        for (int i = 0; i < arrOfStr.length; i++) {
            as = arrOfStr[i] + " " + as;            
        }
        System.out.println(as);

        

    }
    
}
