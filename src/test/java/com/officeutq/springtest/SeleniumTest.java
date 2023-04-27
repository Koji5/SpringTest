package com.officeutq.springtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

@SpringBootTest
public class SeleniumTest {

	@Test
    public void myTest() {
        // WebDriverを作成
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        WebDriver driver = new ChromeDriver();

        // Googleのページに遷移する
        driver.get("http://localhost:8080");

        // 遷移が成功したことを確認する
        Assertions.assertEquals("index", driver.getTitle());

        // ブラウザを終了する
        driver.quit();
    }

}
