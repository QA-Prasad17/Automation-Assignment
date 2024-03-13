package PathalogyLabMgmt.pathlab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class updatedCode {
	

	public static void main(String[] args) throws InterruptedException {
		// Set Chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Grid\\\\chromedriver-win64\\\\chromedriver.exe");

		// Set Chrome options for incognito mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		// Initialize Chrome driver
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://gor-pathology.web.app/login");

		// Enter email and password
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234");

		// Click login button
		driver.findElement(By.xpath("//button/span[contains(text(),'Login')]")).click();
		Thread.sleep(3000);

		// Wait for Add Patient button to be clickable and click on it
		driver.findElement(By.xpath("//span[contains(text(),'Patients')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[1]/a[1]/button[1]/span[1]"))
		.click();
//		WebElement addPatientButton = wait.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("//button/span[contains(text(),'Add Patient')]")));
//		addPatientButton.click();

		// Add patient details
		driver.findElement(By.name("name")).sendKeys("TestPrasad145");
		driver.findElement(By.name("email")).sendKeys("testpr1@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9874563210");

		// Click on Save button
		driver.findElement(By.xpath("//span[@class='MuiButton-label jss105']")).click();
		
		driver.findElement(By.name("height")).sendKeys("157");
		driver.findElement(By.name("weight")).sendKeys("60");

		WebElement genderDropdown = driver.findElement(By.id("mui-component-select-gender"));
		genderDropdown.click();
		WebElement genderOption = driver.findElement(By.xpath("//*[@id=\"menu-gender\"]/div[3]/ul/li[2]"));
		genderOption.click();

		driver.findElement(By.name("age")).sendKeys("30");
		driver.findElement(By.name("systolic")).sendKeys("98");
		driver.findElement(By.name("diastolic")).sendKeys("45");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1500)");

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[2]"))
		    .click();

		WebElement discountDropdown = driver.findElement(By.xpath("//div[normalize-space()='None']"));
		discountDropdown.click();
		driver.findElement(By.xpath("//li[@data-value='5']")).click();

		WebElement doctorCommissionDropdown = driver.findElement(By.xpath("//div[@id='mui-component-select-doctor_commission']"));
		doctorCommissionDropdown.click();
		driver.findElement(By.xpath("//li[contains(@data-value,'10')]")).click();

		driver.findElement(By.xpath("//input[@name='doctor_name']")).click();
		driver.findElement(By.xpath("//li[contains(.,'Atharva Hiwase')]")).click();
		driver.findElement(By.xpath("//input[@id='patient-test']")).click();

		driver.findElement(By.xpath("//input[contains(@aria-controls,'patient-tests-labs-popup')]")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root jss336']")).click();

		Thread.sleep(2000); // This seems to be intentional, so kept it
		driver.findElement(By.xpath("//div[@aria-label='Eqipment Name']")).click();
		driver.findElement(By.xpath("//li[contains(.,'test')]"));
		driver.findElement(By.xpath("//input[contains(@aria-label,'Required')]")).sendKeys("2");
		driver.findElement(By.xpath("//button[contains(.,'check')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Add Patient')]")).click();
		

	}

}
