/*
 * Faça um algoritmo que receba um número 
   e mostre uma mensagem caso este número seja maior que 10;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios13_MostrarNumeroMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variável
        int receberNumero;
        
        // e dos impostos aplicados 
        receberNumero = Integer.parseInt(JOptionPane.showInputDialog(
             "Digite um número:"));
        
        // verificar se o número recebido é maior que  10 ou não, e executa uma ação
        if(receberNumero >= 10){
            // exibir o resultado de forma simples
            System.out.println("O número digitado foi o: " +receberNumero);
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
            "O número digitado foi o: " +receberNumero);
        }
        
        
        
        

    }
    
}
