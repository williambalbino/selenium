package tests;

import data.Message;
import data.MessageDataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DemoQAPage;

class FormPageTest extends BaseTest{

    @Test
    public void fillForm()  {

        Message validMessage = MessageDataFactory.createMessage();
        DemoQAPage demoPage = new DemoQAPage(driver);

        demoPage.fillFirstName(validMessage.getName());
        demoPage.fillEmail(validMessage.getEmail());
        demoPage.fillPhoneNumber(validMessage.getPhoneNumber());
        demoPage.fillSubject(validMessage.getSubject());
        demoPage.fillMessage(validMessage.getMessage());
        demoPage.submitForm();

        Assert.assertEquals(demoPage.getSuccessSubject(), validMessage.getSubject());
    }
}