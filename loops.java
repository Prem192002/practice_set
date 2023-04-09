import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int n = 1;
        int sum = 0;
        
        while (n<=num) {
            sum = sum+n;
            
            n=n+1;
            
        }
        System.out.println(sum);

    }
    
}
