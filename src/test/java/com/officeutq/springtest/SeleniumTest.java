package com.officeutq.springtest;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class SeleniumTest {

	@Test
    public void myTest() throws IOException {

		// WebDriverを作成
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");  // ゲストでログイン
        options.addArguments("--window-size=1280,720");  // ブラウザサイズの指定
        WebDriver driver = new ChromeDriver(options);

        // Googleのページに遷移する
        driver.get("https://www.google.co.jp/");

        // 遷移が成功したことを確認する
        Assertions.assertEquals("Google", driver.getTitle());

        // キャプチャを撮る
        TakesScreenshot screenshotDriver = (TakesScreenshot)driver;
        File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koji_\\Documents\\capture\\screenshot.png"));

        // ブラウザを終了する
        driver.quit();
    }

}
