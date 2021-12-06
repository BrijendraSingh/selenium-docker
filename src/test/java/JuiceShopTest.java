import org.testng.annotations.Test;
import setup.BaseTest;

public class JuiceShopTest extends BaseTest {
    @Test
    public void JuiceOneTest(){
        driver.get("https://google.com");
        System.out.println("juice shop test one");
        System.out.println("title google-->"+ driver.getTitle());
    }

    @Test
    public void JuiceTwoTest(){
        driver.get("https://facebook.com");
        System.out.println("juice shop test two");
        System.out.println("title facebook-->"+ driver.getTitle());
    }

    @Test
    public void JuiceThreeTest(){
        driver.get("https://twitter.com");
        System.out.println("juice shop test three");
        System.out.println("title twitter-->"+ driver.getTitle());
    }
}
