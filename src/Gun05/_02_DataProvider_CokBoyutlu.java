package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider = "UserData")
    public void userTest(String username, String password){
        //username,password
        System.out.println(username+" "+password);
    }

    @DataProvider // bu metoda dataprovider görevi verildi.
    public Object[][] UserData(){ // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
        Object[][] data={
                {"ihsan","122334"},
                {"sokol", "rustem5"},
                {"zeynep","zeynep111"},
                {"serkan","serkan500"}
        };

        return data;
    }



}

/**
 * Aşağıdaki ikili ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
 * data sayısı kadar test çalıştırılır, dataların olduğu yere DataProvider annottion ı konur.
 * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
 * Dataprovider bir testi birden fazla DATA ile çok çalıştırmak için kullanılır.
 * XML file ise file gruplama, pararalel, ve farklı tesleri koordine edip birarada çalıştırmak için kullanılır.
 */