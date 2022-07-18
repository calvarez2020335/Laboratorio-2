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
 * @time 7:14:26
 * Codigo tecnico: IN5BV
 */
public class Resta {
    
    private double restatorio;
    private double numeroEntero;
    private double numeroIngresado;
    
    
     //Constructor Vacio
    public Resta(){
        restatorio = 0;
        numeroEntero = 0;
        numeroIngresado = 0;
    
    }

    public double getRestatorio() {
        return restatorio;
    }

    public void setRestatorio(double restatorio) {
        this.restatorio = restatorio;
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
    
    public double calularResta(){
        for(double i = 0; i ==0;){
        
        String numeroeNTRADA = JOptionPane.showInputDialog("Ingrese un numero natural");
        numeroEntero = Double.parseDouble(numeroeNTRADA);
        if(numeroEntero==0){
            break;
        }
        numeroIngresado--;
        restatorio =Math.abs(numeroEntero - restatorio)  ;
        }
        return restatorio;
    }
    
    
}
