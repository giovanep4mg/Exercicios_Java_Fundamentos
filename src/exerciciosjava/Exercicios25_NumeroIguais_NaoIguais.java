/*
 * Faça um algoritmo que leia dois números 
   e identifique se são iguais ou diferentes. 

   Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. 
   Caso sejam diferentes, informe qual número é o maior,
   e uma mensagem que são diferentes;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios25_NumeroIguais_NaoIguais {
    
    public static void main(String[] args) {
        
        // variáveis para salvar os dados digitados pelo cliente
        int numeroA;
        int numeroB;
        
       
        
        // variável para para ou não as perguntas
        char desejaContinuar = 's';
    
        //fazer um while, pegando várias vezes esses dados do usuário
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
    
            
                // pega o número digitado pelo usuário
                numeroA = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite um número A:"));
                
                numeroB = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite um número B:"));
                
                // fazer as verificações
                if(numeroA == numeroB){
                    JOptionPane.showMessageDialog(
                     null, 
                         "Os números digitados são iguais. ");
                    
                } else if (numeroA > numeroB){
                   JOptionPane.showMessageDialog(
                     null, "O número A: "
                    +numeroA+" é maior que o número B: "
                        +numeroB+" Por isso, são diferentes. ");
                   
                } else if (numeroA < numeroB){
                   JOptionPane.showMessageDialog(
                     null, "O número B: "
                        +numeroB+" é maior que o numero A: "
                           +numeroA+" Por isso, são diferentes. ");    
                } else {
                   JOptionPane.showMessageDialog(
                     null, "Digitou algo errado!"); 
                } 
                
            
       
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
            
           
    
        }
    
    
    }
    
    
}
