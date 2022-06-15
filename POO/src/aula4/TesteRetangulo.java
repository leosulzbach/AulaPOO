/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;
import modelos.AreaRetangulo;
import modelos.Entrada;
/**
 *
 * @author Windows 10
 */
public class TesteRetangulo {
    public static void main(String[] args) {
        AreaRetangulo area1 = new AreaRetangulo((double)(Math.random()*10),(double)(Math.random()*10));
        
       // r1.setAltura(Entrada.leiaDouble("Digite a altura do retangulo"));
       // r1.setBase(Entrada.leiaDouble("Digite a base do retangulo"));

        System.out.printf("A area do retangulo é: %.2f",area1.calcularArea());
        System.out.print("cm");
        System.out.println("");
        System.exit(0);
    }
}
