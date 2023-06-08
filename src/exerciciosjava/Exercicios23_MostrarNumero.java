/*
 * Faça um algoritmo que receba um número
   e mostre uma mensagem caso este número sege maior que 80, 
   menor que 25 ou igual a 40;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios23_MostrarNumero {
    
    public static void main(String[] args) {
        
        // variáveis para salvar os dados digitados pelo cliente
        int numero;
        
       
        
        // variável para para ou não as perguntas
        char desejaContinuar = 's';
    
        //fazer um while, pegando várias vezes esses dados do usuário
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
    
            for(int i = 0; i < 5; i++){
            
                numero = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite um número inteiro:"));
                
                // fazer as verificações
                if(numero == 40){
                    JOptionPane.showMessageDialog(
                     null, "O número digitado é igual a 40.");
                } else if (numero > 80){
                   JOptionPane.showMessageDialog(
                     null, "O número digitado é maior que 80."); 
                } else if (numero < 25){
                   JOptionPane.showMessageDialog(
                     null, "O número digitado é menor que 25."); 
                } else {
                   JOptionPane.showMessageDialog(
                     null, "Tente novamente."); 
                } 
                
            }
       
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
            
           
    
        }
    
    
    }
    
    
}
