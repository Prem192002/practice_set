import java.util.Scanner;


public class conditions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age");
        int age = sc.nextInt();

        if(age<12){
            System.out.println("childhood");
        }else if(age>12 || age<18){
            System.out.println("teenage");
        }else{
            System.out.println("Adult");
        }


        
        
    }
    
}
