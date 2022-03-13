package com.cybertek.tests.day7_testNG;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

@Test
    public void test1(){
    System.out.println("BeforeAndAfter1");
}
    @Test
    public void test2(){
        System.out.println("BeforeAndAfter2");
    }
    @Test
    public void test3(){
        System.out.println("BeforeAndAfter3");
    }
@BeforeMethod
    public void setUpMethod(){
    System.out.println("BeforeMethod");
}
@AfterMethod
    public void tearDown(){
    System.out.println("AfterMethod");
}
@BeforeClass
    public void beforeEverything(){
    System.out.println("Before everything");
}
@AfterClass
    public void afterEverthing(){
    System.out.println("After everything");
}


}
