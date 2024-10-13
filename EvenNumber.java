/* Write a java program to check the give number is even or odd without using modulus and bitwise and operator */

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int  n= sc.nextInt();
        if((n/2)*2==n){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
        sc.close();
    }
    
}
