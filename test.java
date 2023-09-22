import java.util.*;
public class test {
    public static void main(String args[]){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int bace = obj1.nextInt();
        System.out.println("Enter the power number:");
        int pow = obj1.nextInt();

        int ans = 1;
        for(int i=0;i<pow;i=i+1){
            ans = ans*bace;
        }
        System.out.println(ans);
        
    
    }
    
}
