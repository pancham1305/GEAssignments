import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double ans = 0.0;
        while (n != 0) {
            ans += 1 / n;
            n--;
        }
        System.out.println(ans);
        sc.close();
        return;
    }
}