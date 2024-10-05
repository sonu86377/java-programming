/* Write a condition to check whether the give Character is alphabet or not . */

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char letter = sc.next().charAt(0);
        if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' || letter >= 'z'))
        {
            System.out.println("It is alphabet");
        }
        else{
            System.out.println("Not a alphabet");
        }
    }
    
}
