/*
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
   Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios11_PrecoCusto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis 
        float precoCusto;
        float valorVenda;
        float percentual;
       
       
        // pegar o valor do produto, digitado pelo usuário
        precoCusto = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite o valor do produto:"));
        
        // pegar o valor, da porcentagem digitado pelo usuário
        percentual = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite a porcentagem que deseja adicionar:"));
       
        // pegar o preço de custo e adiciona o percentual para a venda
        valorVenda = precoCusto * percentual;
        
        // exibir o resultado de forma simples
        System.out.println("O valor do produto: "
                +precoCusto+" , e o preço de venda será de: " +valorVenda);
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, 
        "O valor do produto: " +precoCusto+" , e o preço de venda será de: " 
                +valorVenda);
        
        

    }
    
}
