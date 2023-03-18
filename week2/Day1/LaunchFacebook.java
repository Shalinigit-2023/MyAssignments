package week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.close();
	}

}
