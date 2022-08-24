3import java.util.Scanner;

public class Main {
    static int sonuc=1;
    static int pow(int taban, int us){
        sonuc*=taban;
        if(us==0){

            return 1;
        } else if (us==1) {
            return sonuc;

        }
        return pow(taban,us-1);
    }


    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("taban degerini giriniz");

        int taban= inp.nextByte();
        System.out.println("us degerini giriniz");
        int us=inp.nextByte();

        System.out.println(taban + " ^ " + us + " = " + pow(taban,us));
    }
}

