package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
				WebDriverManager.chromedriver().setup();
				
				// Step 2: Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();	
				
				// Step 3: Load the URL https://en-gb.facebook.com/
				driver.get("https://en-gb.facebook.com/");
				
				// Step 4: Maximise the window
				driver.manage().window().maximize();
				
				// Step 5: Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// Step 6: Click on Create New Account button
				driver.findElement(By.linkText("Create New Account")).click();
				
				// Step 7: Enter the first name
				driver.findElement(By.name("firstname")).sendKeys("Rajasudha");
						
				// Step 8: Enter the last name
				driver.findElement(By.name("lastname")).sendKeys("A");
				
				
				// Step 9: Enter the mobile number
				driver.findElement(By.name("reg_email__")).sendKeys("merciyal@gmail.com");		
				
				// Step 10: Enter the password
				driver.findElement(By.name("reg_passwd__")).sendKeys("Sudha");
				
				// Step 11: Handle all the three drop downs
				WebElement bday = driver.findElement(By.id("day")); 
				new Select(bday).selectByValue("10");
				WebElement birthdaymonth = driver.findElement(By.id("month")); 
				new Select(birthdaymonth).selectByVisibleText("Jun"); 
				//WebElement bmonth = driver.findElement(By.id("month")); 
				//new Select(bmonth).selectByValue("Jun");
				WebElement byear = driver.findElement(By.id("year")); 
				new Select(byear).selectByValue("1994");		
				
				
				// Step 12: Select the radio button "Female" 
				driver.findElement(By.xpath("//label[text()='Female']")).click();
				
				System.out.println("Completed");

			}

		

	}


