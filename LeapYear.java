import java.util.Scanner;

public class LeapYear {
    private int a;

    public void SetYear() {
        System.out.println("Enter the Year:");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        a = c;
        sc.close();
    }

    public Boolean Tell() {
        if (a % 100 == 0) {
            if (a % 400 == 0) {
                return true;
            }
            return false;
        } else if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}