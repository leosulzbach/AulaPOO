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
    private double chequeEspecial;

    public ContaBanco(String agencia, String conta, String titular, double saldo, double chequeEspecial) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
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

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    
    
    public Boolean saque (double saque){
        this.saldo = saldo - saque;
        if (chequeEspecial+saque<=saldo){
            return true;
        } else {
            this.saldo = saldo + saque;
            return false;
        }
        
    }
    
    public void deposito (double deposito){
        this.saldo = saldo + deposito;
    }
    
    public void transferencia(ContaBanco conta,double valor){
        if (saque(valor)) {
             conta.deposito(valor);
        }
    }

    @Override
    public String toString() {
       String retorno= ("--------------------------------------\n"+"Titular: "+titular+"\n Saldo: "+saldo+"\n--------------------------------------");
       return retorno;
    }
    
    
}
