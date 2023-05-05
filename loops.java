import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        
        for (int n=1;n<=num;n=n+2) {
            System.out.println(n);
            
        }
        
        

    }
    
}
