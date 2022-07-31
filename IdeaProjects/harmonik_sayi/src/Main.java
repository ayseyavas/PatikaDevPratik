import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int sayi;
        double harm=0,bolme=0;

        System.out.println("sayi giriniz");
        sayi= inp.nextInt();
        for (int i = 1; i <= sayi; i++){
            bolme = (1.0 / i);
            harm += bolme;
        }

        System.out.println(harm);
    }
}