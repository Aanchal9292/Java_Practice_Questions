import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int p = 1,temp;
        while(n!=0){
            temp = n%10;
            p = temp * p;
            n = n%10;
        }
        System.out.println("Product is : "+p);
    }
}
