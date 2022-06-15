/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;
import modelos.Entrada;
/**
 *
 * @author Windows 10
 */
public class Atividade {
    public static void main(String[] args) {
        double base = Entrada.leiaDouble("Digite a base do quadrado: ");
        double altura = Entrada.leiaDouble("Digite a altura do quadrado");
        double area = areaQuadrado(base, altura);
        
        System.out.printf("A area do quadrado é igual a: %.2f",area);
        System.out.print("cm");
    }
    
    private static double areaQuadrado(double base, double altura){
        double retorno = base*altura;
        return retorno;
    }
}
