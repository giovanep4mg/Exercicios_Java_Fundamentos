/*
 * Faça um algoritmo que receba “N” números 
   e mostre positivo, negativo ou zero para cada número;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios24_Positivo_Negativo {
    
    public static void main(String[] args) {
        
        // variáveis para salvar os dados digitados pelo cliente
        int numero;
        
       
        
        // variável para para ou não as perguntas
        char desejaContinuar = 's';
    
        //fazer um while, pegando várias vezes esses dados do usuário
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
    
            // roda o programa -> "5",
            for(int i = 0; i < 5; i++){
            
                // pega o número digitado pelo usuário
                numero = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite um número:"));
                
                // fazer as verificações
                if(numero > 0){
                    JOptionPane.showMessageDialog(
                     null, "O número digitado é Positivo =>"+numero);
                } else if (numero < 0){
                   JOptionPane.showMessageDialog(
                     null, "O número digitado é Negativo =>"+numero); 
                } else if (numero == 0){
                   JOptionPane.showMessageDialog(
                     null, "O número digitado é Zero =>"+numero); 
                } else {
                   JOptionPane.showMessageDialog(
                     null, "Digitou algo errado =>"+numero); 
                } 
                
            }
       
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
            
           
    
        }
    
    
    }
    
    
}
