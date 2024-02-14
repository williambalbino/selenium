package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DemoQAPage {

    private WebDriver driver;

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "phone")
    private WebElement phoneNumber;

    @FindBy(id = "subject")
    private WebElement subject;

    @FindBy(id = "description")
    private WebElement message;

    @FindBy(css = ".col-sm-5 > div > p")
    private List<WebElement> successSubject;

//    @FindBy(css = "input[type=file]")
//    private WebElement fileInput;
//    File file = new File("resources/Screenshot.png");

    @FindBy(id = "submitContact")
    private WebElement submitBtn;


    public DemoQAPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillFirstName(String firstName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(nameField));
        this.nameField.sendKeys(firstName);
    }

    public void fillEmail(String email){
        this.email.sendKeys(email);
    }

    public void fillPhoneNumber(String number) {
        this.phoneNumber.sendKeys(number);
    }

    public void fillSubject(String subject){
        this.subject.sendKeys(subject);
    }

    public void fillMessage(String message) {
        this.message.sendKeys(message);
    }

//    public void uploadFile() throws InterruptedException {
//        fileInput.sendKeys(file.getAbsolutePath());
//        //adicionar teste separado depois
//    }

    public void submitForm() {
        this.submitBtn.click();
    }

    public String getSuccessSubject(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return this.successSubject.get(1).getText();
    }
}
