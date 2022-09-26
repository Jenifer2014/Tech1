package Pavan_interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommand {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32_101 Version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://watchrepairco.com/");
        driver.manage().window().maximize();
		
        String title=driver.getTitle();
        System.out.println("Title of the Page:"+title);
        
        String url= driver.getCurrentUrl();
        System.out.println("URL of the Page:"+url);
        
       String pagesource=driver.getPageSource();
        System.out.println("Page source:"+pagesource);
	}

}
