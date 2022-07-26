import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int mat,turkce,tarih,fizik,kimya,muzik;


        System.out.println("Turkce dersinin notunu giriniz:");
        turkce= input.nextInt();
        System.out.println("Matematik dersinin notunu giriniz:");
        mat= input.nextInt();
        System.out.println("Tarih dersinin notunu giriniz:");
        tarih= input.nextInt();
        System.out.println("fizik dersinin notunu giriniz:");
        fizik= input.nextInt();
        System.out.println("kimya dersinin notunu giriniz:");
        kimya= input.nextInt();
        System.out.println("muzik dersinin notunu giriniz:");
        muzik= input.nextInt();

        double ortalama;
        ortalama=(mat+turkce+tarih+fizik+kimya+muzik)/6.0;
        System.out.println("Derslerin ortalamasi=");
        System.out.print(ortalama);

    String sonuc= ortalama>=60 ? "Sinifi Gecti":"Sinifta Kaldi";
        System.out.println("Ogrenci derslerinin ortalamasi="+ortalama+"\nOgrenci"+sonuc);

    }



}
