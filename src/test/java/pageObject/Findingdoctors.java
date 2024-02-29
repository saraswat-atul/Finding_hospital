package pageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Helper;

public class Findingdoctors extends BasePage {

	public Findingdoctors(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input")
	WebElement citysearchBox;

	@FindBy(xpath = "//*[@id=\"c-omni-container\"]/div/div[1]/div[2]/div[2]/div[1]/span[1]")
	WebElement banglore;

	@FindBy(xpath = "//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input")
	WebElement diseaseSearchBox;

	@FindBy(xpath = "//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[1]")
	WebElement cardiologistOption;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[2]/span/span/span")
	WebElement patientStories;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[2]/ul/li[1]/span")
	WebElement years;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[3]")
	WebElement experienceBox;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[3]/ul/li[1]/span")
	WebElement experienceofyears;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[4]/span/span")
	WebElement allfilterOption;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[2]/div/div[2]/div/label[1]/span")
	WebElement zerotofivehundred;

	@FindBy(xpath = "//*[@data-qa-id='Available Today_label']")
	WebElement availabletoday;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[5]/div/div/div/span")
	WebElement relavanceoptions;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[5]/div/div/div/ul/li[2]/span")
	WebElement hightolow;

	@FindBy(xpath = "//div[@data-qa-id='doctor_card']//div[@class='info-section']")
	public List<WebElement> doctorInfoCard;

	public WebElement Selectcity() {
		return citysearchBox;
	}

	public void Selectcitypath() {
		banglore.click();
	}

	public WebElement Selectdisease() {
		return diseaseSearchBox;

	}

	public void Selectcardiologist() {
		cardiologistOption.click();
	}

	public void Patient() {
		patientStories.click();
	}

	public void Clickonstory() {
		years.click();
	}

	public void Experiencebox() {
		experienceBox.click();
	}

	public void Experience2() {
		experienceofyears.click();
	}

	public void Allfilters() {
		allfilterOption.click();
	}

	public void Selectfee() {
		zerotofivehundred.click();

	}

	public void Availability() {
		availabletoday.click();
	}

	public void Relavance() {
		relavanceoptions.click();
	}

	public void Range() {
		hightolow.click();
	}

	List<String> doctorName = new ArrayList<String>();
	List<String> doctorSpecialization = new ArrayList<String>();
	List<String> doctorExperience = new ArrayList<String>();
	List<String> doctorLocation = new ArrayList<String>();
	List<String> doctorFee = new ArrayList<String>();

	public void Displaydoctordetails() {
		for (int i = 0; i < 5; i++) {
			WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(20));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(doctorInfoCard.get(i))));
			doctorName.add(doctorInfoCard.get(i).getText().split("\\n+")[0]);
			doctorSpecialization.add(doctorInfoCard.get(i).getText().split("\\n+")[1]);
			doctorExperience.add(doctorInfoCard.get(i).getText().split("\\n+")[2]);
			doctorLocation.add(doctorInfoCard.get(i).getText().split("\\n+")[3]);
			doctorFee.add(doctorInfoCard.get(i).getText().split("\\n+")[4]);
		}
		System.out.println(doctorName);
		System.out.println(doctorSpecialization);
		System.out.println(doctorExperience);
		System.out.println(doctorLocation);
		System.out.println(doctorInfoCard);

	}

}
