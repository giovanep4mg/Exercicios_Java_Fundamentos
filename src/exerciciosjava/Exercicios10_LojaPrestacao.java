/*
 * A Loja está vendendo seus produtos em 5(cinco)prestações sem juros. 
   Faça um algoritmo que receba um valor de uma compra e mostre o valor das 
    prestações;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios10_LojaPrestacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis 
        double dinheiroCompra;
        int prestacoes = 5;
        double valorPrestacao;
       
       
       // pegar o valor, depositado pelo usuário
       dinheiroCompra = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite o valor da compra:"));
       
        // pega o valor do usuário e divide em 5 as prestações
        valorPrestacao =  dinheiroCompra / prestacoes ;
       
        
        // exibir o resultado de forma simples
        System.out.println("O valor da compra foi: "
                +dinheiroCompra+" as parcelas ficam 5 vezes de : "
                +valorPrestacao+" reais.");
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, 
        "O valor da compra foi: "
                +dinheiroCompra+" as parcelas ficam 5 vezes de : "
                +valorPrestacao+" reais.");
        
        

    }
    
}
