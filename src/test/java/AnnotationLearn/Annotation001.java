package AnnotationLearn;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation001 {
    @BeforeClass
    void login() {
        Reporter.log("Longin......", true);
    }

    @Test(priority = 1)
    void search() {
        Reporter.log("search ......", true);
    }

    @Test(priority = 2)
    void advanceSearch() {
        Reporter.log("advance search.......", true);
    }

    @AfterClass
    void logout() {
        Reporter.log("logout.......", true);
    }

    @AfterSuite
    void as() {
        System.out.println("This is After suite");
    }
}
