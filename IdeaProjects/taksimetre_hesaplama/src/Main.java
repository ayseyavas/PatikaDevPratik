import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/
    Scanner inp=new Scanner(System.in);
    double km,toplam;
        System.out.println("Gidilen kmyi giriniz:");
        km=inp.nextDouble();

        toplam=10+(km*2.20);
        if(toplam<20)
            System.out.println("tutar 20 tldir");
        else
            System.out.println("Tutar"+toplam+"tldir");


    }
}