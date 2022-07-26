import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a, b, c;

        System.out.print("Lütfen Birinci Sayıyı Giriniz: ");
        a = inp.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        b = inp.nextDouble();
        System.out.print("Lütfen Üçüncü Sayıyı Giriniz: ");
        c = inp.nextDouble();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("c<a<b");
            } else {
                System.out.println("c<b<a");
            }


        }
    }
}