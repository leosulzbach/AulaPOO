/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;
import modelos.ContaBanco;
import modelos.Entrada;

/**
 *
 * @author jonasdhein
 */
public class TestePix {
    
    static ContaBanco[] contas = new ContaBanco[3];
    
    public static void main(String[] args) {
        
        ContaBanco objConta1 = new ContaBanco("111", "123", "Pedro", 1000, 200, "511234");
        ContaBanco objConta2 = new ContaBanco("222", "444", "Jorge", 400, 200, "aaa@aaa.br");
        ContaBanco objConta3 = new ContaBanco("333", "555", "Leonardo", 600, 300, "19");
        
        contas[0] = objConta1;
        contas[1] = objConta2;
        contas[2] = objConta3;
        
        System.out.println(objConta1); 
        System.out.println(objConta2); 
        System.out.println(objConta3);
        
        String contaOrigem = Entrada.leiaString("Informe a conta de origem: ");
        ContaBanco objContaOrigem = localizarContaOrigem(contaOrigem);
        
        
        String contaDestino = Entrada.leiaString("Digite o pix destino: ");
        ContaBanco objContaDestino = localizarContaDestino(contaDestino);
        
        
        
        if (objContaOrigem != null && objContaDestino != null) {
            double valorPix = Entrada.leiaDouble("Valor a ser transferido: ");
            objContaOrigem.transferirPix(objContaDestino, valorPix);
            System.out.println(objContaOrigem.toString()); 
            System.out.println(objContaDestino.toString()); 
        }else{
            System.out.println("informações inválidas");
        }
        
        
        
        
        System.exit(0);
        
    }
    private static ContaBanco localizarContaOrigem(String conta){
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getConta().equals(conta)) {
                return contas[i];
            }
        }
        return null;
    }
    
    private static ContaBanco localizarContaDestino(String pix){
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getChavePix().equals(pix)) {
                return contas[i];
            }
        }
        return null;
    }
    
    
}
