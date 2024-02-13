package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.DemoQAPage;

class FormPageTest extends BaseTest{

    @Test
    public void getTitleTest() {
        Assert.assertEquals("DEMOQA", BaseTest.driver.getTitle());
    }

    @Test
    public void fillForm() throws InterruptedException {
        DemoQAPage demoPage = new DemoQAPage(driver);
        demoPage.fillFirstName("John");
        demoPage.fillLastName("Doe");
        demoPage.fillEmail("email@email.com");
        demoPage.selectGender();
        demoPage.fillPhoneNumber("1234567890");
        demoPage.uploadFile();
    }
}