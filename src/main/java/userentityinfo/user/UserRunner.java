package userentityinfo.user;

import java.util.Scanner;

public class UserRunner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        do{
            // Ad soyad
            System.out.println("Kullanici Lutfen Isminizi Giriniz");
            String nam= scan.next();
            nam=nam.substring(0,1).toUpperCase()+nam.substring(1).toLowerCase();
            System.out.println("Kullanici Lutfen Soyadinizi Giriniz");
            String soyad= scan.next();
            soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

            String fulName=nam+" "+soyad;


            // TC no

            String tc;
            boolean tcFrmt;
            do {
                System.out.println("Kullanici Lutfen T.C, giriniz");
                tc = scan.next();
                tcFrmt = tc.replaceAll("\\d", "").length() == 0 && tc.length() == 11;

            }while (!tcFrmt);

            //tel no


            String no ;
            boolean telFrmt;

              do{
                System.out.println("Lutfen Gecerli Bir Telefon No Giriniz");
                no=scan.next();
                  telFrmt= no.startsWith("0")&&no.length()==11&&no.replaceAll("[0-9]","").length()==0;
              }while(!telFrmt);

            //e - mail

            String emaiL;
            boolean emlFrmt;
            do{
                System.out.println("Kullanici Lutfen  Uygun Bir  E Mail Giriniz");
                emaiL=scan.next();
            emlFrmt=emaiL.endsWith("@hotmail.com")||emaiL.endsWith("@gmail.com")||emaiL.endsWith("@outlook.com")&&!emaiL.startsWith("@");
          }while (!emlFrmt);

            //yas
            byte yas;
            do {
                System.out.println("Kullanici Lutfen Yasinizi Giriniz");
                yas = scan.nextByte();
            }while (yas<0);
            //mezuniyet
            System.out.println("Kullanici Lutfen Mezuniyet Yiliniz Giriniz");
            int mez= Math.abs(scan.nextInt());
            while(mez>2022||mez<1900){
                System.out.println("Lutfen Mezuniyet Tarihiniz Icin Gecerli Yil Giriniz");
                mez=scan.nextInt();
            }
             //Kayit

            System.out.println("Kullanici Lutfen Okula Kayit Oldugunuz Yili Giriniz");
            int kay= scan.nextInt();
            while(kay<1900||kay>mez){
                System.out.println("Kullanici Lutfen Gecerli Bir Kayit Tarihi Giriniz.. Kayit Yili Mezuniyet Yilindan Buyuk veya 1900 den Kucuk olamaz");
                kay=scan.nextInt();
            }

            User obj=new User(fulName,tc,no,emaiL);
            User obj1=new User(yas,mez,kay);

            System.out.println();
            System.out.println("*********************");
            System.out.println();
            System.out.println("Kullanici Adi Ve Soyadi  : "+obj.name);
            System.out.println("Kullanici T.C. Kimlik No : "+obj.idTc);
            System.out.println("Kullanici Tel No  : "+obj.tlNo);
            System.out.println("Kullanici Email Adres  : "+obj.eMail);

            System.out.println();
            System.out.println("*********************");

            System.out.println();
            System.out.println("Kullanicinin Yasi  : "+obj1.yas);
            System.out.println("Kullanicinin mezuniyeti : "+obj1.mezuniyet);
            System.out.println("Kullanicinin Kayit Trh : "+obj1.kayit);

            System.out.println();
            System.out.println("***********************");

            System.out.println();
            System.out.println();
            System.out.println("Kullanici Hesabiniz : "+User.usNam);
            System.out.println("Kullanici Hesap Sifreniz : "+User.userPsw);


            System.out.println("Sonlandirmak Icin Q, Devam etmek Icin Herhangi Bir Tusa Basiniz");
            String a=scan.next();
            if(a.equalsIgnoreCase("q")){
                break;
            }




        }while(true);


    }


}
