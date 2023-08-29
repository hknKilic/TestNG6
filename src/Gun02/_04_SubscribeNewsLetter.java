package Gun02;


/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.
  3- Ayrı bir test ile Newsletter  Subscribe işlemini abonelikten çıkınız(NO)
  4- Ayrı bir test ile Newsletter  Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapınız.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_SubscribeNewsLetter extends BaseDriver {

    @Test(priority = 1)
    public void subscribeFunctionYes(){

        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(By.xpath("//input[@value='1']"));
        subscribeYes.click();

        WebElement continueButton=driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        MyFunc.successMessageValidation();
    }

    @Test(priority = 2)
    public void subscribeFunctionNo(){

        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();

        WebElement subscribeNo=driver.findElement(By.xpath("//input[@value='0']"));
        subscribeNo.click();

        WebElement continueButton=driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        MyFunc.successMessageValidation();
    }

    @Test(priority = 3)
    public void subscribeFunctionForBoth(){

        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(By.xpath("//input[@value='1']"));
        WebElement subscribeNo=driver.findElement(By.xpath("//input[@value='0']"));

        //eğer yes seçili ise noyu tıkla else yes i tıkla
        if (subscribeYes.isSelected())
            subscribeNo.click();
        else
            subscribeYes.click();

        WebElement continueButton=driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        MyFunc.successMessageValidation();
    }

}
