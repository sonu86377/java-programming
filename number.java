/*  Write a condition to check wheter the number is between 50 to 100 or 200 to 300 */

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if((num >= 50 && num <= 100) || (num >= 200 && num <= 300)){
            System.out.println("condition satisfied");
        }
        else{
            System.out.println("condion not satisfied");
        }
    }
}
