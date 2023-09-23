import java.util.*;

public class test {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = obj.nextInt();
        int sum = 0;
        for(int i = 0; i<=num; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }

}
