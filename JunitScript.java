package Test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitScript {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @Test
    public void testSingleCheckbox() {
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
        checkbox1.click();
        
    }

    @Test
    public void testMultipleCheckboxes() {
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
        WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
        WebElement checkbox3 = driver.findElement(By.id("checkBoxOption3"));
        checkbox1.click();
        checkbox2.click();
        checkbox3.click();
       
    }

    @Test
    public void testSingleRadioButton() {
        WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        radioButton1.click();
       
    }

    @Test
    public void testMultipleRadioButtons() {
        WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='radio3']"));
        radioButton2.click();
        
    }

    @After
    public void af() {
        driver.quit();
    }
}

