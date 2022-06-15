/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Windows 10
 */
public class ContaBanco {
    
    private String agencia;
    private String conta;
    private String titular;
    private double saldo;

    public ContaBanco(String agencia, String conta, String titular, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public ContaBanco(){
        
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void saque (double saque){
        this.saldo = saldo - saque;
    }
    
    public void deposito (double deposito){
        this.saldo = saldo + deposito;
    }

    @Override
    public String toString() {
       String retorno= ("--------------------------------------\n"+"Titular: "+titular+"\n Saldo: "+saldo+"\n--------------------------------------");
       return retorno;
    }
    
    
}
