import java.util.*;

public class P231 {
    public static boolean isPrime(int n) {
        if(n == 0 || n == 1)
            return false;
        if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
            return n == 2 || n == 3 || n == 5 || n == 7;
        for(int i = 11; i * i <= n; i += 2) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        for(int i = 3; i <= n - 2; i += 2) {
            if(isPrime(i) && isPrime(i + 2)) {
                cnt++;
            }
        }
        System.out.println(cnt);
        for(int i = 3; i <= n - 2; i += 2) {
            if(isPrime(i) && isPrime(i + 2)) {
                System.out.println(2 + " " + i);
            }
        }
    }
}
