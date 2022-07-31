import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner inp=new Scanner(System.in);
        int comb=1,n,r,fak1=1,fak2=1,fak3=1,z;


            System.out.println("n sayisini giriniz");
            n= inp.nextInt();
            System.out.println("r sayisini giriniz");
            r=inp.nextInt();
            if(r>n){
                System.out.println("n sayisi r sayisindan buyuk olmali");

        }


            for(int i=1;i<=n;i++){
            fak1*=n;
            }
            for(int i=1;i<=r;i++){
                fak2*=r;
            }
            z=(n-r);
            for(int i=1;i<=z;i++){

                fak3*=z;
            }


    comb=fak1/(fak2*fak3);



        System.out.println("Kombinasyon sonucu"+comb);
    }
}