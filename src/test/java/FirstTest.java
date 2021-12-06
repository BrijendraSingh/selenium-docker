import org.testng.annotations.Test;
import setup.BaseTest;

public class FirstTest extends BaseTest {
    @Test
    public void googleTest(){
        driver.get("https://google.com");
        System.out.println("title google-->"+ driver.getTitle());
    }

    @Test
    public void facebookTest(){
        driver.get("https://facebook.com");
        System.out.println("title facebook-->"+ driver.getTitle());
    }

    @Test
    public void twitterTest(){
        driver.get("https://twitter.com");
        System.out.println("title twitter-->"+ driver.getTitle());
    }
}
