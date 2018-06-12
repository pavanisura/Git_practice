package hybrid_package;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Helper_class 
{
	public static WebDriver driver;
	public static void Excel_Helper_Class_Class(String filename,String Sheetname)
	{
		Excel_Connection.Excel_Connection_class(filename, Sheetname);
		String app_url=Excel_Connection.wsht.getCell(0, 1).getContents();
		driver=new FirefoxDriver();
		driver.get(app_url);
		driver.manage().window().maximize();
}
	public static void Excel_Helper_class(String filename,String Sheetname,String imgname2)
	{
		Excel_Connection.Excel_Connection_class(filename, Sheetname);
		//count of rows
		int rc=Excel_Connection.wsht.getRows();
				System.out.println(rc);
				//loops
				
				for (int i = 1; i < rc; i++) 
				{
			String proname=Excel_Connection.wsht.getCell(1, i).getContents();
			String provalue=Excel_Connection.wsht.getCell(2, i).getContents();
			String actions=Excel_Connection.wsht.getCell(3, i).getContents();
			String inputdata=Excel_Connection.wsht.getCell(4, i).getContents();
			switch (actions)
			{
			case "TextBox":
				WebElement ele=driver.findElement(Excel_locators.Excel_locators_class(proname,provalue));
				ele.clear();
				ele.sendKeys(inputdata);
				break;
			
			case "Button":
	           WebElement ele1=driver.findElement(Excel_locators.Excel_locators_class(proname,provalue));
			   ele1.click();
			   break;
			case "DropDown":
		           Select drop=new Select(driver.findElement(Excel_locators.Excel_locators_class(proname,provalue)));
				   drop.selectByVisibleText(inputdata);
				   break;
			case "link":
				WebElement ele2=driver.findElement(Excel_locators.Excel_locators_class(proname, provalue));
				ele2.click();
				break;
			case "Alert":
				driver.switchTo().alert().accept();
			    break;
			case "CaptureScreen":
				try {				
					

					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    FileUtils.copyFile(src,new File("Screenshots\\"+imgname2+".png"));
				
				}
					catch (Exception e)
				{
					// TODO: handle exception
				
				}
	           break;
			default:
				break;
			}
			
		}
		
	}
	}

