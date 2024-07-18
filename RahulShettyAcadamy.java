package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RahulShettyAcadamy {

	WebDriver driver;

    @BeforeClass
    public void setup() {
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
       WebDriverManager.chromedriver().setup();
		
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @Test(groups = {"Checkbox"})
    public void testSingleCheckbox() {
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
        checkbox1.click();
//        Assert.assertTrue(checkbox1.isSelected());
    }

    @Test(groups = {"Checkbox"})
    public void testMultipleCheckboxes() {
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
        WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
        WebElement checkbox3 = driver.findElement(By.id("checkBoxOption3"));
        checkbox1.click();
        checkbox2.click();
        checkbox3.click();
//        Assert.assertTrue(checkbox1.isSelected());
//        Assert.assertTrue(checkbox2.isSelected());
//        Assert.assertTrue(checkbox3.isSelected());
    }

    @Test(groups = {"RadioButton"}, priority = 1)
    public void testSingleRadioButton() {
        WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        radioButton1.click();
       // Assert.assertTrue(radioButton1.isSelected());
    }

    @Test(groups = {"RadioButton"}, dependsOnMethods = {"testSingleRadioButton"})
    public void testMultipleRadioButtons() {
        WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='radio3']"));
        radioButton2.click();
//        Assert.assertFalse(radioButton1.isSelected());
//        Assert.assertTrue(radioButton2.isSelected());
//        Assert.assertFalse(radioButton3.isSelected());
    }

    @AfterClass
    public void af() {
    	driver.close();
        
    }
}
