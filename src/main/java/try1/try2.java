package try1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class try2 {

	public static void main(String[] args) throws Throwable {
		WebDriver Driver =new ChromeDriver();
		Driver.get("http://empirehome.myprojectsonline.co.in");
		Driver.manage().window().maximize();
		Driver.findElement(By.className("form-control")).sendKeys("sureshbabuemp@gmail.com");
		Driver.findElement(By.id("pword")).sendKeys("ZPMHQHIA");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).click();

	}

}
