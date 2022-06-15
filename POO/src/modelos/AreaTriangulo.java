/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Windows 10
 */
public class AreaTriangulo {
    
    private double base;
    private double altura;

    public AreaTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public AreaTriangulo(){
        
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
        return (base*altura)/2;
    }
}
