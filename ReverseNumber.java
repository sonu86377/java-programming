/* Write a program to reverse a given number? */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int reversenum=0;
        System.out.println("Enter the number ");
         num = sc.nextInt();
        System.out.println("The number is : "+num);
        while(num != 0){
            reversenum = reversenum *10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
        System.out.println("The reverse number is : "+reversenum);
        sc.close();
    }
    
}
