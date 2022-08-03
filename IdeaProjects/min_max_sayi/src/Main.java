
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayac, enBuyuk = 0, enKucuk = 0, sayi;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Girilecek Sayi Adedini Yazin : ");
        sayac = girdi.nextInt();

        for (int i = 1; i <= sayac; i++) {
            System.out.print("Lutfen " + i + ". Sayiyi Giriniz :");
            sayi = girdi.nextInt();
            if (sayac == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                } else if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }
        }
        System.out.println("En Buyuk Sayi : " + enBuyuk);
        System.out.print("En Kucuk Sayi : " + enKucuk);
    }
}