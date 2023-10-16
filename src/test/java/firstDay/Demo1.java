package firstDay;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
    @Test
    void test1() {
        Reporter.log("this is test 1", true);
    }

    @Test
    void test2() {
        Reporter.log("this is test 2", true);
    }

    @Test
    void test3() {
        Reporter.log("this is test 3", true);
    }

    @Test
    void test4() {
        System.out.println("this is test 4");
    }

    @Test
    void test5() {
        System.out.println("This is test 5");
    }

}
