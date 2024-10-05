import java.util.Scanner;

public class CheckCapitalLetter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
         // Read a single character from the input
         char letter = sc.next().charAt(0);
        if(letter >='A' && letter <= 'Z'){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();  // It's a good practice to close the scanner
    }
 
}
