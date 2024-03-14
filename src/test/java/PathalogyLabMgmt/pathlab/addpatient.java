package PathalogyLabMgmt.pathlab;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import PathalogyLabMgmt.pageobject.LandingPage;

public class addpatient {

	@Test
	public void AddPatientProcess() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\PrasadProject\\target\\chromedriver.exe");
		ChromeOptions inco = new ChromeOptions();
		inco.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(inco);
		driver.manage().window().maximize();
		driver.get("https://gor-pathology.web.app/");
		// LandingPage landingpage = new LandingPage(driver);
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234");
		String tl = driver.getTitle();
		System.out.println(tl);
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Patients')]")).click();

		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[1]/a[1]/button[1]/span[1]"))
				.click();

		// Add new patient
		driver.findElement(By.name("name")).sendKeys("TestPrasad145");
		driver.findElement(By.name("email")).sendKeys("testpr1@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9874563210");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]/span[1]"))
				.click();

		// Add Patient details
		driver.findElement(By.name("height")).sendKeys("157");
		driver.findElement(By.name("weight")).sendKeys("60");

		WebElement dropdown = driver.findElement(By.id("mui-component-select-gender"));
		dropdown.click();
		WebElement Option = driver.findElement(By.xpath("//*[@id=\"menu-gender\"]/div[3]/ul/li[2]"));
		Option.click();
		driver.findElement(By.name("age")).sendKeys("30");
		driver.findElement(By.name("systolic")).sendKeys("98");
		driver.findElement(By.name("diastolic")).sendKeys("45");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[2]"))
				.click();
		Thread.sleep(2000);

		// Find the input field for the dropdown
		WebElement patientTest = driver.findElement(By.id("patient-test"));
		patientTest.click(); // Click on the input field to activate it

		// Wait for the dropdown options to appear (if applicable)
		// Replace the following line with appropriate waiting logic if necessary
		Thread.sleep(2000); // Example: Wait for 2 seconds

		// Find and click on the checkbox element
		WebElement checkbox = driver
				.findElement(By.xpath("//li[contains(.,'check_box_outline_blankAFP (ALPHA FETO PROTEINS)350₹')]"));
		checkbox.click(); // Click on the checkbox to select it

		// Find the input field for the dropdown

		// span[contains(.,'HEALTHCARE PATHOLOGY (Sion) - AFP (ALPHA FETO PROTEINS)')]
		WebElement dis = driver.findElement(By.xpath("//div[normalize-space()='None']"));
		dis.click();
		driver.findElement(By.xpath("//li[@data-value='5']")).click();
		// span[contains(text(),'HEALTHCARE PATHOLOGY (Sion) - AFP (ALPHA FETO PROT')]

		// Open the doctors name dropdown
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMillis(10));
		WebElement doctorname = driver.findElement(By.xpath("//input[@name='doctor_name']"));
		doctorname.sendKeys("Atharva Hiwase");
		doctorname.sendKeys(Keys.ENTER);

		WebElement doctorcommission = driver
				.findElement(By.xpath("//div[@id='mui-component-select-doctor_commission']"));
		doctorcommission.click();
		driver.findElement(By.xpath("//li[contains(@data-value,'10')]")).click();

		WebElement labRec = driver.findElement(By.id("patient-tests-labs"));
		labRec.click(); // Click on the input field to activate it
		Thread.sleep(2000);
		labRec.sendKeys("HEALTHCARE PATHOLOGY (Sion) - AFP (ALPHA FETO PROTEIN");
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.ARROW_DOWN).perform();
		// Optionally, you can press ENTER to select the suggestion
		actions1.sendKeys(Keys.ENTER).perform();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(2000);
		WebElement plusIcon = driver.findElement(By.xpath("//span[@class='material-icons MuiIcon-root']"));
		js1.executeScript("arguments[0].click();", plusIcon);

		WebElement dropdownButton = driver.findElement(By.xpath("//div[@aria-label='Eqipment Name']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(dropdownButton).perform();
		WebElement Enoption = driver.findElement(By.xpath("//li[contains(text(),'injection')]"));

		// Click on the option to select it
		Enoption.click();
		WebElement check = driver.findElement(By.xpath("//span[contains(text(),'check')]"));
		check.click();
		driver.findElement(By.xpath("//span[contains(.,'Add Patient')]")).click();
	}

}
