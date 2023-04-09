import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int sum = 0;
        for (int n=1;n<=num;n=n+1) {
            sum = sum+n;
            
        }
        
        System.out.println(sum);

    }
    
}
