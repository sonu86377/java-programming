// 2. Write a Java program to interchange values of two variable without using any third variable?


public class Swap {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("A= " + a + "\nB= " + b);
    }
    
}
