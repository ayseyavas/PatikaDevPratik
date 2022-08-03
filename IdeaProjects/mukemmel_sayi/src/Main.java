import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi;
        int toplam=0;

        System.out.println("Sayi giriniz");
        sayi= inp.nextInt();
        for(int i=sayi-1;i>=1;i--){
            if(sayi%i==0)
                toplam+=i;


        }
    System.out.println("toplam"+toplam);
        if(toplam==sayi){
            System.out.println("sayiniz mukemmel sayidir");
        }
    else{
        System.out.println("sayiniz mukemmel sayi degildir");
        }
    }
}