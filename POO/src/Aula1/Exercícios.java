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
        
       Aluno aluno1 = new Aluno();
       aluno1.idade=36;
       aluno1.nome="Bruno";
       
       Aluno aluno2 = new Aluno();
       aluno2.idade=23;
       aluno2.nome="Yuri";
       
      aluno1.imprimir();
      aluno2.imprimir();
      
      aluno2.fazAniversario();
      aluno2.imprimir();
        
        
       
    } 
    
    
        
    
}
