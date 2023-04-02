package week4.day3.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {
public static void main(String[] args) {
	
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Hari");
}
}
