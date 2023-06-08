/*
 * Escreva um algoritmo que leia dois valores inteiro distintos 
   e informe qual é o maior;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios14_MaiorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variável
        int numeroA;
        int numeroB;
        
        // e dos impostos aplicados 
        numeroA = Integer.parseInt(JOptionPane.showInputDialog(
             "Digite um número A:"));
        numeroB = Integer.parseInt(JOptionPane.showInputDialog(
             "Digite um número B:"));
        
        // verificar se o número recebido é maior que  10 ou não, e executa uma ação
        if(numeroA > numeroB){
            // exibir o resultado de forma simples
            System.out.println("O número A é o maior valor => "+numeroA);
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
             " O número A é o maior valor => "+numeroA);
        } else if (numeroB > numeroA){
            // exibir o resultado de forma simples
            System.out.println("O número B é o maior valor => "+numeroB);
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
            "O número B é o maior valor => "+numeroB);
        } else {
            // exibir o resultado de forma simples
            System.out.println(" Você digitou algo errado.");
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
            " Você digitou algo errado.");
        }
        
        
        
        

    }
    
}
