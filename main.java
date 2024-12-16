import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HeadsOrTails a = new HeadsOrTails();
        System.out.println(a.toss());
        LeapYear lp = new LeapYear();
        lp.SetYear();
        String ans = lp.Tell() ? "Yes" : "No";
        System.out.println(ans);
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(n + " " + m);
        ;
        D2Array arr = new D2Array();
        arr.InSize(n, m);

        arr.SetArray(sc);
        arr.out();
        sc.close();
    }
}
