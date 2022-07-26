import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        int mesafe,yas,yolculukTipi;
        double biletFiyati;

        System.out.println("Mesafeyi km cinsinden giriniz");
        mesafe=inp.nextInt();

        biletFiyati=mesafe*0.1;

        double yas12indirimi=biletFiyati/2;
        double yas24indirimi=biletFiyati-(biletFiyati*0.1);
        double yas65indirimi=biletFiyati-(biletFiyati*0.3);

        System.out.println("Yolcunun yasini giriniz.");
        yas= inp.nextInt();



        System.out.println("Tek yon=1\nGidis-donus=2");
        yolculukTipi= inp.nextInt();

            if(yas>0 && mesafe>0 && yolculukTipi>0 && yolculukTipi<3){
                System.out.println("Tutar:"+biletFiyati);}
                    else if(yas==12  ){
                        biletFiyati=yas12indirimi;}
                            else if (yas>12 && yas<24 ) {
                                biletFiyati=yas24indirimi;}
                                else if (yas==65  ){
                                    biletFiyati=yas65indirimi;
            }



       if(yas>0 && mesafe>0 && yolculukTipi==2) {
           biletFiyati=(biletFiyati-(biletFiyati*0.2))*2;
            }
    else {
        System.out.println("Hatali giris yaptiniz");
       }
   System.out.println("Bilet fiyatiniz:"+biletFiyati);
    }
    }