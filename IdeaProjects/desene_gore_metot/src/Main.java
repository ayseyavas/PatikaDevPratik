import java.util.Scanner;

public class Main {
    static void metot(int sayi){
        if(sayi>0){
            System.out.println(sayi+" ");
            metot(sayi-5);

        }
        System.out.println(sayi+" ");
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int a= inp.nextInt();
        metot(a);
    }
}