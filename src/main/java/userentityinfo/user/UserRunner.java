package userentityinfo.user;

import java.util.Scanner;

public class UserRunner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        do{
            // Ad
            String nam;
            do {
                System.out.println("Kullanici Lutfen Ilk Isminizi Giriniz");
                nam = scan.nextLine().trim();
                if(nam.isBlank()){
                    System.out.println("IlkIsminizi Bos Gecemezsiniz");
                    continue;
                }else {
                    boolean a = nam.replaceAll("[a-zA-Z ]","").length()>0;
                    if(a){
                        System.out.println("Isim Harf Disinda Bir Karakter Iceremez");
                    }else {

                        nam = nam.split(" ")[0];
                        nam = nam.substring(0, 1).toUpperCase() + nam.substring(1).toLowerCase();
                        break;
                    }
                }
            }while(true);

            //Orta Ad

            String nam2;

            do {
                System.out.println("Kullanici Lutfen Varsa Orta isminizi Giriniz Yoksa E'ye Basiniz");

                nam2 = scan.nextLine().trim();
                if (nam2.equalsIgnoreCase("e")) {
                    nam2="";
                    break;
                }else if(nam2.isBlank()){
                    continue;
                } else {
                    boolean ortFrmt=nam2.replaceAll("[a-zA-Z ]","").length()>0;
                    if(ortFrmt) {

                        System.out.println("Harf Disinda Karakter Iceren Bir Isim Giremezsiniz");
                    }else {
                        nam2=nam2.split(" ")[0];
                        nam2 = nam2.substring(0, 1).toUpperCase() + nam2.substring(1).toLowerCase();
                        break;
                    }
                }
            }while (true);

            //Soyad

            String soyad;
            do {
                System.out.println("Kullanici Lutfen Soyadinizi Giriniz");
                soyad = scan.nextLine().trim();
                if(soyad.isBlank()){
                    System.out.println("Soyadi Bos Gecemezsiniz");
                }else {
                    boolean syFrm=soyad.replaceAll("[a-zA-Z ]","").length()>0;
                    if(syFrm){
                        System.out.println("Soyad Harf Disinda Bir Karakter Iceremez");
                    }else {

                        soyad=soyad.split(" ")[0];
                        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
                        break;
                    }

                }
            }while(true);

            String fulName=nam+" "+nam2+" "+soyad;
            fulName=fulName.replace("  "," ");




            // TC no

            String tc;
            boolean tcFrmt;
            do {

                System.out.println("Kullanici Lutfen T.C, giriniz");
                tc = scan.nextLine().trim().replaceAll(" ","");

                tcFrmt = tc.replaceAll("\\d", "").length() == 0 && tc.length() == 11;

            }while (!tcFrmt);
            //tel no


            String no;
            boolean telFrmt;

            do {
                System.out.println("Lutfen Gecerli Bir Telefon No Giriniz");
                no = scan.nextLine().trim().replaceAll(" ","");
                telFrmt = no.startsWith("0") && no.length() == 11 && no.replaceAll("[0-9]", "").length() == 0;
            } while (!telFrmt);

            //e - mail

            String emaiL;
            boolean emlFrmt;
            do{
                System.out.println("Kullanici Lutfen  Uygun Bir  E Mail Giriniz");
                emaiL=scan.nextLine().trim();
                emlFrmt=emaiL.endsWith("@hotmail.com")||emaiL.endsWith("@gmail.com")||emaiL.endsWith("@outlook.com")&&!emaiL.startsWith("@")&&!emaiL.contains(" ");
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
