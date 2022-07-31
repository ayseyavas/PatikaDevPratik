import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sinirSayisi;
        System.out.println("Sinir sayisini giriniz");
        sinirSayisi = inp.nextInt();
        for (int i = 1; i <= sinirSayisi; i *= 4) {
            System.out.println(i +" ");
        }

        for (int i = 1; i <= sinirSayisi; i *= 5) {

            System.out.println(i +"");
        }
    }
}