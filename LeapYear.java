// package Conditionals;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year : ");
    int n = sc.nextInt();
    
    sc.close();
    if(n%4==0){
        System.out.println("The year is leap year");

    }  
    else{
        System.out.println("the year is not a leap year");
    }
    }
}
