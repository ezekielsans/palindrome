
import javax.swing.*;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Stream<String> palindrome = Stream.of("radar", "level", "kayak", "reviver", "madam");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String word = scan.nextLine();
        boolean match = palindrome.anyMatch(p -> p.contains(word));
        if (word.length() < 3) {
            System.out.println("Please input atleast 3 characters");
            //done
        }
        else if (word.length() % 3 == 0) {
            System.out.println("Character Count is not an Odd number"); //done
        } else if (word.length() % 3 == 1) {
            System.out.println("Character Count is not a palindrome"); //done
        } else if (match == true) {

            System.out.println(word.charAt(0) + " " + word.charAt(0) + " " + word.charAt(0));
            System.out.println(" " + word.charAt(1) + word.charAt(1) + word.charAt(1) + " ");
            System.out.println(" " + " " + word.charAt(2) + " " + " ");
            System.out.println(" " + word.charAt(3) + word.charAt(3) + word.charAt(3) + " ");
            System.out.println(word.charAt(4) + " " + word.charAt(4) + " " + word.charAt(4));

        }
    }
}






