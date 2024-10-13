
import java.util.Scanner;

/* Write a java program to swap two number without arithemetic operator  using XOR operator. */
/* ^ ---> xor operator */


public class Swaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("a = "+ a+"\nb = "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a+"\nb = "+b);



        
    }
    
}
