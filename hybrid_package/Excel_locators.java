package hybrid_package;

import org.openqa.selenium.By;

public class Excel_locators
{
	public static By Excel_locators_class( String proname,String provalue)
	{
	By obj=null;
	switch (proname) 
	{
	case "xpath":
	obj=By.xpath(provalue);
	break;
	case "id":
	obj=By.id(provalue);
	break;
	case "name":
	obj=By.name(provalue);
	break;
	case "cssSelector":
	obj=By.cssSelector(provalue);
	break;
	case "classname":
	obj=By.className(provalue);
	break;
	default:
		break;
	}
	return obj;

	}
	}

