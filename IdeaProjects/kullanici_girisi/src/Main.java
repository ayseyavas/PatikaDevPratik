import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre, yenisifre;
        int evet = 1, hayir = 0, sonuc;
        System.out.print("Kullanici Adinizi Giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        sifre = input.nextLine();
        if (sifre.equals("123456")) {
            System.out.println("Basari ile giris yaptiniz");


        } else if (sifre != "123456") {
            System.out.println("Sifreyi yanlis girdiniz.Sifrenizi sifirlamak istiyor musunuz?\n" +
                    "Evet ise 1'e Hayir ise 0'a basiniz");


        }
        sonuc = input.nextInt();
        if (sonuc==hayir) {
            System.out.println("Tekrar sifre girmeyi deneyiniz.");
        }

        else if (sonuc == evet) {
            System.out.print("Yeni sifrenizi giriniz: ");
            yenisifre = input.next();
            if (yenisifre.equals("123456")) {
                System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
            } else if (yenisifre!="123456") {
                System.out.println("Sifre oluşturuldu.");
            }

        }
    }
}