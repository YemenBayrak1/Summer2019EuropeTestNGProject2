package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
public class Homework {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethot() throws InterruptedException {
        Thread.sleep(5000);
        // driver.quit();
    }

   /* Test case #1
    Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    Step 2. Click on “Registration Form”
    Step 3. Enter “wrong_dob” into date of birth input
    box.
            Step 4. Verify that warning message is displayed:
            “The date of birth is not valid”

    */

    @Test
    public void test1() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registrationForm = driver.findElement(By.linkText("Registration Form"));
        registrationForm.click();
        WebElement birthday = driver.findElement(By.name("birthday"));
        birthday.click();
        birthday.sendKeys("22/22/2222");
        String actualText = driver.findElement(By.cssSelector("small[data-bv-validator='date']")).getText();
        System.out.println(actualText);
        String expextedText = "The date of birth is not valid";
        if (actualText.equals(expextedText)) {
            System.out.println("warning message is verified");

        } else {
            System.out.println("warning message is not verified");
        }


    }

    /* Test case #2
     Step 1. Go to “https://practice-
     cybertekschool.herokuapp.com”
     Step 2. Click on “Registration Form”
     Step 3. Verify that following options for
     programming languages are displayed: c++, java,
     JavaScript
     */
    @Test
    public void test2() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registrationForm = driver.findElement(By.linkText("Registration Form"));
        registrationForm.click();
        WebElement imageLink = driver.findElements(By.tagName("label")).get(14);
        WebElement imageLink2 = driver.findElements(By.tagName("label")).get(15);
        WebElement imageLink3 = driver.findElements(By.tagName("label")).get(16);

        System.out.println(imageLink.getText());
        System.out.println(imageLink2.getText());
        System.out.println(imageLink3.getText());
        if (imageLink.getText().equals("C++") & imageLink2.getText().equals("Java") & imageLink3.getText().equals("JavaScript")) {
            System.out.println("programming languages are displayed: c++, java, JavaScript");
        } else {
            System.out.println("programming languages are not displayed: c++, java, JavaScript");
        }


    }

    /*
     Test case #3
     Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     Step 2. Click on “Registration Form”
     Step 3. Enter only one alphabetic character into first
     name input box.
             Step 4. Verify that warning message is displayed:
             “first name must be more than 2 and less than 64
     characters long”*/
    @Test
    public void test3() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("a");
        String warningMessage = driver.findElement(By.xpath("//small[text()='first name must be more than 2 and" +
                " less than 64 characters long'] ")).getText();
        String expextedText = "first name must be more than 2 and less than 64 characters long";
        assertEquals(warningMessage, expextedText);
        //assertTrue(warningMessage.equals(expextedText));

    }

    /*
     Test case #4
     Step 1. Go to https://practice-cybertekschool.herokuapp.com
     Step 2. Click on “Registration Form”
     Step 3. Enter only one alphabetic character into last
     name input box.
             Step 4. Verify that warning message is displayed:
             “The last name must be more than 2 and less than
 64 characters long”

     */
    @Test
    public void test4() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("a");
        String warningMessage = driver.findElement(By.xpath("(//small[@data-bv-result='INVALID'])[1]")).getText();
        String expextedText = "The last name must be more than 2 and less than 64 characters long";
        assertEquals(warningMessage, expextedText);
      //  assertTrue(warningMessage.equals(expextedText));

    }

    /*   Test case #5
 Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
 Step 2. Click on “Registration Form”
 Step 3. Enter any valid first name.
 Step 4. Enter any valid last name.
 Step 5. Enter any valid user name.
 Step 6. Enter any valid password.
 Step 7. Enter any valid phone number.
 Step 8. Select gender.
 Step 9. Enter any valid date of birth.
 Step 10. Select any department.
 Step 11. Enter any job title.
 Step 12. Select java as a programming language.
 Step 13. Click Sign up.
 Step 14. Verify that following success message is
 displayed: “You've successfully completed
 registration!”
 Note: for using dropdown, please refer to the
 documentation: https://selenium.dev/selenium/
 docs/api/java/org/openqa/selenium/support/ui/
 Select.html or, please watch short video about drop-
 downs that is posted on canvas.
 Syntax of XPath
 Below is the syntax for Xpath:
 Xpath =//tagname[@Attribute=’value’]
 */
    @Test
    public void test5() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        //Step 3. Enter any valid first name.
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yemen");

        //Step 4. Enter any valid last name.
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bayrak");

        //send email
        driver.findElement(By.name("email")).sendKeys("email123@gmail.com");

        //Step 5. Enter any valid user name.
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Yamanbey12");

        //Step 6. Enter any valid password.
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("passwordP");

        //Step 7. Enter any valid phone number.
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("902-245-6555");
        //Step 8. Select gender.
        driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();

        //Step 9. Enter any valid date of birth.
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("11/11/2001");
        //Step 10. Select any department.
        //open the drop down
        driver.findElement(By.xpath("//select[@name='department']")).click();
        driver.findElement(By.xpath("//option[@value='DA']")).click();


        //Step 11. Enter any job title.
        driver.findElement(By.name("job_title")).click();
        WebElement dropDownElement = driver.findElement(By.name("job_title"));
        Select jobList = new Select(dropDownElement);
        jobList.selectByVisibleText("Developer");

        //Step 12. Select java as a programming language.
        driver.findElement(By.xpath("//input[@value='java']")).click();
        //Step 13. Click Sign up.
        driver.findElement(By.xpath("//button[@id='wooden_spoon']")).click();
        //Step 14. Verify that following success message is
        //displayed: “You've successfully completed registration!”
      /*  Set<String> windowHandles=driver.getWindowHandles();
        String targetWindowTitle="https://practice-cybertekschool.herokuapp.com/registration_confirmation";

        //we will keep switching window until our title equals to targetWindowTitle.
        for (String windowHandle : windowHandles) {
            //switch them one by one
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().equals(targetWindowTitle)) {
                break;
            }*/
           //driver.switchTo().window("https://practice-cybertekschool.herokuapp.com/registration_confirmation");
            Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You've successfully completed registration!");
        }

   /* Test case #6
Step 1. Go to "https://www.tempmailaddress.com/"
Step 2. Copy and save email as a string.
Step 3. Then go to “https://practice-cybertekschool.herokuapp.com”
Step 4. And click on “Sign Up For Mailing List".
Step 5. Enter any valid name.
Step 6. Enter email from the Step 2.
Step 7. Click Sign Up
Step 8. Verify that following message is displayed:
“Thank you for signing up. Click the button below to
return to the home page.”
Step 9. Navigate back to the “https://www.tempmailaddress.com/”
Step 10. Verify that you’ve received an email from “do-not-reply@practice.cybertekschool.com”
Step 11. Click on that email to open it.
Step 12. Verify that email is from: “do-not-reply@practice.cybertekschool.com”
Step 13. Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!”

    */
   @Test
    public void test6(){
      /* Step 1. Go to "https://www.tempmailaddress.com/"
       Step 2. Copy and save email as a string.*/
       driver.get("https://www.tempmailaddress.com/");
       String email=driver.findElement(By.xpath("//span[@id='email']")).getText();
       System.out.println(email);
     //  Step 3. Then go to “https://practice-cybertekschool.herokuapp.com”
      driver.get("https://practice-cybertekschool.herokuapp.com");
      //Step 4. And click on “Sign Up For Mailing List".
       driver.findElement(By.xpath("//a[@href=\"/sign_up\"]")).click();
       //Step 5. Enter any valid name.
       driver.findElement(By.name("full_name")).sendKeys(" Yemen Bayrak");
       //Step 6. Enter email from the Step 2.
       driver.findElement(By.name("email")).sendKeys(" acbd123@gmail.com");
       //Step 7. Click Sign Up
       driver.findElement(By.xpath("//button[@name=\"wooden_spoon\"]")).click();
       //Step 8. Verify that following message is displayed:
       //“Thank you for signing up. Click the button below to
      Assert.assertEquals(driver.findElement(By.name("signup_message")).getText(), "Thank you for signing up. Click the button below to return to the home page.");
       // Assert.assertTrue(driver.findElement(By.name("signup_message")).getText().equals("Thank you for signing up. Click the button below to return to the home page."));
       //return to the home page.”
       driver.findElement(By.xpath("(//a[@href='/'])[2]")).click();
       //Step 9. Navigate back to the “https://www.tempmailaddress.com/”
       driver.get("https://www.tempmailaddress.com/");
       //Step 10. Verify that you’ve received an email from “do-not-reply@practice.cybertekschool.com”

      /* driver.get("https://www.google.com/");
       driver.findElement(By.xpath("(//a[@class='gb_d'])[1]")).click();
       driver.findElement(By.xpath("//input[@class='gb_bf'][1]")).sendKeys("do-not-reply@practice.cybertekschool.com ");
       driver.findElement(By.xpath("//button[@aria-label='Search mail']/*[@focusable='false']")).click();*/

       //Step 11. Click on that email to open it.
       driver.findElement(By.xpath("//div[@id=':p0'] ")).click();
       //Step 12. Verify that email is from: “do-not-reply@practice.cybertekschool.com”
       Assert.assertEquals( driver.findElement(By.linkText("do-not-reply@practice.cybertekschool.com")).getText(),"do-not-reply@practice.cybertekschool.com");
       //Step 13. Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!”
      // Assert.assertTrue(driver.findElement(By.id("//h2[@id=':r2']")).getText().equals("Thanks for subscribing to practice.cybertekschool.com!"));
   }


   /* Test case #7
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 2. And click on “File Upload".
Step 3. Upload any file with .txt extension from your
computer.
Step 4. Click “Upload” button.
Step 5. Verify that subject is: “File Uploaded!”
Step 6. Verify that uploaded file name is displayed.
Note: use element.sendKeys(“/file/path”) with
specifying path to the file for uploading. Run this
method against “Choose File” button.

    */
   @Test
    public void test7(){
       //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
       driver.get("https://practice-cybertekschool.herokuapp.com");
       //Step 2. And click on “File Upload".
       driver.findElement(By.linkText("File Upload")).click();
       //Step 3. Upload any file with .txt extension from your computer.
       WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']")) ;
       upload.sendKeys("C:\\Users\\User\\Desktop\\uscis documents\\upload.txt");

       //Step 4. Click “Upload” button.
       driver.findElement(By.xpath("//input[@id='file-submit']")).click();
       //Step 5. Verify that subject is: “File Uploaded!”
       Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"File Uploaded!");
       //Step 6. Verify that uploaded file name is displayed.
      Assert.assertEquals(driver.findElement(By.xpath("//div[@id='uploaded-files']")).getText(), "upload.txt");
       //Note: use element.sendKeys(“/file/path”) with specifying path to the file for uploading. Run this
       //method against “Choose File” button.
   }
    /* Test case #8
        Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    Step 2. And click on “Autocomplete”.
    Step 3. Enter “United States of America” into
    country input box.
    Step 4. Verify that following message is displayed: “You selected: United States of America”
    Optional: If you want to to be a real selenium hero,use @DataProvider for for tests cases from 9 through 12.
    Please use following documentation: https://testng.org/doc/documentation-main.html#parameters-dataproviders

        */
    @Test
    public void test8(){
        //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //    Step 2. And click on “Autocomplete”.
        driver.findElement(By.xpath(" //a[@href='/autocomplete']")).click();
        //    Step 3. Enter “United States of America” into
        driver.findElement(By.xpath("//input[@id='myCountry']")).sendKeys("United States of America");


        //    country input box.
        driver.findElement(By.xpath(" //input[@type='button']")).click();
        //    Step 4. Verify that following message is displayed: “You selected: United States of America”
        Assert.assertEquals(driver.findElement(By.xpath(" //p[@id='result']")).getText(), "You selected: United States of America");

    }

   /*  Test case #9
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 2. And click on “Status Codes”.
Step 3. Then click on “200”.
Step 4. Verify that following message is displayed:“This page returned a 200 status code”
*/
   @Test
    public void test9(){
       //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
       driver.get("https://practice-cybertekschool.herokuapp.com");
       //Step 2. And click on “Status Codes”.
       driver.findElement(By.xpath(" //a[@href='/status_codes']")).click();
       //Step 3. Then click on “200”.
       driver.findElement(By.linkText("200")).click();
       //Step 4. Verify that following message is displayed:“This page returned a 200 status code”
       System.out.println(driver.findElement(By.xpath(" //p[contains(text(),'This page returned a 200 status code.')]")).getText()
               .contains("This page returned a 200 status code."));
   }
   /*
Test case #10
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 2. And click on “Status Codes”.
Step 3. Then click on “301”.
Step 4. Verify that following message is displayed:“This page returned a 301 status code”

    */
   @Test
    public void test10(){
       //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
       driver.get("https://practice-cybertekschool.herokuapp.com");
       //Step 2. And click on “Status Codes”.
       driver.findElement(By.xpath("//a[@href='/status_codes']")).click();
       //Step 3. Then click on “301”.
       driver.findElement(By.xpath("//a[@href='status_codes/301']")).click();
       //Step 4. Verify that following message is displayed:“This page returned a 301 status code”
       System.out.println(driver.findElement(By.xpath("//p")).getText().contains("This page returned a 301 status code."));

   }

   /* Test case #11
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 3. And click on “Status Codes”.
Step 4. Then click on “404”.
Step 5. Verify that following message is displayed:“This page returned a 404 status code”

    */
   @Test
    public void test11(){
       //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
       driver.get("https://practice-cybertekschool.herokuapp.com");
       //Step 3. And click on “Status Codes”.
       driver.findElement(By.linkText("Status Codes")).click();
       //Step 4. Then click on “404”.
       driver.findElement(By.linkText("404")).click();
       //Step 5. Verify that following message is displayed:“This page returned a 404 status code”
       System.out.println(driver.findElement(By.xpath("//p")).getText()
               .contains("This page returned a 404 status code."));

   }

   /* Test case #12
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 3. And click on “Status Codes”.
Step 4. Then click on “500”.
Step 5. Verify that following message is displayed:“This page returned a 500 status code”
    */
   @Test
    public void test12(){
       //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
       driver.get("https://practice-cybertekschool.herokuapp.com");
       //Step 3. And click on “Status Codes”.
       driver.findElement(By.linkText("Status Codes")).click();
       //Step 4. Then click on “500”.
       driver.findElement(By.xpath("//a[@href='status_codes/500']")).click();
       //Step 5. Verify that following message is displayed:“This page returned a 500 status code”.
       System.out.println(driver.findElement(By.xpath("//p")).getText().contains("This page returned a 500 status code."));
   }


}
