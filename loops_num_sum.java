import java.util.Scanner;
class loop_num_sum {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        
        int count =0;
        int sum = 0;
        while( num>0){

            int digit=num%10;
            num =  num/10;
            count = count+1;
            sum = sum+digit;

        }

        System.out.println(sum);



    }
}
