import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double Ilkfiyat,kdvliFiyat;
            System.out.println("kdvsiz fiyati giriniz:" );
            Ilkfiyat= input.nextDouble();

        if(0<Ilkfiyat && Ilkfiyat>1000)
            kdvliFiyat=Ilkfiyat+(0.18*Ilkfiyat);
        else
            kdvliFiyat=Ilkfiyat+(0.8*Ilkfiyat);
        System.out.println("Kdvli fiyat="+kdvliFiyat);

    }


}