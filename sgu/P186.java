import java.util.*;

public class P186 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] chains = new int[n];
        for(int i = 0; i < n; i++) 
            chains[i] = in.nextInt();
        Arrays.sort(chains);
        int cnt = 0;
        int linkSum = 0;
        for(int i = 0; i < n; i++) {
            linkSum += chains[i];
            if(linkSum > n - 1 - i) 
                break;
            cnt++;
        }
        System.out.println(n - 1 - cnt);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] chains = new int[n];
        for(int i = 0; i < n; i++) 
            chains[i] = in.nextInt();
        Arrays.sort(chains);
        int i = 0; 
        int j = n - 1;
        int time = 0;
        while(i < j) {
            chains[i]--;
            j--;
            time++;
            if(chains[i] == 0)
                i++;
        }
        System.out.println(time);
    }
}
