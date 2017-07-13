/**
* The firstsubroutines program test the string entered by the user
* to determine whether it is a palindrome
*
* @author  Eugene Vereshchagin (g7skim)
* @email   jamuday@me.com
* @since   2017-07-13 
*/
package firstsubroutines;
//For the beginning I should import .Scanner utulity what I'll use in my program
import java.util.Scanner;

public class firstsubroutines {
    
    /*
    I use a for loop with .length and .charAt methods to reverse string from last
    to first characters
    */
    public static String reverser(String source){
        
        String reversed = "";
        for(int i = source.length() -1; i>=0; i--){
            reversed = reversed + source.charAt(i);
        }
        return reversed;
    }


    /*
    I use a .replaceAll method to strip all non alphabet symbols
    It just replaces each symbol what is not in the range a-z and A-Z to empty ("")
    */
    private static String stripper(String source){
       return source.replaceAll("[^a-zA-Z]","");
    }
    
    /*
    I use .equals to compare original stripped text with reversed
    If they are identical it means what we have the palindrom
    In other case it is not palindrom. I use simple if statement here
    */
    private static void Detector(String strip, String reverse){
        
        if(strip.equals(reverse)){
            System.out.println("This IS palindrome");
        }else{
            System.out.println("This IS NOT palindrome");
        }
    
    }
    /*
    It is the main routine. In the beginning I use Scanner utility to catch the
    User's input.
    */
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word or phrase to check it: ");
        
        //And I'll keep the user's input in "inputword"
        String inputword = in.nextLine();
        
        /*Then I use .toLowerCase() method to make
        all characters in "inputword" lowercase
        and keeps it to "lowerCasedInput"
        */
        String lowerCasedInput = inputword.toLowerCase();
        
        /*I send content of "lowerCasedInput" to "stripper" subroutine to strip
        all non alphabet character and then print the message to output with
        the stripped content what now is keeps in "strip"
        */ 
        String strip = stripper(lowerCasedInput);
        System.out.println("Stripped: "+strip);
        
        /*I send content of "strip" to "reverser" subroutine to reverse
        the stripped content and then print the message to output with
        the reversed content what now is keeps in "reverse"
        */ 
        String reverse = reverser(strip);
        System.out.println("Reversed: "+reverse);
        
        /*Finally I call the Detector to print output with the comparison results
        of test the string entered by the user to determine whether it is a palindrome
        */ 
        Detector(strip, reverse);
        
    }
        
}