import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://telugu.greatandhra.com");

		
		String dateTime = new Date().toString().replace(":", "_").replace(" ", "_");
		String fileName = "Error At " + dateTime;
		String newFile = ".//screenprints/" + fileName + ".jpg";
		System.out.println("New File Name is : "+newFile);
		System.out.println("URL is  "+driver.getCurrentUrl()+" Title is "+driver.getTitle());
		/*File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(newFile));
		} catch (IOException e) {
			System.err.println(e.getMessage());
			driver.quit();
		}*/
		driver.quit();
		}
	}
