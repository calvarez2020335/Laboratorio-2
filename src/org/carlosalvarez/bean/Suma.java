/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlosalvarez.bean;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Adolfo Alvarez Crúz
 * @date 10 abr 2021
 * @time 7:14:15 Codigo tecnico: IN5BV
 */
public class Suma {

    private double sumatoria ;
    private double numeroEntero ;
    private double numeroIngresado ;

    
     //Constructor Vacio
    public Suma (){
    
    sumatoria = 0;
    numeroEntero = 0;
    numeroIngresado = 0;
    }
    
    //get y set
    public double getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(double sumatoria) {
        this.sumatoria = sumatoria;
    }

    public double getNumeroEntero() {
        return numeroEntero;
    }

    public void setNumeroEntero(double numeroEntero) {
        this.numeroEntero = numeroEntero;
    }

    public double getNumeroIngresado() {
        return numeroIngresado;
    }

    public void setNumeroIngresado(double numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }

    public double calcularSuma() {

        for (double i = 0; i == 0;) {
            
            String numero_Entrada = JOptionPane.showInputDialog("Ingrese un numero natural");
            numeroEntero = Double.parseDouble(numero_Entrada);
            if (numeroEntero == 0) {
                break;
            }
            numeroIngresado++;
            sumatoria = sumatoria + numeroEntero;

        }
        return sumatoria;

    }
}
