import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        
        int length = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int breadth = sc.nextInt();
        int area = length*breadth;
        int p = 2*(length + breadth);
        sc.close();
        System.out.println("Area : "+area);
        System.out.println("Perimeter : "+p);
        if(area > p){
            System.out.println("The area is greater than perimeter");
        }
        else{
            System.out.println("The perimeter  is greater than area");
        }
    }
}
