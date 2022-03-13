package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {
    @Test
    public void test1(){
        Assert.assertEquals("one", "one");
    }
    @Test
    public void test2(){
        String email= "ymnbayrak@gmail.com";
        Assert.assertTrue("ymnbayrak@gmail.com".contains("@"), "verify sign @");
    }
    @Test
    public void test3(){
        Assert.assertNotEquals("one", "two" );
    }
    @Test
    public void test4(){
        Assert.assertFalse(1<0);
    }
}
