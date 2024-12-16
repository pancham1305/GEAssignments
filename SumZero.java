import java.util.*;

public class SumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        sc.close();
        Set<String> arr = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = v[i] + v[j] + v[k];
                    if (sum == 0) {
                        arr.add(String.valueOf((i + 1) * 100 + (j + 1) * 10 + (k + 1)));
                    }
                }
            }
        }
        System.out.println("Size: " + arr.size());
        for (String s : arr) {
            for (int i = 0; i < s.length(); i++) {
                char a = s.charAt(i);
                System.out.print(a + ((i == s.length() - 1) ? "" : " "));
            }
            System.out.println();
        }
        return;
    }
}
