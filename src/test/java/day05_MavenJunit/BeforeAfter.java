package day05_MavenJunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAfter {
    @Before
    public void setup(){
        System.out.println("All test worked before methods");

    }
    @After
    public void tearDown(){
        System.out.println("All test worked after methods running");
    }
    @Test
    public  void test(){
        System.out.println("First test");
    }
    @Test
    public void test1(){
        System.out.println("Second test worked");
    }

}
