import java.util.Scanner;
public class ThreeDigitNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if((1000>n)&&(n>99)){
            System.out.println("the given number is three digit number");

        }
        else{
           System.out.println("the given number is not three digit number"); 
        }
    }
}