/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;
import modelos.AreaTriangulo;
import modelos.Entrada;

/**
 *
 * @author Windows 10
 */
public class TesteTriangulo {
    public static void main(String[] args) {
         // AreaTriangulo area1 = new AreaTriangulo((double)(Math.random()*10),(double)(Math.random()*10));
          AreaTriangulo area1 = new AreaTriangulo(5, 5);
          System.out.printf("A area do triangulo é: %.2f",area1.calcularArea());
          System.out.print("cm");
          System.out.println("");
    }
}
