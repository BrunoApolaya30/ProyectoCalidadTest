/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.upn.pe.TestProfesor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author jehil zidane ventura
 */
public class TestDosProfesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String url="http://localhost:8080/ProyectoCalidad/Vista/index.jsp?page=frmProfesor";
        driver.get(url);
        
        WebElement Prof_dni = driver.findElement(By.id("txtProf_dni"));
        WebElement Prof_nombre = driver.findElement(By.id("txtProf_nombre"));
        WebElement Consultar = driver.findElement(By.id("btnConsultar"));
   
        Prof_dni.sendKeys("55555555");
        Prof_nombre.sendKeys("");
        
        Consultar.click();
        
        System.out.println("Test Consulta");
        
        WebElement Prof_telefono = driver.findElement(By.id("txtProf_telefono"));
        WebElement Actualizar = driver.findElement(By.id("btnActualizar"));

        Prof_telefono.clear();
        Prof_telefono.sendKeys("00001111");
        
        Actualizar.click();
        
        System.out.println("Test de Actualizacion Profesor");
    }
}
