package com.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallingApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// to install the app in emulator
		
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "O7NNAI4LA6LZVCSC");
		
		//dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\vinit\\Downloads\\apk\\example2.apk");
		dc.setCapability("appPackage", "com.coolbase.androidprograming");
		dc.setCapability("appActivity", "com.coolbase.androidprograming.MainActivity");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver =new AndroidDriver<WebElement>(url,dc);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("com.coolbase.androidprograming:id/button")).click();
		driver.findElement(By.id("com.coolbase.androidprograming:id/firstout")).click();
		
		driver.findElement(By.id("com.coolbase.androidprograming:id/one2")).click();
		
		driver.findElement(By.id("com.coolbase.androidprograming:id/secondout")).click();
		driver.findElement(By.className("android.widget.TextView")).click();
		 
		
		
			/*Name: Android UI Programing
Package: com.coolbase.androidprograming
Signature: 44:81:5d:cf:b3:12:8f:77:32:6c:07:1c:c6:48:e9:eb:1b:b9:be:b1
Version name: 1.0
 Version Code: 1*/
		
		
		

	}

}
