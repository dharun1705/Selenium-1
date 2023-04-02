package week4.day3.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
public static void main(String[] args) {
	
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Hari");
	driver.findElement(By.id("lastNameField")).sendKeys("haran");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("HARI");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("HARAN");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Private Sector");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
	
	WebElement place = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select state = new Select(place);
	state.selectByVisibleText("New York");
	
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Private Sector");
	driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
		
}
}
