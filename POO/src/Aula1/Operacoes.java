/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula1;

/**
 *
 * @author Windows 10
 */
public class Operacoes {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        StringBuilder resultado = new StringBuilder();
        
        resultado = op(num1, num2);
        
        System.out.println(resultado);
        
    }
    
    public static StringBuilder op (int a, int b){
        StringBuilder resultadoFinal = new StringBuilder();
        resultadoFinal.append("A + B = ");
        resultadoFinal.append((a + b));
        resultadoFinal.append("\n");
        
        resultadoFinal.append("A - B = ");
        resultadoFinal.append((a - b));
        resultadoFinal.append("\n");
        
        return resultadoFinal;
        
        
    }
}
