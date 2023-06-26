
import java.util.Scanner;
class loops_sum_first_n {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");

        int a = sc.nextInt();
        
        int sum = 1;

        for(int num = a; num>=1 ;num=num-1) {
            
            
            sum = sum+num;

           
        
        }

        System.out.println(sum);
        
    }

    
    
      
}
