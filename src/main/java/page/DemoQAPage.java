package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;


public class DemoQAPage {

    private WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(css = ".custom-control-label")
    private List<WebElement> maleGender;

    @FindBy(id = "userNumber")
    private WebElement phoneNumber;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirth;

    @FindBy(css = ".react-datepicker__month-select")
    private Select month;

    @FindBy(xpath = "//label[@class='custom-control-label']")
    private List<WebElement> hobbies;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(css = "input[type=file]")
    private WebElement fileInput;

    File file = new File("resources/Screenshot.png");

    public DemoQAPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillFirstName(String firstName){
        this.firstNameField.sendKeys(firstName);
    }

    public void fillLastName(String lastName){
        this.lastNameField.sendKeys(lastName);
    }

    public void fillEmail(String email){
        this.email.sendKeys(email);
    }

    public void selectGender(){
        this.maleGender.get(0).click();
    }

    public void fillPhoneNumber(String number) {
        this.phoneNumber.sendKeys(number);
    }

    public void selectDateOfBirth(){
        this.dateOfBirth.click();
        this.month.deselectByVisibleText("MAY");
    }

    public void selectHobbies() {
        this.hobbies.get(3).click();
    }

    public void uploadFile() throws InterruptedException {
        fileInput.sendKeys(file.getAbsolutePath());
        //adicionar teste separado depois
    }
}
