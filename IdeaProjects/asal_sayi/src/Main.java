import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i, n, control;
        for (n = 2; n < 100; n++) {
            control = 0;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    control = 1;
                    break;
                }
            }
            if (control == 0) {
                System.out.print(n + " ");
            }
        }
    }
}