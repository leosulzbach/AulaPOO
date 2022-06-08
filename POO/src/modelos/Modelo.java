/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Windows 10
 */
public class Modelo {
    
    private String marca;
    private String modelo;

    public Modelo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    @Override
    public String toString(){
        String retorno;
        retorno=("Modelo: "+modelo+"\n"
                +"Marca: "+marca+"\n");
        return retorno;
    }
    
}
