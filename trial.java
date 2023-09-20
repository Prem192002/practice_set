class addition {

    public int addt(int a, int b){
        int sum = a+b;
        return sum;
    }
}

    public class trial{

    public static void main(String[] args) {
        

        addition obj1 = new addition();
        int res = obj1.addt(5,10);
        System.out.println(res);
        
    }
}
