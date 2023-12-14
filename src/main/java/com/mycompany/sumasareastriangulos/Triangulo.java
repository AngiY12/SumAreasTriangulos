/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumasareastriangulos;

/**
 *
 * @author Usuario
 */
public class Triangulo {
//Atributos
    private double lado1, lado2, lado3;

//Constructor
    public Triangulo()
    {
        this.lado1= lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    
 //Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
 //operacion cargar datos 
    public void cargar(double lado1, double lado2, double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3= lado3;
    }
    
 //Area por semiperimétro
    public double area() 
    {
        double s = (this.lado1+this.lado2+this.lado3)/2;
        double area = Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
        return area;
    }
}
