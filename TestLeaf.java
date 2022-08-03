package week2.Assignments;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Download and set the path 
				WebDriverManager.chromedriver().setup();
				
				// Step 2: Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();	
				
				// Step 3: Load the URL http://leaftaps.com/opentaps/control/main
				driver.get("https://leafground.com/");
				
				// Step 4: Maximise the window
				driver.manage().window().maximize();
				
				//Edit
				/*driver.findElement(By.xpath("//h5[text()='Edit']")).click();
				driver.findElement(By.id("email")).sendKeys("merciyal@gmail.com");
				driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("text");
				driver.findElement(By.xpath("//input[@name='username']")).clear();
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sudha");
				driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
				String confirmThatEdit = driver.findElement(By.xpath("//input[@disabled='true']")).getAttribute("disabled");
				System.out.println("Textbox disabled" +confirmThatEdit);*/
				
				//Button
				/*driver.findElement(By.xpath("//h5[text()='Button']")).click();
				driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
				driver.findElement(By.xpath("//h5[text()='Button']")).click();
				WebElement element = driver.findElement(By.id("position"));
				Point location = element.getLocation();
				int xcord = location.getX();
				System.out.println("Position of the webelement from left side is "+xcord +" pixels");
				int ycord = location.getY();
				System.out.println("Position of the webelement from top side is "+ycord +" pixels");
			    
					
					String buttonColor = driver.findElement(By.id("color")).getCssValue("background-color");
			        String buttonTextColor = driver.findElement(By.id("color")).getCssValue("color");
			        System.out.println("Button color: " + buttonColor);
			        System.out.println("Text color " + buttonTextColor);
					
					
					WebElement button = driver.findElement(By.id("size"));
			        Dimension size = button.getSize();
			        System.out.println("Size is " +size);*/
				
				
				//Link
						
				//driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
				/*driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[3]")).click();
				
				String url="";
			     java.util.List<WebElement> allURLs = driver.findElements(By.tagName("a"));
			      System.out.println("Total links on the Wb Page: " + allURLs.size());
			      
			      String brokenLink =driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).getAttribute("href");
					driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
					Thread.sleep(700);
					String title = driver.getTitle();
					if(title.contains("404")) {
						System.out.println("The  broken link is " + brokenLink);*/
				
				//Image
				/*driver.findElement(By.xpath("//h5[text()='Image']")).click();
				driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
				Thread.sleep(700);
			
				driver.findElement(By.xpath("//h5[text()='Image']/following-sibling::img")).click();


				String link = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getAttribute("src");
				driver.get(link);
				String title = driver.getTitle();
				if(title.contains("404")) {
					System.out.println("The image " + link + " is broken");*/
				
				//DropDown
				/*driver.findElement(By.xpath("//h5[text()='Drop down']")).click();
				WebElement selectTrainingProgram = driver.findElement(By.xpath("//div[@class='example']//select")); 
				new Select(selectTrainingProgram).selectByIndex(1); 
				
				WebElement dropdown = driver.findElement(By.name("dropdown2")); 
				new Select(dropdown).selectByVisibleText("Appium"); 
				
				WebElement dropdown1 = driver.findElement(By.id("dropdown3")); 
				new Select(dropdown1).selectByValue("Loadrunner"); 
				
				Select se = new Select(driver.findElement(By.className("dropdown")));

				List<WebElement> l = se.getOptions();
				System.out.println("Size: " +l.size());*/
				
				
				//Radio Button:
				/*driver.findElement(By.xpath("//h5[text()='Radio Button']")).click();
				driver.findElement(By.id("no")).click();
				driver.findElement(By.xpath("//input[@name='news']")).click();
				driver.findElement(By.xpath("(//input[@name='age'])[3]")).click();*/
			
				
				//Checkbox
				driver.findElement(By.xpath("//h5[text()='Checkbox']")).click();
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				String confirmSeleniumIs = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).getAttribute("checked");
				System.out.println("Checked" +confirmSeleniumIs);
		
				driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).clear();
				
				  List <WebElement> AllCheckboxes =  driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']"));
				    
				    int size = AllCheckboxes.size();
				    System.out.println(size);
				    
				    
				    for(int i = 0; i<size; i++) {
				        
				        AllCheckboxes.get(i).click();
	
	
	}

			     
				
	}
	
	
	}
	
	
	
	


