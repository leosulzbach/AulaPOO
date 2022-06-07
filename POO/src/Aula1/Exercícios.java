/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula1;

/**
 *
 * @author Windows 10
 */
public class Exercícios {
    
    /*
    Public = deixa o método visivel para ser utilizado por outras classes.
    Static = Permite que o método seja invocado sem necessidade de criar uma 
    nova instatância
    Void = O método em questão não tem retorno
    */
    public static void main(String[] args){
        int var1 = 27;
        int var2 = 30;
        
        StringBuilder resultadoFinal = new StringBuilder();
        
        resultadoFinal = imprimirExemplos(var1, var2);
        
        System.out.println(resultadoFinal.toString());
        
    } 
    
    public static StringBuilder imprimirExemplos(int v1, int v2){
        StringBuilder resultadoFinal = new StringBuilder();
        resultadoFinal.append("var1 = ");
        resultadoFinal.append(v1);
        resultadoFinal.append("\n");
        resultadoFinal.append("var2 = ");
        resultadoFinal.append(v2);
        resultadoFinal.append("\n");
        resultadoFinal.append("var1 == var2 -> ");
        resultadoFinal.append(v1 == v2);
        resultadoFinal.append("\n");
        resultadoFinal.append("var1 != var2 -> ");
        resultadoFinal.append(v1 != v2);
        resultadoFinal.append("\n");
        resultadoFinal.append("var1 < var2 -> ");
        resultadoFinal.append(v1 < v2);
        resultadoFinal.append("\n");
        resultadoFinal.append("var1 > var2 -> ");
        resultadoFinal.append(v1 > v2);
        resultadoFinal.append("\n");
        resultadoFinal.append("var1 <= var2 -> ");
        resultadoFinal.append(v1 <= v2);
        resultadoFinal.append("\n");
        resultadoFinal.append("var1 >= var2 -> ");
        resultadoFinal.append(v1 >= v2);
        resultadoFinal.append("\n");
        
        return resultadoFinal;
    }
        
    
}
