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
    
    public static void main(String[] args) {
        
        ContaBanco[] contas = new ContaBanco[3];
        
        ContaBanco objConta1 = new ContaBanco("111", "123", "Pedro", 1000, 200, "511234");
        ContaBanco objConta2 = new ContaBanco("222", "444", "Jorge", 400, 200, "aaa@aaa.br");
        ContaBanco objConta3 = new ContaBanco("333", "555", "Leonardo", 600, 300, "19");
        
        contas[0] = objConta1;
        contas[1] = objConta2;
        contas[2] = objConta3;
        
        
        System.out.println(objConta1); 
        System.out.println(objConta2); 
        System.out.println(objConta3);
        
        String contaOrigem = "123";
        ContaBanco objContaOrigem = localizarContaOrigem(contas,contaOrigem);
        
        String contaDestino = "19";
        ContaBanco objContaDestino = localizarContaDestino(contas , contaDestino);
        
        
        objContaOrigem.transferirPix(objContaDestino, 100);
        
        System.out.println(objConta1); 
        System.out.println(objConta2); 
        System.out.println(objConta3);
        
        
    }
    private static ContaBanco localizarContaOrigem(ContaBanco[] contas , String conta){
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getConta().equals(conta)) {
                return contas[i];
            }
        }
        return null;
    }
    
    private static ContaBanco localizarContaDestino(ContaBanco[] contas, String pix){
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getChavePix().equals(pix)) {
                return contas[i];
            }
        }
        return null;
    }
    
    
}
