import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        //hesap makinesi
        int deger ;
        double sayi1,sayi2;
        double toplama,cikartma,carpma,bolme;
        System.out.println("Sayi1 giriniz");
        sayi1= inp.nextDouble();
        System.out.println("Sayi2 giriniz");
        sayi2=inp.nextDouble();
        System.out.println("Deger seciniz:1-toplama\n2-cikartma\n3-carpma\n4-bolme");
        deger= inp.nextInt();

        switch (deger) {
            case 1:
                System.out.println(toplama=sayi1+sayi2);
                break;
            case 2:
                System.out.println(cikartma=sayi1-sayi2);
                break;
            case 3:
                System.out.println(carpma=sayi1*sayi2);
                break;
            case 4:
                System.out.println(bolme=sayi1/sayi2);
                if(sayi2==0)
                    System.out.println("Bolum yapilamaz");

                break;
            default:
                System.out.println("yanlis secim yaptiniz");

        }

            }
}