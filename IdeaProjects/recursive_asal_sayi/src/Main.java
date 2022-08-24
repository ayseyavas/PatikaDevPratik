import java.util.Scanner;

public class Main {

    static void asal(int sayi){
        int sayac=0;
        for(int i=2;i<=sayi;i++){
            if(sayi%i==0)
                sayac ++;

        }
        if(sayac==1){
            System.out.println("Girilen sayi asal sayidir");
        }

    else {
        System.out.println("Girilen sayi asal degildir");
    }
}

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Sayi degeri giriniz");
        int a= inp.nextInt();
        asal(a);
    }


}