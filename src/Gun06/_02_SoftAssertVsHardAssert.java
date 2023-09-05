package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_SoftAssertVsHardAssert {

    @Test
    public void hardAssert() {
        String s1 = "Merhaba";

        System.out.println("Assert öncesi");
        Assert.assertEquals("Merhaba123", s1, "Oluşanla beklenen aynı değil"); // hata oluştuğunda program kırılır
        System.out.println("Assert sonrası");

    }

    @Test
    public void softAssert() {
        String strHomePage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String strEditAccount = "www.facebook.com/editaccountpage";

        Assert.assertEquals("www.facebook.com/homepage", strHomePage); // pass
        System.out.println("Assert 1");

        Assert.assertEquals("www.facebook.com/profile", strCartPage); // fail
        System.out.println("Assert 2");

        Assert.assertEquals("www.facebook.com/homepage", strHomePage); // pass
        System.out.println("Assert 3");



    }

}
