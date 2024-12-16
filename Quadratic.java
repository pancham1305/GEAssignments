import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println(-1);
            System.exit(0);
        }
        double sqroot = Math.sqrt(delta);
        double x1 = (-b + sqroot) / (2 * a);
        double x2 = (-b - sqroot) / (2 * a);
        System.out.println(x1 + " " + x2);
    }
}
