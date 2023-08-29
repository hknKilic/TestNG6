package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Dependency {
    // Arabanın hareket sırası: start, drive, park, stop
    @Test
    public void startCar()  {
        System.out.println("startCar");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})// bu testin çalışması, startCar ın hatasız çalışmasına bağımlı
    public void driveCar()  {  System.out.println("driveCar"); }

    @Test(dependsOnMethods = {"driveCar","startCar"})
    public void parkCar()   {  System.out.println("parkCar");  }

    @Test(dependsOnMethods = {"parkCar"})
    public void stopCar()   {  System.out.println("stopCar");  }

    // aynı seviyedeki testleri için priority verilebilir.
}
