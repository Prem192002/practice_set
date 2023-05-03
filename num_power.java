import java.util.Scanner;
public class num_power { 

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base number");
        int num1 = sc.nextInt();

        System.out.println("enter the power number");
        int num2 = sc.nextInt();

        int pow = 1;

        while(num2>=1){
            pow = pow*num1;
            num2 = num2-1;
        }

        System.out.println(pow);
        
    }    
}
