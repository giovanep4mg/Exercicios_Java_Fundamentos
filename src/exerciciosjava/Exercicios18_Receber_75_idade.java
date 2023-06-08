/*
 * Faça um algoritmo que receba a idade de 75 pessoas 
mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. 
   Considere a idade a partir de 18 anos como maior de idade;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios18_Receber_75_idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // guarda a idade recebida pelos usuários
        int recebeIdade = 0;
       
         
        
        // variável para verificação se deseja ou não continuar adicionando idade
        char desejaContinuar = 's';
        
        //  faz um while, faz repetição até o usuário querer parar
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
            
        // irá fazer um for, começando do 1 até 11 vezes depois
        // pegando a idade dos usuário 
        
        // ler 75 idades => "10" mas está lendo só  10
        int i = 0;
        for(; i < 10; i++){
            // pega o que foi digitado, converte em numéros INTEIROS e salva na variável
            recebeIdade = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite sua idade : "));
            
            
            // verifica, se é menor ou igual a 17 ou maior que isso, se for salva na variável 
        if(recebeIdade <= 17 ){
            // pega o que foi digitado, converte em numéros INTEIROS e salva na variável
           // menorIdade = Integer.parseInt(JOptionPane.showInputDialog(
               //     "Digite sua idade : "));
            
            // exibi mensagem ao usuário sobre ser ou nao de maior e sua idade
            System.out.println("Você é de menor, tem "+recebeIdade+" anos.");
            
            // exibi mensagem ao usuário sobre ser ou nao de maior e sua idade
            JOptionPane.showMessageDialog(null, 
            "Você é de menor, tem "+recebeIdade+" anos.");
            
        //fazer verificação se é maior ou igual a 150, se for salva na variável  
        } else if (recebeIdade >= 18) {
            
            // pega o que foi digitado, converte em numéros INTEIROS e salva na variável
         //   maiorIdade = Integer.parseInt(JOptionPane.showInputDialog(
         //           "Digite sua idade: "));
            
            // exibi mensagem ao usuário sobre ser ou nao de maior e sua idade
            System.out.println("Você é de maior, tem "+recebeIdade+" anos.");
            
            // exibi mensagem ao usuário sobre ser ou nao de maior e sua idade
            JOptionPane.showMessageDialog(null, 
            "Você é de maior, tem "+recebeIdade+" anos.");
            
        } else {
            
            JOptionPane.showMessageDialog(null,
                    "Digitou algo errado!");
            
            System.out.println("Você digitou algo errado!");
            
        }
           
        }
        
        
        
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
        
        }
        
    }
    
}
