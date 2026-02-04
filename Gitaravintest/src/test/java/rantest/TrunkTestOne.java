package rantest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrunkTestOne {
    @Test
    public void verifyLogin() {
        System.out.println("TestNG is working!");
        Assert.assertTrue(true);
    }



}
