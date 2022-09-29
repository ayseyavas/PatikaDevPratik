import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Dizinin eleman sayisini giriniz");
        int elemanSayisi=inp.nextInt();
        int[] list1=new int[elemanSayisi];
        System.out.println("Dizinin Elemanlarını Giriniz:");
        for(int i=0;i< list1.length;i++){
            System.out.println((i+1)+".Eleman");
            list1[i]=inp.nextInt();
        }
    System.out.print("Girilen dizi:");
        System.out.println("Girilen dizi:"+Arrays.toString(list1));
        Arrays.sort(list1);
        System.out.print("Siralanan dizi:");
        System.out.println(Arrays.toString(list1));



    }
}