public class HeadsOrTails {

    public String toss() {
        double a = Math.random();
        if (a < 0.5) {
            return "Tails";
        } else {
            return "Heads";
        }
    }
}