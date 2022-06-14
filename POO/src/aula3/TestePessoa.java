
package aula3;

import modelos.Entrada;
import modelos.Pessoa;

/**
 *
 * @author Windows 10
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();
        
        objPessoa.setNome(Entrada.leiaString("Digite seu nome: "));
       /* objPessoa.setIdade(Entrada.leiaInt("Digite sua idade: "));
        objPessoa.setAltura(Entrada.leiaDouble("Digite sua altura: "));
        objPessoa.setPeso(Entrada.leiaDouble("Digite seu peso: "));*/
        
        System.out.println(objPessoa.toString());
        
        Pessoa objPessoa2 = new Pessoa();
        
        objPessoa2.setNome(Entrada.leiaString("Digite seu nome: "));
       /* objPessoa2.setIdade(Entrada.leiaInt("Digite sua idade: "));
        objPessoa2.setAltura(Entrada.leiaDouble("Digite sua altura: "));
        objPessoa2.setPeso(Entrada.leiaDouble("Digite seu peso: "));*/
        
        System.out.println(objPessoa2.toString());
        
        
        if (objPessoa.getNome().equalsIgnoreCase(objPessoa2.getNome())) {
            System.out.println("Os nomes são iguais.");
        }else {
            System.out.println("Os nomes são diferentes.");
        }
        
        
        
        if (objPessoa.getNome().length()-1 > objPessoa2.getNome().length()-1){
            System.out.println("O primeiro nome é maior!");
        }else if (objPessoa.getNome().length()-1 < objPessoa2.getNome().length()-1){
            System.out.println("O segundo nome é maior!");
        }else {
            System.out.println("Os dois tem o mesmo comprimento");
        }
        
        System.exit(0);
    }
}
