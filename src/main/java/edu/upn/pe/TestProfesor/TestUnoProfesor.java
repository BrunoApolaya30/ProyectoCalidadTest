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
public class TestUnoProfesor {

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
        WebElement Prof_apellido = driver.findElement(By.id("txtProf_apellido"));
        WebElement Prof_telefono = driver.findElement(By.id("txtProf_telefono"));
        WebElement Agregar = driver.findElement(By.id("btnAgregar"));

        Prof_dni.sendKeys("55555555");
        Prof_nombre.sendKeys("jose maria");
        Prof_apellido.sendKeys("ventura tecco");
        Prof_telefono.sendKeys("999111333");
        
        Agregar.click();
        
    }
}
