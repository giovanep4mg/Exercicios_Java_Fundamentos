/*
 * Faça um algoritmo que receba um número 
   e diga se este número está no intervalo entre 100 e 200;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios15_Dentro100_200 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variável
        int numeroA;
        
        
        // e dos impostos aplicados 
        numeroA = Integer.parseInt(JOptionPane.showInputDialog(
             "Digite um número:"));
        
        
        // verificar se o número recebido é maior que  10 ou não, e executa uma ação
        if( (numeroA >= 100) && (numeroA <= 200) ){
            // exibir o resultado de forma simples
            System.out.println("O número está dentro do intervalo de 100 a 200 => "+numeroA);
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
             "O número está dentro do intervalo de 100 a 200 => "+numeroA);
            
        }else {
            // exibir o resultado de forma simples
            System.out.println("O numero não está dentro do intervalo de 100 a 200 => "+numeroA);
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
            "O numero não está dentro do intervalo de 100 a 200 => "+numeroA);
        }
        
        
        
        

    }
    
}
