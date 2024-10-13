/* write a java program to check the given number is even or odd without  arithemetic operator .(using Bitwise and operator) */
/* number & 1 == 0-----> Even
 * number & 1 == 1 -----> Odd
 */
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int  a = sc.nextInt();
        if((a & 1) == 0){
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd number");
        }
        sc.close();
    }
    
}
