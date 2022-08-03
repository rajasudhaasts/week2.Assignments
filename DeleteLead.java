package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		
			//8	Click on Phone
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[2]")).click();
		
			//9	Enter phone number
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
		driver.findElement(By.name("phoneNumber")).sendKeys("7339313604");
		
			//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
			//11	Capture lead ID of First Resulting lead
		String id = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a"))
				.getText();
		System.out.println("ID: " +id);
		
			//12	Click First Resulting lead
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a")).click();
		
			//13	Click 
		driver.findElement(By.linkText("Delete")).click();
		
			//14	Click Find leads
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//8	Click on Phone
	driver.findElement(By.xpath("(//a[@class='x-tab-right'])[2]")).click();
	
		//9	Enter phone number
	driver.findElement(By.name("phoneCountryCode")).clear();
	driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
	driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
	driver.findElement(By.name("phoneNumber")).sendKeys("7339313604");
	
		//10	Click find leads button
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
			//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	String delete = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	System.out.println("text is : " + delete);
	if(delete.equals("No records to display"))
		System.out.println("Record deleted successfully");
	else
		System.out.println("record is still present");
	
			//18	Close the browser (Do not log out)
	driver.close();

	}

}
