/* Write a java program to divide a number by 8 without using division operator .  */
/* >> ---> Right shift ( Divide)
 *  number/2 ==  n>>1
 *  number/4 ==  n>>2
 *  number/8 ==  n>>3
 *  number/16 == n>>4
 *  << ----> Multiplication
 * number*2 ==  n<<1
 *  number*4 ==  n<<2
 *  number*8 ==  n<<3
 *  number*16 == n<<4
 *  
 */

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println( "DIvide using divison operator : "+number +" / 8 ="+ number /8 );
        System.out.println( "DIvide using right Shift operator : "+number +" >> 8 ="+ (number>>3));

        System.out.println("****************************************************************************");
        System.out.println( "Mutiple using mutiply  operator : "+number +" * 8 ="+ (number*8) );
        System.out.println( "Multiply using left Shift operator : "+number +" << 8 ="+ (number<<3));




    }
    
}
