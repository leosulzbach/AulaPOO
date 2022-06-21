package aula4;

import modelos.ContaBanco;

/**
 *
 * @author jonasdhein
 */
public class TesteContas {
    
    public static void main(String[] args) {
        
        ContaBanco objConta1 = new ContaBanco("111", "123", "Pedro", 1000, 200, "511234");
        ContaBanco objConta2 = new ContaBanco("222", "444", "Jorge", 400, 200, "aaa@aaa.br");
        ContaBanco objConta3 = new ContaBanco("333", "555", "Leonardo", 600, 300, "2983402");
        
        
        System.out.println(objConta1); //1000 reais de saldo
        System.out.println(objConta2); //400 reais de saldo
        System.out.println(objConta3);
        
        objConta1.saque(100, true);
        System.out.println(objConta1);

        objConta1.saque(1000, true);
        System.out.println(objConta1);
        System.out.println(objConta2);
        System.out.println(objConta3);
        
        objConta1.transferir(objConta2, 100);
        
        System.out.println(objConta1);        
        System.out.println(objConta2);
        System.out.println(objConta3);

        
        
        
    }
   
    
}
