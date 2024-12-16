import java.util.Scanner;
import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i * i <= n; i++) {
            while (t % i == 0) {
                arr.add(i);
                t /= i;
            }
        }
        if (t != 1) {
            arr.add(t);
        }
        System.out.println(arr);
        sc.close();
    }
}
