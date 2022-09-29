import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []list={10, 20, 20, 10, 10, 20, 5, 20};
        int tekrar=1;
        Arrays.sort(list);

        for(int i=0;i< list.length;i++){
            for(int j=0;j< list.length;j++){
                if((j!=i)&& list[i]==list[j]) {
                    tekrar++;
                   i++;
                }
                }
        if(tekrar>1){
            System.out.println(list[i]+"  sayisi  "+tekrar+"  kere tekrar edildi");

        }
        }
    tekrar++;
    }
}