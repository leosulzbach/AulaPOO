/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

import modelos.ContaBanco;
import modelos.Entrada;

/**
 *
 * @author Windows 10
 */
public class TesteContas {
    public static void main(String[] args) {
        ContaBanco objConta = new ContaBanco(
                Entrada.leiaString("Digite o numero da agência: "),
                Entrada.leiaString("Digite o numero da conta: "),
                Entrada.leiaString("Digite o nome do titular: "),
                Entrada.leiaDouble("Digite o saldo da conta: "));
        System.out.println(objConta.toString());
        
        objConta.deposito(Entrada.leiaDouble("Valor a ser depositado: "));
        System.out.println(objConta.toString());
        
        objConta.saque(Entrada.leiaDouble("Valor a ser sacado"));
        System.out.println(objConta.toString());
        
        
        ContaBanco objConta2 = new ContaBanco(
                Entrada.leiaString("Digite o numero da agência: "),
                Entrada.leiaString("Digite o numero da conta: "),
                Entrada.leiaString("Digite o nome do titular: "),
                Entrada.leiaDouble("Digite o saldo da conta: "));
        System.out.println(objConta2.toString());
        
        double transferencia = Entrada.leiaDouble("Valor a ser transferido  1>>>2");
        objConta.saque(transferencia);
        objConta2.deposito(transferencia);
        System.out.println(objConta.toString());
        System.out.println(objConta2.toString());
        System.exit(0);
    }
}
