import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        //dairenin alan ve cevresini hesaplama
        int r;
        double pi=3.14;
        double cevre,alan;


        System.out.println("dairenin yaricapini giriniz");
    r=inp.nextInt();
    cevre=2*pi*r;
    System.out.println("dairenin cevresi:"+cevre);
    alan=pi*r*r;
    System.out.println("darienin alani:"+alan);

    }
}