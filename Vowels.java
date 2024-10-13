/* Write a program to count Vowels in given name. */



import java.util.Scanner;

public class Vowels{
    public static void main(String[] args) {
      //  Scanner sc;  // reference variable;
      //  sc= new Scanner(System.in);  // Object
        Scanner sc = new Scanner(System.in);
        String name;
        int i;
        int count = 0;
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Hello " + name);

        for(i=0;i<name.length();i++){
            char c = name.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println("no. of vowels in "+name + " is "+count);
        sc.close();
    }  
}