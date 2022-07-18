/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.carlosalvarez.bean;

/**
 *
 * @author Carlos Adolfo Alvarez Crúz
 * @date 10 abr 2021
 * @time 7:15:04
 * Codigo tecnico: IN5BV
 */
public class Division {

    //Varibles
    private double numero1;
    private double numero2;
    private double resultado;
    private double sobrante;

    //Constructor Vacio
    public Division(){
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
        sobrante= 0;
    }
    
     //get y set
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getSobrante() {
        return sobrante;
    }

    public void setSobrante(double sobrante) {
        this.sobrante = sobrante;
    }
    
    
    
    public double calcularDiv(){
        resultado = numero1/numero2;
        return resultado;
    }
    public double residuo(){
    
        sobrante = numero1%numero2;
        return sobrante;
    
    }
}
