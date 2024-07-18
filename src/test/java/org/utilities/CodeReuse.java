package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodeReuse {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static TargetLocator tl;
	public static Select s;
	public static JavascriptExecutor js;
	public static FluentWait<WebDriver> wait;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	

	public static void url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void valuePass(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void getTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

	public static String getUrl() {
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		return pageUrl;
	}

	public static void windowId() {
		String id = driver.getWindowHandle();
		System.out.println("The id is " + id);
	}

	public static void windowsId() {
		String parID = driver.getWindowHandle();
		Set<String> winID1 = driver.getWindowHandles();
		List<String> li = new LinkedList<String>();
		li.addAll(winID1);
		for (String id : li) {
			if (!id.equals(parID)) {
				driver.switchTo().window(id);
			}

		}

	}

	public static void clickButton(WebElement ele) {
		ele.click();
	}

	public static void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	}

	public static void mouseOver(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	public static void toDrag(WebElement ele1, WebElement ele2) {
		a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}

	public static void doubleClcik(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	public static void rightClick(WebElement ele) {
		a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	public static void pressTab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void pressEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toCopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void toCut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	public static void toPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void pressOk() {
		tl = (TargetLocator) driver;
		driver.switchTo().alert().accept();
	}

	public static void pressCancel() {
		tl = (TargetLocator) driver;
		driver.switchTo().alert().dismiss();
	}

	public static void passAlertValue(String value) {
		tl = (TargetLocator) driver;
		driver.switchTo().alert().sendKeys(value);

		tl = (TargetLocator) driver;
		driver.switchTo().alert().accept();
	}

	public static void selectByindex(WebElement ele, Integer index) {
		s = new Select(ele);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement ele, String value) {
		s = new Select(ele);
		s.selectByValue(value);
	}

	public static void selectByText(WebElement ele, String text) {
		s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public static void deslectByIndex(WebElement ele, Integer index) {
		s = new Select(ele);
		s.deselectByIndex(index);
	}

	public static void deslectByValue(WebElement ele, String value) {
		s = new Select(ele);
		s.deselectByValue(value);
	}

	public static void deslectByText(WebElement ele, String text) {
		s = new Select(ele);
		s.deselectByVisibleText(text);
	}

	public static void isMultiple(WebElement ele, String text) {
		s = new Select(ele);
		Boolean multiple = s.isMultiple();
		if (multiple == true) {
			System.out.println("Is multiple");
		} else {
			System.out.println("Not multiple");
		}
	}

	public static void getOptions(WebElement ele) {
		s = new Select(ele);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement allOpts = options.get(i);
			System.out.println(allOpts.getText());
		}
	}

	public static void frameId(Integer index) {
		driver.switchTo().frame(index);
	}

	public static void frameElement(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public static void frameName(String value) {
		driver.switchTo().frame(value);
	}

	public static void takeSnap(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Program Files\\eclipse\\WrokSpace-eclipse\\Facebook\\target\\ScreenShot" + name + ".png");
		FileUtils.copyFile(temp, desc);
	}

	public static void javaSendkeys(String text, WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].setAttribute('value','" + text + "')", ele);
	}

	public static void javaScroll(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView()", ele);
	}

	public static void javaGetkey(WebElement ele, String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("return argument[0].getAttribute('" + value + "')", ele);
	}

	public static void javaClick(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", ele);
	}

	public static void waitAlert() {
		wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(250)).ignoring(Exception.class);
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public static void waitSelected(WebElement ele) {
		wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(250)).ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeSelected(ele));

	}

	public static void waitClicked(WebElement ele) {
		wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(250)).ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}
	public static String readFromExcel(String shName,int r,int c) throws IOException {
		
		File f = new File("C:\\Users\\MohamedPc\\eclipse-workspace\\MavenSample\\ExcelSheet\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sh = w.getSheet(shName);
		Row rw = sh.getRow(r);
 		Cell cl  = rw.getCell(c);
 		int type = cl.getCellType();
 		String value =" ";
 		if (type == 1) {
			value = cl.getStringCellValue();
		}
 		else if (DateUtil.isCellDateFormatted(cl)) {
 			 java.util.Date dd = cl.getDateCellValue();
 			 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 			 value = sdf.format(dd);			
		}		
 		else {
		double num = cl.getNumericCellValue();
		long l = (long)num;
		value = String.valueOf(l);
		}
		System.out.println(value);
		return value;
	}
	public static void changeCellValue(int shNum,int rNum,int clNum,String actValue,String newValue) throws IOException {
		File f = new File("C:\\Users\\MohamedPc\\eclipse-workspace\\MavenSample\\ExcelSheet\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sh = w.getSheetAt(shNum);
		Row r = sh.getRow(rNum);
		Cell cl = r.getCell(clNum);
		String value = cl.getStringCellValue();
		if (value.equals(actValue)) {
			cl.setCellValue(newValue);
			
		}
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}
	

	
	
	
	
	
}
