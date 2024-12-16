// To be Done for command Line Argumensts
public class Distance {
    public static void main(String[] args) {

        for (String s : args) {
            for (int i = 0; i < s.length(); i++) {
                char a = s.charAt(i);
                if (!(a <= '9' && a >= '0')) {
                    System.out.println("Give proper Arguments!");
                    System.exit(0);
                }
            }
        }
        if (args.length != 2) {
            System.out.println("Give only two Arguments!");
            System.exit(0);
        }
        double x = Integer.parseInt(args[0]);
        double y = Integer.parseInt(args[1]);
        double ans = (Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(ans);

    }
}