import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, turkce, fizik, kimya, biyo, toplam;
        System.out.println("matematik notunu giriniz");
        mat = inp.nextInt();
        System.out.println("turkce notunu giriniz");
        turkce = inp.nextInt();
        System.out.println("fizik notunu giriniz");
        fizik = inp.nextInt();
        System.out.println("kimya notunu giriniz");
        kimya = inp.nextInt();
        System.out.println("biyo notunu giriniz");
        biyo = inp.nextInt();
        toplam = mat + fizik + kimya + turkce + biyo;
        if ((0 <= mat) && (mat <= 100) && (0 <= turkce) && (turkce <= 100) && (0 <= kimya) && (kimya <= 100) && (0 <= fizik) && (fizik <= 100) && (0 <= biyo) && (biyo <= 100))
            System.out.println("Degerler uygun araliktadir, ortalama hesaplaniyor.");
        double ortalama;
        ortalama = toplam / 5.0;
        if (ortalama <= 55) {
            System.out.println("Sinifta kaldiniz" + ortalama);
        } else {
            System.out.println("Sinifi gectiniz");
        }
    }
}