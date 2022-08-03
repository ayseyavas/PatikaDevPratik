import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Basamak sayisini girin");
        int basamakSayisi= inp.nextByte();
        int toplam=0;
        int sayi1=0,sayi2=1,sayi3;
        
        for(int i=2;i<=basamakSayisi;i++){
            sayi3=sayi1+sayi2;
            System.out.print(sayi1 + " + " +sayi2 + " = "+sayi3);
            sayi1=sayi2;
            sayi2=sayi3;
         System.out.println();
        }


    }
}
