// 4. Write a program to input length and breadth of rectangle and calculate the area ( Input through command line argument)?

public class Rect_area {
    public static void main(String[] aa) {
        int length = Integer.parseInt(aa[0]);
        int breadth = Integer.parseInt(aa[1]);

        int area = length * breadth ;

        System.out.println("The area of Rectangle is "+ area);
    }
    
}
