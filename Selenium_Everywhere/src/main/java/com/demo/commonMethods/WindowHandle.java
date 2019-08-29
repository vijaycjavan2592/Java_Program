package com.demo.commonMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;

public class WindowHandle {
	static WebDriver driver;
	
	public static void wind_Handle() {
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow is "+parentWindow);
		
		List<String> li = new ArrayList<String>(driver.getWindowHandles());
		
		Iterator<String> it = li.iterator();
		
		while(it.hasNext()) {
			
			String currentwindow = it.next();
			if(!(parentWindow==currentwindow)) {
				driver.switchTo().window(currentwindow);
				System.out.println("currentwindow is "+currentwindow);
			}
		}		
	}

}
