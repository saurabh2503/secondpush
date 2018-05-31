package selenium_test;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.WindowMaximize;

public class test1 {

	
		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.gecko.driver", "F:\\Work_test\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.trivago.in");
			
			Thread.sleep(2000);
			WebElement wb=driver.findElement(By.xpath("//*[@id='horus-querytext']"));
			wb.sendKeys("dehradun");
			Thread.sleep(4000);

			driver.findElement(By.xpath("//*[@id='suggestion-515677002']/div/span[1]")).click();
			driver.findElement(By.xpath("//*[@datetime='2018-06-01']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@datetime='2018-06-03']")).click();
			driver.findElement(By.xpath("//*[@role='menu']/li[3]/button")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//*[@id='select-num-adults-1']")).click();
			
			driver.findElement(By.xpath("//*[@id='select-num-adults-1']/option[4]")).click();
			driver.manage().window().maximize();
			Thread.sleep(200);
			driver.findElement(By.xpath("//*[@id='dealform_extRooms']/div[2]/button[2]")).click();
			
			System.out.println("sau");
			
			
			
	}

}
