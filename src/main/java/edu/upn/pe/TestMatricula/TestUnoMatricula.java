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
public class TestUnoMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String url="http://localhost:8080/ProyectoCalidad/Vista/index.jsp?page=frmMatricula";
        driver.get(url);
        
        WebElement Alu_dni = driver.findElement(By.id("txtAlu_dni"));
        WebElement ConsultarAlumno = driver.findElement(By.id("btnConsultarAlumno"));

        Alu_dni.sendKeys("41800041");
        
        ConsultarAlumno.click();
        
        WebElement Grado_Gra_codigo = driver.findElement(By.id("txtGrado_Gra_codigo"));
        WebElement Mat_fecha = driver.findElement(By.id("txtMat_fecha"));
        WebElement ListarGrados = driver.findElement(By.id("btnListarGrados"));
        WebElement Agregar = driver.findElement(By.id("btnAgregar"));
        
        ListarGrados.click();
        
        Grado_Gra_codigo.sendKeys("9");
        Mat_fecha.sendKeys("2022/11/15");
        
        Agregar.click();
        
        System.out.println("Test Agregar");
        
    }
}
