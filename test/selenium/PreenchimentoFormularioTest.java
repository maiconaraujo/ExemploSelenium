/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author
 */
public class PreenchimentoFormularioTest {

    private WebDriver driver;
    

    @Before
    public void setUp() {
        String caminhoChromeDriver = getClass().getResource("../drivers/chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", caminhoChromeDriver);
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void preencherFormCamposObrigatorios2() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Abre a págnina de cadastro de cliente
        driver.get("http://localhost:8080/ExemploSelenium/");

        WebElement link = driver.findElement(By.id("linkCadastro"));
        link.click();

        WebElement inputNome = driver.findElement(By.name("nome"));
        WebElement bt = driver.findElement(By.id("bt"));
       // bt.click();

        //inputNome.sendKeys("");
        Select select = new Select(driver.findElement(By.name("sexo")));
        select.selectByIndex(2);

        inputNome.submit();

        String codigoPagina = driver.getPageSource();

        Assert.assertTrue(codigoPagina.contains("Por favor, informe seu nome"));
    }

}
