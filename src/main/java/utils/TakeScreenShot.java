package utils;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	public static void TakeScreenShotAs(WebDriver driver) {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		long imgName= System.currentTimeMillis();
		
		try {
			FileUtils.copyFile(src, new File(currentDir + "/screenshots/"+imgName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
