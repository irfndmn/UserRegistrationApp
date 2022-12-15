package userentityinfo.user;

import java.util.Scanner;

public class ControlForName {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
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
                boolean ortFrmt=nam2.replaceAll("[a-zA-Z]","").length()>0;
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
                boolean syFrm=soyad.replaceAll("[a-zA-Z]","").length()>0;
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

        System.out.println(fulName);



    }
}
