/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.upn.pe.TestMatricula;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author jehil zidane ventura
 */
public class TestDosMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String url="http://localhost:8080/ProyectoCalidad/Vista/index.jsp?page=frmMatricula";
        driver.get(url);
        
        WebElement Alu_dni = driver.findElement(By.id("txtAlu_dni"));
        WebElement btnConsultar = driver.findElement(By.id("btnConsultar"));

        Alu_dni.sendKeys("41800041");
        
        btnConsultar.click();
        
        WebElement Mat_fecha = driver.findElement(By.id("txtMat_fecha"));
        WebElement btnActualizar = driver.findElement(By.id("btnActualizar"));
       
        Mat_fecha.clear();
        Mat_fecha.sendKeys("2022/12/12");
        
        btnActualizar.click();
        System.out.println("Test Consulta");
        
        WebElement btnNuevo = driver.findElement(By.id("btnNuevo"));
        btnNuevo.click();
        
        System.out.println("Test Actualizacion");
        
    }
}
