import java.util.Arrays;
public class Main {
    static boolean isFind(int[]arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args) {

        int [] list={1,8,66,84,79,31,44,27,66,66,84,55,31};
        int []ciftsayi=new int[list.length];
        int startIndex=0;
        for(int i=0;i< list.length;i++){
            for(int j=0;j< list.length;j++){
                if((i!=j) && (list[i]==list[j])){
                    if(!isFind(ciftsayi,list[i])){
                        ciftsayi[startIndex++]=list[i];
                    }

                    break;
                }
            }

        }
        for(int value :ciftsayi){
            if(value != 0 && value % 2 != 1)
            System.out.println(value);}

    }
}