 import java.util.Arrays;
 import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner inp= new Scanner(System.in);
        //double number=Math.random()*100;
        int number =rand.nextInt(100);
       int right =0;
       int selected;
       int [] wrong=new int [5];
       boolean isWin=false;
       boolean isWrong=false;
       System.out.println(number);
       while(right<5){
           System.out.println("Tahmin giriniz");
            selected= inp.nextInt();

           if(selected<0 || selected>99){
               System.out.println("Lutfen 0 ile 100 arasinda deger giriniz");
               if(!isWrong){
                   right++;
                   System.out.println("Cok fazla hatali giris yaptiniz.Kalan hak:"+(5-right) );


               }else{
                   isWrong=true;
                   System.out.println("Bir sonraki hatali giriste hakkinizdan dusulecektir");
               }
               continue;
           }

            if(selected==number){
                System.out.println("Tebrikler.dogru tahmin!Tahmin ettiginz sayi: "+number);
            isWin=true;
                break;
            }else{


                System.out.println("hatali sayi girildi");
            }if(selected>number){
                System.out.println(selected+" sayisi gizli sayidan buyuktur");
           }else{
               System.out.println(selected+" sayisi gizli sayidan kucuktur");
           }
           wrong[right]=selected;
            right ++;
            System.out.println("kalan hak: "+(5 - right));



       }

        if(!isWin&& !isWrong) {
            System.out.println("Kaybettiniz");


                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));

        }


        System.out.println("Tahmin sayi: "+ number);
    }
}