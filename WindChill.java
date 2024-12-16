public class WindChill {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Exactly Two Arguments To be Given!");
            System.exit(1);
        }
        double v = 0, t = 0;
        try {

            v = Double.parseDouble(args[0]);
            t = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Arguments must be in format decimal Format");
            System.exit(1);
        }
        double w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
        System.out.println("answer: " + w);
    }
}
