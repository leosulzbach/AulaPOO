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
       aluno1.setNome("Leo");
       aluno1.setIdade(19);
       aluno1.setSexo('M');
       aluno1.setAltura(1.73);
       
       
       
      aluno1.imprimir();
      
     
        
       
    } 
    
    
        
    
}
