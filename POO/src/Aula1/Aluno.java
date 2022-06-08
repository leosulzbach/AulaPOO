/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula1;

/**
 *
 * @author Windows 10
 */
public class Aluno {
    public String nome;
    public int idade;
    public double altura;
    public String dataNascimento;
    
    public void fazAniversario(){
    idade++;     
    }
    public void imprimir(){
        System.out.println("O aluno "+nome+" tem "+idade+" anos");
    }
}

