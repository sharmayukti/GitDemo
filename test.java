import org.openqa.selenium.WebDriver;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		//create driver object
		//invoke .exe file first.
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mbhar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.google.com");
	}

}
