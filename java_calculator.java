import java.util.Scanner;

class java_calculator{

    public static void opr() {

       
        System.out.println("****Calculator****");
        System.out.println("Addition (+): 1");
        System.out.println("Subtraction (-): 2");
        System.out.println("Multiplication (*): 3");
        System.out.println("Division (/): 4");
        System.out.println("Stop: 5");
        System.out.println("Enter the operation number:");

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        opr();
        a = sc.nextInt();
        

        while (a != 5) {
            if (a == 1) {
                System.out.println("Enter the first number:");
                int num1 = sc.nextInt();

                System.out.println("Enter the second number:");
                int num2 = sc.nextInt();

                int res = num1 + num2;
                System.out.println("The result is: " + res);
            } else if(a == 2) {
                System.out.println("Enter the first number:");
                int num1 = sc.nextInt();

                System.out.println("Enter the second number:");
                int num2 = sc.nextInt();

                int res = num1 - num2;
                System.out.println("The result is: " + res);
                
            }else if(a == 3) {
                System.out.println("Enter the first number:");
                int num1 = sc.nextInt();

                System.out.println("Enter the second number:");
                int num2 = sc.nextInt();

                int res = num1 * num2;
                System.out.println("The result is: " + res);
                
            }
            else if(a == 4) {
                System.out.println("Enter the first number:");
                int num1 = sc.nextInt();

                System.out.println("Enter the second number:");
                int num2 = sc.nextInt();

                int res = num1 / num2;
                System.out.println("The result is: " + res);
                
            }else{
                System.out.println("inavlid operation");
            }   

            opr();
            a = sc.nextInt();
        }
    }
}
