import java.util.*;

public class P404 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String res = null;
        for(int i = 0; i < m; i++) {
            String s = in.next();
            if(i == (n - 1) % m)
                res = s;
        }
        System.out.println(res);
    }
}
