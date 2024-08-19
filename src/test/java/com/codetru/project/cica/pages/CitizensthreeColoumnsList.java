package com.codetru.project.cica.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class CitizensthreeColoumnsList {
	
	public static List<String> column1Texts;
	public static List<String> column3Texts;
	
    public static void main(String[] args) throws InterruptedException, IOException {
        // Setup ChromeDriver using WebDriverManager
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        // options.addArguments("--headless") ;
        WebDriver driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://cicaamericaqa.citizensinc.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
 
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        username.sendKeys("7250883");
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        password.sendKeys("RockStar_K8");
        WebElement submit = driver.findElement(By.xpath("//ion-button[@type='submit']"));
        submit.click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//ion-col[@class='ion-text-right md hydrated']//ion-button[@class='ion-color ion-color-dark md button button-clear ion-activatable ion-focusable hydrated']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ion-item[normalize-space()='Licenses & Appointments']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
        Thread.sleep(2000);
 
        List<WebElement> column1Elements = driver.findElements(By.xpath("//th[normalize-space()='License State']/following::tbody/tr/td[6]")); // Adjust the XPath to your table structure
        List<WebElement> column3Elements = driver.findElements(By.xpath("//th[normalize-space()='License State']/following::tbody/tr/td[10]")); // Adjust the XPath to your table structure
        column1Texts = extractTextFromElements(driver, column1Elements);
        column3Texts = extractTextFromElements(driver, column3Elements);
 
        // Remove elements containing "FL"
        removeFLAndCorresponding(column1Texts, column3Texts);
 
        // Remove duplicate elements from both lists
        removeDuplicates(column1Texts, column3Texts);
 
        // Convert lists to arrays if needed
        String[] column1Array = column1Texts.toArray(new String[0]);
        String[] column3Array = column3Texts.toArray(new String[0]);
 
        // Print the texts from both columns
        System.out.println("License State texts: " + column1Texts);
        System.out.println("Appointment Status texts: " + column3Texts);
 
        // Print the count of elements in each array
        System.out.println("Count of License State texts: " + column1Array.length);
        System.out.println("Count of Appointment Status texts: " + column3Array.length);
 
        // Close the WebDriver
//        driver.quit();
    }
 
    private static List<String> extractTextFromElements(WebDriver driver, List<WebElement> elements) {
        List<String> texts = new ArrayList<>();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (WebElement element : elements) {
            String text = (String) js.executeScript("return arguments[0].textContent;", element);
            texts.add(text.trim());
        }
        return texts;
    }
 
    private static void removeFLAndCorresponding(List<String> list1, List<String> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).contains("FL")) {
                list1.remove(i);
                list2.remove(i);
                i--; // Adjust index after removal
            }
        }
    }
 
    private static void removeDuplicates(List<String> list1, List<String> list2) {
        List<String> tempList1 = new ArrayList<>(list1);
        List<String> tempList2 = new ArrayList<>(list2);
        for (int i = 0; i < tempList1.size(); i++) {
            String element1 = tempList1.get(i);
            for (int j = i + 1; j < tempList1.size(); j++) {
                if (element1.equals(tempList1.get(j))) {
                    list1.remove(j);
                    list2.remove(j);
                    tempList1.remove(j); // Also remove from tempList1 to keep indices correct
                    tempList2.remove(j); // Also remove from tempList2 to keep indices correct
                    j--; // Adjust index after removal
                }
            }
        }
    }
}