import java.util.ArrayList;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lim = 1;
        while (n != 0) {
            arr.add(lim);
            lim *= 2;
            n -= 1;
        }
        sc.close();
        System.out.println(arr);
    }
}