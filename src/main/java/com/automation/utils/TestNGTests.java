package com.automation.utils;


import org.testng.annotations.*;

public class TestNGTests {

    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("Navigate to app");
    }


    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("beforeTestMethod");
    }

    @AfterMethod
    public void afterTestMethod() {
        System.out.println("afterTestMethod");
    }

    @Test
    public void method1() {
        System.out.println("Success login !!!");
    }

    @Test
    public void method2() {
        System.out.println("invalid login !!!");
    }

    @Test
    public void method3() {
        System.out.println("invalid 2 login !!!");
    }


    @AfterClass
    public void afterClassMethod() {
        System.out.println("close tab !!!");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("quite driver");
    }


    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("init driver");
    }

}
