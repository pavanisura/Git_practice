package hybrid_package;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Hybrid_testable_class 
{
	@Test(priority=0)
	public void Application_open()
	{
		Helper_class.Excel_Helper_Class_Class("Hybrid_excelsheet.xls","URL");
		Reporter.log("Kexim  Aplication is pass");
	}
	@Test(priority=1)
	public void Admin()
	{
		Helper_class.Excel_Helper_class("Hybrid_excelsheet.xls","Admin","Admin123");
		Reporter.log("Admin login is succesfull ");
	}
	@Test(priority=2)
	public void Branch_creation()
	{
		Helper_class.Excel_Helper_class("Hybrid_excelsheet.xls","Branches","Branch12");
		Reporter.log("Branch is created succesfully");
	}

	public void Role_creation()
	{
	Helper_class.Excel_Helper_class("Hybrid_excelsheet.xls","Roles","Role12");	
		Reporter.log("Role is created sucessfully");
	}
	public void Emp_creation()
	{
		Helper_class.Excel_Helper_class("Hybrid_excelsheet.xls","Employees","emp12");
		Reporter.log("Employee is created sucessfully");
	}
	public void Customer_void()
	{
		Helper_class.Excel_Helper_class("Hybrid_excelsheet.xls","Customers","Cus12");
		Reporter.log("Customer is created sucessfully");
	}
	}


