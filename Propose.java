/* Ajay wants to propose to his girlfriend if he he is ging to propose after 15th of month . his love become successful otherwise its unsuccessful , if it is hir birthday it can be any date it can be successful 
 date -----> Integer
 birthday ------> Boolean
 */

import java.util.Scanner;

public class Propose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        int date = sc.nextInt();
        System.out.println("Enter the birthday in true/false");
        boolean birthday = sc.nextBoolean();
        if(date > 15 || birthday == true){
            System.out.println("Love is successful");
        }
        else{
            System.out.println("Love is unsuccessful");
        }
        sc.close();
    }  
}
