package com.sele;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jianchapipei {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    String baseUrl = "http://103.120.226.190/selenium-demo/git-repo";
	    driver.get(baseUrl);
	    
	    
	    File excelFile = new File("D:\\关于专业\\软件测试\\实验2\\Selenium+Lab2020.xlsx");
	    InputStream inp = new FileInputStream(excelFile);  
        XSSFWorkbook workbook = new XSSFWorkbook(inp);  
        XSSFSheet sheet = workbook.getSheetAt(0);
        for(int i=0;i<=19;i++) {
        	Row row = sheet.getRow(i);
        	WebElement userName = driver.findElement(By.name("user_number"));
     		userName.sendKeys(row.getCell(1).getStringCellValue());
     		WebElement passName = driver.findElement(By.name("password"));
     		passName.sendKeys(row.getCell(2).getStringCellValue());
     		
     		WebElement submitName = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[3]/input"));
     		submitName.click();
     		
     		WebElement textShow = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code"));
     		if(textShow.getText().equals(row.getCell(2).getStringCellValue())) {
     			System.out.println("Success!");
     		}else {
     			System.out.println("Failed!");
     		}
        	
        }
        driver.close();
	    
	}
	
}
