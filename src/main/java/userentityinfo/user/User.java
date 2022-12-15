package userentityinfo.user;

public class User {

    String name;
    String idTc;
    String tlNo;
    String eMail;

    int yas;
    int mezuniyet;
    int kayit;


    static String usNam;

    static String userPsw;
    static int count=100;


    public void setUsNam(){
        usNam=eMail.replaceAll("[@.]","");
    }

    public void setUserPsw(){
        count++;
        userPsw=""+mezuniyet+kayit+count;
    }

    public User(String name,String idTc,String tlNo,String eMail){

        this.name=name;
        this.idTc=idTc;
        this.tlNo=tlNo;
        this.eMail=eMail;

        setUsNam();

    }

    public User(int yas,int mezuniyet,int kayit){
        this.yas=yas;
        this.mezuniyet=mezuniyet;
        this.kayit=kayit;

        setUserPsw();
        
        

    }

}
