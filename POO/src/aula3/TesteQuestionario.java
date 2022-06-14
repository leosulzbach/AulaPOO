
package aula3;

import modelos.Entrada;
import modelos.Questionario;

public class TesteQuestionario {
    public static void main(String[] args) {
        
        
        Questionario[] vetorQuestionario = new Questionario[3];
        
        Questionario questao1 = new Questionario();
        
        questao1.setPergunta("Quanto é 5+5x5");
        questao1.setRespostaA("50");
        questao1.setRespostaB("30");
        questao1.setRespostaC("25");
        questao1.setRespostaCorreta("B");
        
        vetorQuestionario[0]=questao1;
        
        Questionario questao2 = new Questionario();
        
        questao2.setPergunta("Quem Ganhou a última copa do mundo?");
        questao2.setRespostaA("Alemanha");
        questao2.setRespostaB("Bélgica");
        questao2.setRespostaC("França");
        questao2.setRespostaCorreta("C");
        
        vetorQuestionario[1]=questao2;
        
        Questionario questao3 = new Questionario();
        
        questao3.setPergunta("Qual é o unico elemento da tabela periódica que não possúi família?");
        questao3.setRespostaA("Hidrogenio");
        questao3.setRespostaB("Carbono");
        questao3.setRespostaC("Hélio");
        questao3.setRespostaCorreta("A");
        
        vetorQuestionario[2]=questao3;
        
        realizarQuestionario(vetorQuestionario);
        
    }
    
    private static void realizarQuestionario(Questionario[] questoes){
        int acerto = 0;
        int erro = 0;
        int a = 0;
        for (int i = 0; i < 3; i++) {
            while (a != 1){
            String resposta1 = Entrada.leiaString(questoes[i].getPergunta()+"\n"
                +"A) "+questoes[i].getRespostaA()+"\n"
                +"B) "+questoes[i].getRespostaB()+"\n"
                +"C) "+questoes[i].getRespostaC());
        
            if (resposta1.equalsIgnoreCase("a") || resposta1.equalsIgnoreCase("b") || resposta1.equalsIgnoreCase("c")) {
                a=1;
            }else {
                a=0;
                System.out.println("Por favor digite uma alternativa válida (A) (B) (C)");
            }
           
            if (resposta1.equalsIgnoreCase(questoes[i].getRespostaCorreta()) && a==1) {
            acerto++;
            a=1;
        } else if (a == 1) {
            erro++;
            a=1;
        }
        }
            a=0;
        }
        
      
       
        
        System.out.println("O total de respostas corretas foi: "+acerto);
        System.out.println("O total de respostas corretas foi: "+erro);
    }
}
