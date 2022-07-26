import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        //Kilo (kg) / Boy(m) * Boy(m)

        System.out.println("Kitle endeksi hesaplama");
        double kilo,boy,kitleEndeksi;
        System.out.println("Boyunuzu giriniz");
        boy= inp.nextDouble();
        System.out.println("Kilonuzu giriniz");
        kilo= inp.nextDouble();
        kitleEndeksi=kilo/(boy*boy);
        System.out.println("vucut kitle endeksiniz="+kitleEndeksi);
    }
}