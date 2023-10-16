package AnnotationLearn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethod {
    @Test
    void openApp() {
        System.out.println("Open the appp");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"openApp"})
    void login() {
        System.out.println("login the app");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"login"})
    void search() {
        System.out.println("secach statrt ......");
    }

    @Test(dependsOnMethods = {"search"})
    void advanceSearch() {
        System.out.println("this is advance search");
    }

    @Test(dependsOnMethods = {"advanceSearch"})
    void logout() {
        System.out.println("this is logout from app");
    }
}
