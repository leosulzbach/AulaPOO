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
public class TesteBanco {
    public static void main(String[] args) {
        int i = 0;
        int op = 1;
        while (op != 5){
            if (op==1) {
                 i++;
                 System.out.println(i);
            }
            ContaBanco[] objConta = new ContaBanco[2];
            op = Entrada.leiaInt("[ 1 ] - Adicionar conta\n"
                                           +"[ 2 ] - Escolher conta\n"
                                           +"[ 3 ] - Sacar\n"
                                           +"[ 4 ] - Deposito\n"
                                           +"[ 5 ] - Sair");
                                           
            
           if (op==1) {
               objConta[i-1]=ContaBanco("conta"+i);
                System.out.println("Agora voce esta na conta "+objConta[i-1].getConta());
                System.out.println(objConta[i-1].toString());
                System.out.println(objConta[0].toString());
            }
            
            if (op==2){
                String b=Entrada.leiaString("Digite o numero da conta que você deseja: ");
                for (int j = 0; j < objConta.length; j++) {
                    if (b.equalsIgnoreCase(objConta[j].getConta())) {
                        i = j+1;
                    }
                }
            }
            
            if (op==3) {
                int d = 0;
                while  (d == 0){
                    double saque =Entrada.leiaDouble("Saldo a sacar: ");
                if (saque <= objConta[i-1].getSaldo()) {
                    objConta[i-1].saque(saque);
                    System.out.println(objConta[i-1].toString());
                    d=1;
                }else {
                    System.out.println("Digite um saldo válido");
                }
                }
            }
            
            if (op==4) {
                int d = 0;
                while  (d == 0){
                double deposito = Entrada.leiaDouble("Saldo a depositar: ");
                if (deposito >= 1) {
                    objConta[i-1].deposito(deposito);
                    System.out.println(objConta[i-1].toString());
                    d=1;
                }else{
                    System.out.println("Digite um saldo válido");
                }
                }
            }
                
            
            if(op>5 || op<1){
                System.out.println("Digite um valor válido");
            }
            
        
    }
    }

    public static ContaBanco ContaBanco(String string) {
        ContaBanco string = new ContaBanco();
        conta.setAgencia(Entrada.leiaString("digite o codigo da agência: "));
        conta.setConta(Entrada.leiaString("digite o número da conta: "));
        conta.setTitular(Entrada.leiaString("digite o nome do titular: "));
        conta.setSaldo(Entrada.leiaDouble("digite saldo da conta: "));
        return conta;
    }

   
    
}
