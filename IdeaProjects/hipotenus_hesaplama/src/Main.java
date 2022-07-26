import java.util.Scanner;

public class Main {

    //hipotenus hesaplayan program
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,b,c;
        double alan,cevre,u,alaninkaresi;


        System.out.println("Birinci Kenar uzunlugu:");
        a=inp.nextInt();
        System.out.println("ikinci Kenar uzunlugu:");
        b=inp.nextInt();
        System.out.println("Ucuncu Kenar uzunlugu:");
        c=inp.nextInt();

        cevre=(a+b+c);
        u=(cevre/2);
        alaninkaresi= u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alaninkaresi);
        System.out.println("Ucgeninizin cevresi:"+cevre);
        System.out.println("Ucgeninizin alanı:"+alan);



    }
}