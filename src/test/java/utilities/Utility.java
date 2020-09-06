package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import testbase.TestBase;

public class Utility extends TestBase {

	public static void scrollToElement(WebElement ele) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(false);", ele);
		j.executeScript("window.scrollBy(0,300);", "");
	}

	public void captureScreen() throws IOException 
	 {
		TakesScreenshot cap = (TakesScreenshot) driver;
		File f = cap.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\fakhr\\Downloads\\images" + "/" + getDate() + "_" + "image.jpg"));

	}

	public static String getDate() {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMM_dd_hh_mm_ss_SSS");
		String s = sdf.format(dt);
		return s;
	}
}
