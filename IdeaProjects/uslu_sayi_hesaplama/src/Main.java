import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int taban,us,sonuc=1;
        System.out.println("taban degerini giriniz");
        taban= inp.nextByte();
        System.out.println("us degerini giriniz");
        us=inp.nextByte();
        for(int i=1;i<=us;i++){
            sonuc*=taban;
        }
    System.out.println(sonuc);
    }
}