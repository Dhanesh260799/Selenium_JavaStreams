import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Perform web table sorting using Selenium java Streams
		
		//condition to perform
		//1. click on column
		//2.capture all webelements into list
		//3.capture text of all webelements into new(original) list
		//sort on the original list of step 3 -> Sorted list
		// compare original list vs sorted list
		
		driver.findElement(By.xpath("//tr/th[1]")).click();// step 1
		List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));//step 2
		List<String> originalList =  elementList.stream().map(s->s.getText()).collect(Collectors.toList());//step 3
		List<String> sortedList =  originalList.stream().sorted().collect(Collectors.toList());
	
		System.out.println(sortedList);
		System.out.println(originalList);


	}

}
