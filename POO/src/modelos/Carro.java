/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


/**
 *
 * @author Windows 10
 */
public class Carro {
    
    private String numero_chassi;
    private String cor;
    private String marca;
    private String modelo;
    private int ano_modelo;
    private int ano_fabricacao;
    
    
    
    public Carro(String marca, String modelo, String cor, String numero_chassi, int ano_modelo, int ano_fabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.numero_chassi = numero_chassi;
        this.ano_modelo = ano_modelo;
        this.ano_fabricacao = ano_fabricacao;
    }
    
    public Carro(){
        
    }

    public String getNumero_chassi() {
        return numero_chassi;
    }

    public void setNumero_chassi(String numero_chassi) {
        this.numero_chassi = numero_chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        retorno.append("--------------------");
        retorno.append("\n");
        retorno.append("Marca: ");
        retorno.append(marca);
        retorno.append("\n");
        retorno.append("Modelo: ");
        retorno.append(modelo);
        retorno.append("\n");
        retorno.append("Ano: "); 
        retorno.append(ano_fabricacao);
        retorno.append("\n");
        retorno.append("--------------------");
     
        return retorno.toString();
    }
    
    
    
    
    
    
    
}
