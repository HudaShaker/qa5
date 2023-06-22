package qa5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) {
		
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://127.0.0.1:5500/index.html");
	List<WebElement> text = driver.findElements(By.className("ccc"));
	for(int i=0; i<text.size(); i++) {
		String element= text.get(i).getText();
		System.out.println(element);
	}
	
	
		
		

	}

}
