
import java.util.Scanner;
class trial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if (num>=1){

            int count = 0;
            for(int i=1;i<=num;i=i+1){
                if(num%i==0){
                    count=count+1;
                }
                
            }
            if(count==2){

                System.out.println("Number is a prime number");
            
            }else{
                System.out.println("Not a prime number");
            }

        }else{
            System.out.println("Not a prime number");
        }
    } 
    
}
