import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("basamak sayisi giriniz");
        int basSay= inp.nextByte();
        for (int i = 1; i <= basSay; i++) {
            for (int j = 0; j < (basSay - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i=0;i<=basSay;i++){
            for (int j=basSay; j>(basSay-i);j--){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*(basSay-i)-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


