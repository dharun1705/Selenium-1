package week4.day3.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	
	//EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.name("phoneNumber")).sendKeys("6456474534");
	driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	
	String text = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).getText();
	System.out.println("Lead ID of first lead: " + text);
	
	
	
	
	
	
}
}
