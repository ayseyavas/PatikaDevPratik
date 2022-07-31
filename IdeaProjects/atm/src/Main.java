import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int right =3,bakiye=1500,secim,tutar,secim1;


        while (right>0){
            System.out.print("Kullanıcı Adınız: ");
            userName= input.nextLine();
            System.out.print("Parolanız: ");
            password =input.nextLine();
            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Başarıyla Sisteme Giriş Yaptınız.");
                System.out.println("Merhaba Patika Bankasına Hoşgeldiniz. Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
                System.out.println("1-) Para Yatırma\n2-)Para Çekme\n3-) Bakiye Sorgulama\n4-) Çıkış Yap");
                secim = input.nextInt();

                switch (secim){
                    case(1):{
                        System.out.print("Yatırmak İstediğiniz Tutarı Giriniz: ");
                        tutar = input.nextInt();
                        bakiye += tutar;
                        System.out.println("Para Yatırma İşlemi Başarıyla Gerçekleştirilmiştir " + "Yeni Bakiyeniz: "+bakiye);
                        System.out.print("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz. Kartınızı Almayı Unutmayın Lütfen.");
                        break;


                    }
                    case(2):{
                        System.out.print("Lütfen Çekmek İstediğiniz Tutarı Gİriniz:");
                        tutar = input.nextInt();
                        if(tutar>bakiye){
                            System.out.print("Yetersiz Bakiye");
                        }
                        else{
                            System.out.println("Para Çekme İşlemi Başarılı.");
                            System.out.println("Mevcut Bakiyeniz: "+(bakiye-tutar));
                            System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz. Kartınızı Almayı Unutmayın Lütfen.");
                            break;
                        }
                    }
                    case(3):{
                        System.out.print("Mevcut Bakiyeniz: "+bakiye);
                        System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz. Kartınızı Almayı Unutmayın Lütfen.");
                        break;

                    }
                    case(4):{
                        System.out.print("Çıkış İşleminiz Başarıyla Gerçekleştirilmiştir.\n" +
                                "Kartınızı Almayı Unutmayın Lütfen.İyi GÜnler Dileriz.");
                        break;
                    }
                    default:{
                        System.out.print("Hatalı Bir Giriş Yaptınız...");
                    }
                }

                break;
            }else{
                right--;
                System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyin.");
                if(right == 0){
                    System.out.print("Kartınız Bloke Olmuştur Lütfen Bankanız İle İletişime Geçiniz...");
                }else{
                    System.out.println("Kalan Hakkınız: "+ --right);
                }
            }


        }



    }



}