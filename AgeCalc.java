public class AgeCalc {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram : ");
        a = sc.nextInt();
        System.out.print("Enter the age of Shyam : ");
        b = sc.nextInt();
        System.out.print("Enter the age of Ajay : ");
        c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("Ram is oldest");
            }
            else{
                System.out.println("Ajay is oldest");
            }
        }
        else if(b>a){
            
        }
        
    }
}
