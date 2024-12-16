import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Remainder = a % b;
        int Quotient = a / b;
        System.out.println("Remainder: " + Remainder);
        System.out.println("Quotient: " + Quotient);
        sc.close();
    }
}
