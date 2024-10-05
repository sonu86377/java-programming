// write a condition to check the number is divisible by both 3 and 7.
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num%3==0 && num%7==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();  // It's a good practice to close the scanner
    } 
}
