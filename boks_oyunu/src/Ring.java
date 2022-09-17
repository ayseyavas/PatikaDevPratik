public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    void run(){
        if(isCheck()){
        while(this.f1.health>0 && this.f2.health>0){
            System.out.println("======Yeni Round=====");
            this.f2.health=this.f1.hit(f2);
           if(isWin()){
               break;
           }
            this.f1.health=this.f2.hit(f1);
            if(isWin()){
                break;
            }



                if (Math.random()*100>50){
                    Fighter temp=f1;
                    f1=f2;
                }
                System.out.println("Maca Baslayacak Dovuscu:"+this.f1.name);
        }

        }
        else{
            System.out.println("Sporcularin sikletleri uymuyor");
        }
}
    boolean isCheck(){
        return((this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight));
    }

    boolean isWin(){
        if(this.f1.health ==0){
            System.out.println(this.f2.name+" Kazandi");
            return  true;
        }

        if(this.f2.health ==0){
            System.out.println(this.f1.name+" Kazandi");
            return  true;
        }
        return false;
    }
void printScore(){
        System.out.println("--------------");
    System.out.println(this.f1.name + " Saglik : "+this.f1.health);
    System.out.println(this.f2.name + " Saglik : "+this.f2.health);
}

}
