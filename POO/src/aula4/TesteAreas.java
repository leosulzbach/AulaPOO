/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

import modelos.AreaRetangulo;
import modelos.AreaTriangulo;

/**
 *
 * @author Windows 10
 */
public class TesteAreas {
     public static void main(String[] args) {
         
         //RETANGULO
        AreaRetangulo retangulo1 = new AreaRetangulo((double)(Math.random()*10),(double)(Math.random()*10));
       // r1.setAltura(Entrada.leiaDouble("Digite a altura do retangulo"));
       // r1.setBase(Entrada.leiaDouble("Digite a base do retangulo"));
        System.out.printf("A area do retangulo é: %.2f",retangulo1.calcularArea());
        System.out.print("cm");
        System.out.println("");
        System.exit(0);
        
        //-------------------------------------------------------------------------------------------------
        
        //TRIANGULO
         AreaTriangulo triangulo1 = new AreaTriangulo((double)(Math.random()*10),(double)(Math.random()*10));
          //AreaTriangulo area1 = new AreaTriangulo(5, 5);
          System.out.printf("A area do triangulo é: %.2f",triangulo1.calcularArea());
          System.out.print("cm");
          System.out.println("");
        
     }
}
