/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

/**
 *
 * @author Windows 10
 */
public class CompararString {
    public static void main(String[] args) {
        String nome1 = "Leo";
        String nome2 = "LEO";
        
        
        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais e possuem a mesma capitalização");
        }else if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Os nomes são iguais mas possuem capitalizações diferentes");
        } else {
            System.out.println("Os nomes são diferentes");
        }
        
    }
}
