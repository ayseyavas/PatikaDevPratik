import java.util.Random;
import java.util.Scanner;
public class minesweeper {

    Scanner inp = new Scanner(System.in);
    Random rnd = new Random();
    int satirSayisi;
    int sutunSayisi;
    int mayinSayisi;
    String[][] gameBoard;
    String[][] gameMap;
    int satir;
    int sutun;
    int nearStarCount;


    minesweeper(int row ,int col){
        this.satirSayisi=row;
        this.sutun=col;
        this.gameBoard=new String[row][col];
        this.gameMap=new String[row][col];
        this.mayinSayisi=(col*row)/4;

    }
void yildizYeri(){
for(int i=0;i<mayinSayisi;i++){
    while(true){
        int a=(int)(Math.random()*satirSayisi);
        int b=(int)(Math.random()*sutunSayisi);
        if(gameMap[a][b]!="*"){
            gameMap[a][b]="*";
            break;

        }
    }
}
    }
void printGameMap(){
        System.out.println("Mayin Tarlasinin konumu");
        yildizYeri();
        for(int i = 0; i< gameMap.length;i++){
            for(int j = 0; j< gameMap[0].length;j++){
                if(gameMap[i][j]!="*"){
                    gameMap[i][j] = "-";
                }
            System.out.print(gameMap[i][j]+" ");
            }
        System.out.println();
        }
System.out.println("===============================");
}
void elementsGameBoard(){
        for(int i=0;i< gameBoard.length;i++){
            for(int j=0;j< gameBoard[i].length;j++){
                gameBoard[i][j]="-";

                }
        }
}
    void printGameBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
void getData() {
    boolean isTrue = false;
    Scanner inp = new Scanner(System.in);
    System.out.println("Secmek istediginiz noktanin satir bilgisini giriniz");
    satir = inp.nextInt() ;
    System.out.println("Secmek istediginiz noktanin satir bilgisini giriniz");
    sutun = inp.nextInt() ;
    while (!isTrue) {
        if (satir < 0 || satir > gameBoard.length -1|| sutun < 0 || sutun < gameBoard[0].length -1 ) {
        System.out.print("HATALI GIRIS YAPTINIZ!.TEKRAR GIRINIZ");
        System.out.println("Secmek istediginiz noktanin satir bilgisini giriniz");
        satir = (inp.nextInt() -1) ;
        System.out.println("Secmek istediginiz noktanin satir bilgisini giriniz");
        sutun = (inp.nextInt()-1);}

        else{
        isTrue = true;
    }}
    System.out.print("================================");}

    public int starCountMap(){
        nearStarCount=0;
        if(sutun+1< gameMap[0].length-1){
            if(gameMap[satir][sutun+1]=="*")
                nearStarCount++;
        }
if(sutun -1>=0){
    if(gameMap[satir][sutun - 1]=="*")
        nearStarCount++;


    }
        if (satir + 1 < gameMap.length - 1) {
            if (gameMap[satir + 1][sutun] == "*")
                nearStarCount++;
        }

        if (satir - 1 >= 0) {
            if (gameMap[satir - 1][sutun] == "*")
                nearStarCount++;
        }
        if (satir - 1 >= 0 && sutun - 1 >= 0) {
            if (gameMap[satir - 1][sutun - 1] == "*")
                nearStarCount++;
        }
        if (satir - 1 >= 0 && sutun + 1 < gameMap[0].length - 1)
            if (gameMap[satir - 1][sutun + 1] == "*")
                nearStarCount++;
        if (satir + 1 < gameMap.length - 1 && sutun - 1 >= 0)
            if (gameMap[satir + 1][sutun - 1] == "*")
                nearStarCount++;
        if (satir + 1 < gameMap.length - 1 && sutun + 1 < gameMap[0].length - 1)
            if (gameMap[satir + 1][sutun + 1] == "*")
                nearStarCount++;
        return nearStarCount;
}
void changeBoardGame(){
    switch(starCountMap()){
        case 0:
            gameBoard[satir][sutun] = "0";
            gameMap[satir][sutun] = "0";
            break;
            case 1:
            gameBoard[satir][sutun] = "1";
            gameMap[satir][sutun] = "1";
            break;
        case 2:
            gameBoard[satir][sutun] = "2";
            gameMap[satir][sutun] = "2";
            break;
        case 3:
            gameBoard[satir][sutun] = "3";
            gameMap[satir][sutun] = "3";
            break;
        case 4:
            gameBoard[satir][sutun] = "4";
            gameMap[satir][sutun] = "4";
            break;
        case 5:
            gameBoard[satir][sutun] = "5";
            gameMap[satir][sutun] = "5";
            break;
        case 6:
            gameBoard[satir][sutun] = "6";
            gameMap[satir][sutun] = "6";
            break;
        case 7:
            gameBoard[satir][sutun] = "7";
            gameMap[satir][sutun] = "7";
            break;
        case 8:
            gameBoard[satir][sutun] = "8";
            gameMap[satir][sutun] = "8";
            break;
        case 9:
            gameBoard[satir][sutun] = "9";
            gameMap[satir][sutun] = "9";
            break;

    }}
boolean checkContinue(){
        for(int i = 0;i< gameMap.length;i++){
            for(int j = 0; j< gameMap[0].length;j++){
                if(gameMap[i][j]=="-")
                    return false;
            }
        }

    return true;}
void oyna (){
        printGameMap();
        System.out.println("Mayin tarlasi oyunu");
        System.out.println("--------------------------");
        elementsGameBoard();
        printGameBoard();
        while(true){
            this.getData();
            if(gameMap[satir][sutun]=="*"){
                System.out.print("Mayina bastiniz.Kaybettiniz!!");
                break;
            }else{
                changeBoardGame();
                printGameBoard();
                if((checkContinue())){
                    System.out.print("Tebrikler kazandiniz!");
                    break;
                }
            }
        }
    }
}
