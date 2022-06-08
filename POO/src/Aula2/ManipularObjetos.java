/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

import modelos.Carro;

/**
 *
 * @author Windows 10
 */
public class ManipularObjetos {
    public static void main(String[] args) {
        
        Carro objCarro = new Carro("Fiat", "147", "Azul", "047b5", 2000, 1999);
        
        /*
        Carro objCarro = new Carro();
        objCarro.setMarca("fiat");
        objCarro.setModelo("147");
        objCarro.setAno_fabricacao(1980);
        */
        
        System.out.println(objCarro);
    }
}
