public class Main {
    public static void main(String[] args) {
        double a = 47;
        double b = 12;
        double r = 1;
        double vastaus = 1;
        boolean found = false;

        while (found == false) {
            if (a % b == 0) {
                vastaus = b;
                System.out.println(vastaus);
                found = true;
            } else {
                a = b;
                b = r;
            }
        }
    }
}