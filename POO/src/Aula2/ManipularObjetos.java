/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

import modelos.Carro;
import modelos.Modelo;

/**
 *
 * @author Windows 10
 */
public class ManipularObjetos {
    public static void main(String[] args) {
        
        Modelo modelo = new Modelo("Audi", "A8");
        
        Carro objCarro = new Carro(modelo, "Azul", "047b5", 2020, 2019);
        
        
        Carro objCarro2 = new Carro(modelo, "Azul", "047b5", 2020, 2019);
        //Carro objCarro2 = new Carro("Porche", "C3", "Preto", "I80j12", 2010, 2009);
        
        /*
        Carro objCarro = new Carro();
        objCarro.setMarca("fiat");
        objCarro.setModelo("147");
        objCarro.setAno_fabricacao(1980);
        */
        
        if (objCarro.getAno_fabricacao() > objCarro2.getAno_fabricacao()) {
            System.out.println("O carro mais novo é: "+objCarro.getModelo());
        } else if (objCarro2.getAno_fabricacao() > objCarro.getAno_fabricacao()) {
            System.out.println("O carro mais novo é: "+objCarro2.getModelo());
        }else {
            System.out.println("Os carros são do mesmo ano");
        }
        
        
        
        System.out.println(objCarro);
        System.out.println(objCarro2);
        
    }
}
