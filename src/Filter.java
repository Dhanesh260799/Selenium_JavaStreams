import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Strawberry");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> value=veggies.stream().map(s->s.getText()).collect(Collectors.toList());
		value.forEach(s->System.out.println(s));
		List<WebElement> filteredList=veggies.stream().filter(s->s.getText().contains("Strawberry")).collect(Collectors.toList());
		System.out.println(veggies.size());

		System.out.println(filteredList.size());
		
	}

}
