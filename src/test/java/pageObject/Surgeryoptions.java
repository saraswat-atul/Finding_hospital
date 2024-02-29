package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Surgeryoptions extends BasePage {

	public Surgeryoptions(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='product-tab__title'])[5]")
	WebElement surgeryoption;

	@FindBy(xpath = "//p[@data-qa-id=\"surgical-solution-ailment-name\"]")
	List<WebElement> surgerylist;

	public void Surgery() {
		surgeryoption.click();
	}

	List<String> surgeryName = new ArrayList<String>();

	public void Surgerylist() {
		for (int i = 0; i < 19; i++) {
			surgeryName.add(surgerylist.get(i).getText().split("\\n+")[0]);
		}
		System.out.println(surgeryName);
	}

}
