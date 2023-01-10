package day05_MavenJunit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JUnit {
    //we will learn TESTNG  framework as well which is the advanced version of Junit
    //JUnit is the most basic JAva testing framework
    //@Before @After----only once running,each method
    // @Test--creating test cases
    // Ignore---used for skeeping
    // @beforeclass, @afterclass---run before and after only once each class
    //JUNIT has similar assertions to TESTNG
    @Test
public  void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techproeducation.com");

}


}
