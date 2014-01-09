import java.util.*;

public class P296 {
    public static int process(int n, int k) {
        String source = "" + n;
        char[] data = source.toCharArray();
        Arrays.sort(data);
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < source.length(); j++) {
                if(data[i] == source.charAt(j)) {
                    source = source.substring(0, j) + source.substring(j + 1, source.length());
                    break;
                }
            }
        }
        return Integer.parseInt(source);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int k = in.nextInt();
        char[] data = str.toCharArray();
        Arrays.sort(data);
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < str.length(); j++) {
                if(data[i] == str.charAt(j)) {
                    str = str.substring(0, j) + str.substring(j + 1, str.length());
                    break;
                }
            }
        }
        System.out.print(str);
    }
}
