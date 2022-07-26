import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int havaSicakligi;
        System.out.println("Sicaklik degeri girniz:");
        havaSicakligi= inp.nextInt();
        if(havaSicakligi<=5)
            System.out.println("Kayak yapabilirsiniz");
        if(havaSicakligi>5 && havaSicakligi<=15)
            System.out.println("Sinemaya gidebilirsiniz");
        if(havaSicakligi>15 && havaSicakligi<=25)
            System.out.println("Piknige gidebilirsiniz");
        else
            System.out.println("Yuzmeye gidebilirsiniz");
    }
}