public class trial {

    public static int phi(int n) {
        int result = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                result -= result / i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(phi(6)); // 2
        System.out.println(phi(10)); // 4
        System.out.println(phi(15)); // 8
    }
}
