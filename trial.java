class addition {

    public int addt(int a, int b){
        int sum = a+b;
        return sum;
    }
}


    public class trial{

    public static void main(String[] args) {
        

        addition obj1 = new addition();
        prep obj2 = new prep();
        int res = obj1.addt(5,10);
        int res2 = obj2.addb(7,5);
        System.out.println(res);
        System.out.println(res2);
        
    }
}
