package com.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo 
{
	public static void main(String[] args) throws FindFailed 
	{
		System.out.println("Sikuli demo in git hub");
		System.out.println("Sikuli is running successfully")

		/*
		 * To run the sikuli just add sikuli-scipt jar and sikuli api
		 * Go to the link https:/sikuli/+download and download exe
		 * After downloading exe just double click on the setup.exe and give the libs folder path and give the path
		 * in environment variables----> System varibles ----> edit and paste that libs path in variable path
		 */
		Pattern email=new Pattern("F:\\Sikuli\\FB\\Capture.PNG");
		Pattern password=new Pattern("F:\\Sikuli\\FB\\password.PNG");
		Pattern login=new Pattern("F:\\Sikuli\\FB\\login.PNG");
		Pattern forgotpasswd=new Pattern("F:\\Sikuli\\FB\\forgotpasswd.PNG");
		Pattern back=new Pattern("F:\\Sikuli\\FB\\backward.PNG");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Screen sc=new Screen();
		sc.click(forgotpasswd);
		sc.click(back);
		sc.type(email, "priyankaspatil5@gmail.com");
		sc.type(password, "123456");
		sc.type(password, "123456");
		sc.click(login);
		
	}

}
/*    Output
[log] CLICK on L(1002,185)@S(0)[0,0 1366x768]
[log] CLICK on L(20,53)@S(0)[0,0 1366x768]
[log] CLICK on L(863,154)@S(0)[0,0 1366x768]
[log] TYPE "priyankaspatil5@gmail.com"
[log] CLICK on L(1027,152)@S(0)[0,0 1366x768]
[log] TYPE "123456"
[log] CLICK on L(1141,161)@S(0)[0,0 1366x768]
*/
