package week2.Assignments;

import java.io.File;

import javax.xml.transform.Source;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	private static final File Source = null;

	public static void main(String[] args) throws InterruptedException  {
		// Step 1: Download and set the path 
				WebDriverManager.chromedriver().setup();
				
				// Step 2: Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();	
				
				// Step 3: Load the URL http://leaftaps.com/opentaps/control/main
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				// Step 4: Maximise the window
				driver.manage().window().maximize();
				
				//	Enter the username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
				//	Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				// Click Login
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//	Click crm/sfa link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//	Click Leads link
				driver.findElement(By.linkText("Leads")).click();
				
				//	Click Find leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				//	Enter first name
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("abc");
				
				//	Click Find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(5000);
				
				// Click on first resulting lead
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
				
				// Verify title of the 
				System.out.println(driver.getTitle());
				
				// Click Edit
				driver.findElement(By.linkText("Edit")).click();
				
				// Change the company name
				driver.findElement(By.id("updateLeadForm_companyName")).clear();
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Sudha");
				
				// Click Update
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
				// Confirm the changed name appears
				driver.findElement(By.linkText("Find Leads")).click();
				
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sudha");
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
											
				System.out.println("Company name changed");
				
				// Close the browser (Do not log out)
				driver.close();

			}


	}


