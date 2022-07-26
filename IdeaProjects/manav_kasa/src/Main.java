
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);


        /*Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/
        System.out.println("Manav fiyat hesaplama");
        double arm,elma,dmts,muz,ptlcn;
        double toplam;

        System.out.println("kac kilo armut alindi");
        arm= inp.nextDouble();
        System.out.println("kac kilo elma alindi");
        elma= inp.nextDouble();
        System.out.println("kac kilo domates alindi");
        dmts= inp.nextDouble();
        System.out.println("kac kilo muz alindi");
        muz= inp.nextDouble();
        System.out.println("kac kilo patlican alindi");
        ptlcn= inp.nextDouble();
        toplam=(2.14*arm)+(3.67*elma)+(1.11*dmts)+(0.95*muz)+(5.0*ptlcn);
        System.out.println("toplam tutar:"+toplam);
    }
}