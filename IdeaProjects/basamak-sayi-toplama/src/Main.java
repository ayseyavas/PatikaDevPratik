import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int toplam=0;
        int sayi= inp.nextInt();
        int temp=sayi;
        while(temp!=0){
            toplam+=temp%10;
            temp=temp/10;



        }
        System.out.println(toplam);
    }
}