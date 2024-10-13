
/* Write a program to validate an email id: it should contain one @ and at least one "." ?  */

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String email;
        int i ;
        int count = 0;
        int count1 =0;
        System.out.println("Enter email id");
        email = sc.next();
        System.out.println("Your email id is : "+email);
        for(i=0;i<email.length();i++){
            char c = email.charAt(i);
            if(c=='@'){
                count++;
            }
            if(c=='.'){
                count1++;
            }
        }
        if(count==1 && count1>0){
            System.out.println("the give email id is valid");
        }
        sc.close();
    }
    
}
