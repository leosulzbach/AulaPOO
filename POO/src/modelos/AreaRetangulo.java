/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Windows 10
 */
public class AreaRetangulo {
    
    private double base;
    private double altura;
    

    public AreaRetangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public AreaRetangulo(){
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
        double retorno = base*altura;
        return retorno;
    }
    
    
}
