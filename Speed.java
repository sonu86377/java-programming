/* Ajay is riding the bike for the first time . If he goes above 60km/h without wearing  the helmate , he will be fined by police or if he goes above 100 km per hour with helmate also he will be fined by police apeed as int, helmate as boolean. */

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed : ");
        int speed = sc.nextInt();
        System.out.println("Enter helmate weared or not : true/false");
        boolean helmate = sc.nextBoolean();
        if((helmate == false && speed > 60) || (helmate == true && speed>100)){
            System.out.println("Fined by police");
        }
        else{
            System.out.println("Not fined by police");
        }
        sc.close();

    }
    
}
