import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);


        int basamak;
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayisini Giriniz:");
        basamak= input.nextInt();
        for (int i = 0; i <= basamak; i++) {

            for (int j = basamak; j >= ((basamak)- i); j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * ((basamak) - i) - 1) ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}