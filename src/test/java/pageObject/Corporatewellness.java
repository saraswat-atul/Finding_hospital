package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Corporatewellness extends BasePage {

	public Corporatewellness(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"__next\"]/main/div/div[1]/div/div[3]/div/div[3]/div[1]/span/span[2]")
	WebElement Forcorporateoption;

	@FindBy(xpath = "//*[@id=\"__next\"]/main/div/div[1]/div/div[3]/div/div[3]/div[1]/span/div/div[1]/a")
	WebElement Healthwellnessplan;

	@FindBy(xpath = "//input[@id='name']")
	WebElement Name1;

	@FindBy(xpath = "(//input[@id='organizationName'])[1]")
	WebElement Organization;

	@FindBy(xpath = "(//input[@id='contactNumber'])[1]")
	WebElement Contact;

	@FindBy(xpath = "(//input[@id='officialEmailId'])[1]")
	WebElement Official;

	@FindBy(xpath = "(//*[@id=\"organizationSize\"])[1]")
	WebElement Organizationsize;

	@FindBy(xpath = ("//*[@id=\"organizationSize\"]/option[6]"))
	WebElement morethanlakh;

	@FindBy(xpath = ("(//*[@id=\"interestedIn\"])[1]"))
	WebElement interested;

	@FindBy(xpath = "(//*[@id=\"interestedIn\"]/option[2])[1]")
	WebElement demo;

	@FindBy(xpath = "//*[@id='header']/div[2]/div/form/button")
	WebElement demoButton;

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/form/button")
	WebElement thanksmsg;

	public void Forcorporates() {
		Forcorporateoption.click();
	}

	public void Healthplan() {
		Healthwellnessplan.click();
	}

	public WebElement Name() {
		return Name1;
	}

	public WebElement Organizationname() {
		return Organization;
	}

	public WebElement Contactno() {
		return Contact;
	}

	public WebElement Officialemail() {
		return Official;
	}

	public void Organizationsize() {
		Organizationsize.click();
	}

	public void Sizenumber() {
		morethanlakh.click();
	}

	public void Interestedin() {
		interested.click();
	}

	public void Clickdemo() {
		demo.click();
	}

	public void Scheduleademo() {
		thanksmsg.click();
	}

	public void Validatebutton() {
		Assert.assertFalse(demoButton.isEnabled());
	}

}
