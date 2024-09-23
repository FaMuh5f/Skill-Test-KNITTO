// Setup selenium
package dev.selenium.getting_started;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstScript {
    public static void main(String[] args) {
		// Memulai session baru
        WebDriver driver = new ChromeDriver();

		// mengambil webpage yang akan dilakukan pengetesan
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // mengambil informasi webpage yang dibukan
        driver.getTitle();

        // menunggu untuk semua element pada page terload tebelum dilakukannya testing 
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        // Mencari element yang akan dilakukan pengetesan
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        // Melakukan aksi pada elemen yang sudah ditemkukan
        textBox.sendKeys("Selenium");
        submitButton.click();

        // Mendapatkan umpan balik dari aksti yang dilakukan untuk validasi bahwa aksi berhasil dilakukan
        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        // Menhentikan session yang dilakukan
        driver.quit();
    }
}