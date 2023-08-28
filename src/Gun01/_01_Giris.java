package Gun01;


import org.testng.annotations.Test;

public class _01_Giris {

//    public static void main(String[] args) {
//        driverIslemleriniYap();
//        websitesiniAc();
//        LoginTestiniYap()
//    }

//      @Test JUnit Test i
//      public void Test1()
//      {
//          driverIslemleriniYap();
//          websitesiniAc();
//          LoginTestiniYap()
//      }

    //Default olarak alfabetik sıraya göre çalışır

    @Test
    public void driverIslemleriniYap() {
        System.out.println("driverIslemleriniYap yapıldı");
    }

    @Test
    public void websitesiniAc() {
        System.out.println("websitesiniAc işlemi yapıldı");
    }

    @Test
    public void loginTestiniYap() {
        System.out.println("loginTestiniYap işlemi yapıldı");
    }

    @Test
    public void driverKapat() {
        System.out.println("driverKapat işlemi yapıldı");
    }

}
