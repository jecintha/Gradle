package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Process {
	WebDriver driver;
  @Test
  public void f() throws MalformedURLException {
	  DesiredCapabilities cap=new DesiredCapabilities();
      cap.setCapability("deviceName","J668A1ZR5B101972");
      cap.setCapability("browserName","Android");
      cap.setCapability("platformVersion","5.1");
      cap.setCapability("platformName","Android");
      cap.setCapability("app","http://192.168.1.184:9090/jenkins/job/Project1_TObject/lastSuccessfulBuild/artifact/app/build/outputs/apk/app-debug.apk");
      cap.setCapability("appPackage","com.example.android.testing.unittesting.BasicSample");
      cap.setCapability("appActivity","com.example.android.testing.unittesting.BasicSample.MainActivity");
      driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //driver.findElement(By.name("Enter your name")).clear();
      driver.findElement(By.name("Enter your name")).sendKeys("ashok");
      driver.findElement(By.xpath("//android.widget.Button[contains(@bounds,'[192,655][384,853]')]")).click();
      driver.findElement(By.xpath("//android.widget.Button[contains(@bounds,'[432,655][624,853]')]")).click();
      driver.findElement(By.xpath("//android.widget.Button[contains(@bounds,'[672,655][864,853]')]")).click();
      //driver.findElement(By.name("Enter your Email")).clear();
      driver.findElement(By.name("Enter your Email")).sendKeys("ashok.blisslogix@gmail.com");
      driver.findElement(By.name("Save")).click();
      
	  
  }
}
