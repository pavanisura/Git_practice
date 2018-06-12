package hybrid_package;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Connection
{
public static Workbook wbook;
public static Sheet wsht;
public static String path=("TestData1\\");
public static void Excel_Connection_class(String filename,String Sheetname)
{
	{
		try 
		{
			FileInputStream fi=new FileInputStream(path+filename);
			wbook=Workbook.getWorkbook(fi);
			wsht=wbook.getSheet(Sheetname);
		}
			
			catch (Exception e)
			{
			}	
		
		 
	 }
}
	 

		
public static String excel_rows(int col,int row)
{
	return Excel_Connection.wsht.getCell(col,row).getContents();
			
}


}