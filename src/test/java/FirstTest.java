import org.testng.annotations.Test;
import setup.BaseTest;

public class FirstTest extends BaseTest {
    @Test
    public void gridTest(){
        driver.get("https://google.com");
        System.out.println("title-->"+ driver.getTitle());
    }

    @Test
    public void gridTestTwo(){
        driver.get("https://facebook.com");
        System.out.println("title-->"+ driver.getTitle());
    }
}
