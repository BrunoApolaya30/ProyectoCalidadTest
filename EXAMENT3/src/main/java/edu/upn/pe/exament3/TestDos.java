/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.upn.pe.exament3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author jehil zidane ventura
 */
public class TestDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String url="http://localhost:8085/EXAMENT3/principal.jsp";
        driver.get(url);
        
        WebElement cantleche = driver.findElement(By.id("cantleche"));
        WebElement cantcafe = driver.findElement(By.id("cantcafe"));
        WebElement cantmanzanilla = driver.findElement(By.id("cantmanzanilla"));
        WebElement iniciar = driver.findElement(By.id("iniciar"));
        
        WebElement option1 = driver.findElement(By.id("chec"));
        option1.click();
        
        WebElement option2 = driver.findElement(By.id("chec2"));
        option2.click();
        
        WebElement option3 = driver.findElement(By.id("chec3"));
        option3.click();
         
        cantleche.clear();
        cantcafe.clear();
        cantmanzanilla.clear();
        
        cantleche.sendKeys("5");
        cantcafe.sendKeys("3");
        cantmanzanilla.sendKeys("1");
        
        iniciar.click();
        
        String tituloEsperado = "calcular";
        String tituloReal = driver.getTitle();
        
        if(tituloEsperado.equals(tituloReal)){
            System.out.println("Test autentificacion Correcto");  
            WebElement abcd = driver.findElement(By.id("abcd"));
            if(Double.parseDouble(abcd.getText()) == 24.3){
                System.out.println("Test de calculo de monto total correcto");
            }else{
                System.out.println("Test de calculo de monto total incorrecto");
            }
        }else{
            System.out.println("Test autentificacion Incorrecto");
        }
        
        System.out.println(driver.getTitle());
        
        WebElement importe = driver.findElement(By.id("importe"));
        WebElement pagar = driver.findElement(By.id("pagar"));
        
        importe.sendKeys("30");
        pagar.click();
        
        String tituloEsperado2 = "comprar";
        String tituloReal2 = driver.getTitle();
        
        if(tituloEsperado2.equals(tituloReal2)){
            System.out.println("Test autentificacion Correcto");  
            WebElement vuelto = driver.findElement(By.id("vuelto"));
 
            if(Double.parseDouble(vuelto.getText()) == 5.699999999999999){
                System.out.println("Test de calculo del vuelto correcto");
            }else{
                System.out.println("Test de calculo del vuelto incorrecto");
            }
        }else{
            System.out.println("Test autentificacion Incorrecto");
        }
        System.out.println(driver.getTitle());
    }
}
