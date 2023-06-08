/*
 * Leia dois valores para as variáveis A e B, 
   e efetuar as trocas dos valores de forma que a 
   variável A passe a possuir ovalor da variável B 
   e a variável B passe a possuir o valor da variável A.
   Apresentar os valores trocados;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios06_TrocaValoresVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        int variavelA, variavelB;
        int resultado;
       
       //ler dados do aluno
       variavelA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da variável A:"));
       variavelB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da variável B:"));
        
        // FAZER A TROCA, DOS VALORES DAS VARIÁVEIS
        int x = variavelA;
        int d = variavelB;
        variavelB = x; 
        variavelA = d;
        
        
        // exibir o resultado de forma simples
        System.out.println("A variável A vale: " +variavelA+ " , e a variável B vale: " +variavelB);
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, "A variável A vale: " +variavelA+ " , e a variável B vale: " +variavelB);
        
        

    }
    
}
