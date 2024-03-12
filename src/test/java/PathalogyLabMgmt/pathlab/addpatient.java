package PathalogyLabMgmt.pathlab;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import PathalogyLabMgmt.pageobject.LandingPage;

public class addpatient {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Grid\\chromedriver-win64\\chromedriver.exe");
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

		// select option from left menubar
		// driver.findElement(By.xpath("//span[normalize-space()='Tests']")).click();
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div[2]/div/div/div/div[2]/ul/a[4]/div/div[2]/span"))
		// .click();
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

		// Test cost calculator

		WebElement dis = driver.findElement(By.xpath("//div[normalize-space()='None']"));
		dis.click();
		driver.findElement(By.xpath("//li[@data-value='5']")).click();
		WebElement doccom = driver.findElement(By.xpath("//div[@id='mui-component-select-doctor_commission']"));
		doccom.click();
		driver.findElement(By.xpath("//li[contains(@data-value,'10')]")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'mui-57549')]")).click();
		driver.findElement(By.xpath("//input[@name='doctor_name']")).click();
		driver.findElement(By.xpath("//li[contains(.,'Atharva Hiwase')]")).click();
		driver.findElement(By.xpath("//input[@id='patient-test']")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root jss269']"));

		driver.findElement(By.xpath("//input[contains(@aria-controls,'patient-tests-labs-popup')]")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root jss336']")).click();
		driver.findElement(By.xpath("//span[@class='material-icons MuiIcon-root']"));

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Eqipment Name']")).click();
		driver.findElement(By.xpath("//li[contains(.,'test')]"));
		driver.findElement(By.xpath("//input[contains(@aria-label,'Required')]")).sendKeys("2");
		driver.findElement(By.xpath("//button[contains(.,'check')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Add Patient')]")).click();

	}

}
