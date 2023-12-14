/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumasareastriangulos;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class SumasAreasTriangulos {

    public static void main(String[] args) {
        int n,i;
        double lado1, lado2, lado3;
        double SumasAreas=0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Con cuántostrangulos quiere trabajar? ");
        n = scanner.nextInt();
        Triangulo[] triangulo = new Triangulo[n];
        
        for( i =0; i < n; i++)
        {   
            System.out.println("\t Triangulo N°: "+ (i+1));
            System.out.println("............................... ");
            System.out.print("Ingrese el lado 1: ");
            lado1 = scanner.nextDouble();
            System.out.print("Ingrese el lado 2: ");
            lado2 = scanner.nextDouble();
            System.out.print("Ingrese el lado 3: ");
            lado3 = scanner.nextDouble();
            System.out.println(" ");
            
            triangulo[i] = new Triangulo();
            triangulo[i].cargar(lado1, lado2, lado3);
            SumasAreas += triangulo[i].area();
        }
        System.out.print("La suma de las areas de los "+(i)+" triangulos es: "+ SumasAreas);
    }
}
