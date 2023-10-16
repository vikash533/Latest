package AnnotationLearn;

import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = {"Regression test", "smoke test"})
    void test1() {
        System.out.println("This is test method 1");
    }

    @Test(groups = {"smoke test"})
    void test2() {
        System.out.println("This is test method 2");
    }

    @Test(groups = {"Regression test", "smoke test"})
    void test3() {
        System.out.println("This is test method 3");
    }

    @Test(groups = {"Regression test"})
    void test4() {
        System.out.println("This is test method 4");
    }

    @Test(groups = {"Regression test"})
    void test5() {
        System.out.println("This is test method 5");
    }

}
