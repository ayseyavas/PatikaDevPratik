
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin Satir sayisini giriniz:");
        int satirSayisi= scan.nextInt();
        System.out.print("Dizinin Sutun sayisini giriniz:");
        int sutunSayisi= scan.nextInt();
        minesweeper minesweeper = new minesweeper(satirSayisi, sutunSayisi);
        minesweeper.oyna();

    }
}