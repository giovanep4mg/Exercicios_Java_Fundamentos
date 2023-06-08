/*
 * Elabore um algoritmo que, dada a idade de um nadador. 
   Classifique-o em uma das seguintes categorias:

   a. Infantil A = 5 - 7 anos;
   b. Infantil B = 8 - 10 anos;
   c. Juvenil A = 11- 13 anos;
   d. Juvenil B = 14 - 17 anos;
   e. Sênior = 18 - 25 anos.

   Apresentar mensagem “idade fora da faixa etária” 
   quando for outro ano não contemplado;
 */
package exerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios34_Nadador_Idade {
    
    public static void main(String[] args) {
        
        // variáveis para guarda os dados do usuário
        int idadeNadador;
        
         // variável usada para repetir ou não
        char desejaContinuar = 's';
       
        // repetição 
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            // pega a data da idade do usuário
            idadeNadador = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            
            // fazer a verificação das idades
            
            // se a idade do usuário for igual a 5, OU -> menor ou igual a 7
            if((idadeNadador == 5) || (idadeNadador <= 7) ){
             
              // exibi essa mensagem
              JOptionPane.showMessageDialog(null, "Infantil A. ");           
            
            } else if ((idadeNadador == 8) || (idadeNadador <= 10)){
               
                // exibi essa mensagem
              JOptionPane.showMessageDialog(null, "Infantil B. "); 
              
            } else if ((idadeNadador == 11) || (idadeNadador <= 13)){
               
                // exibi essa mensagem
              JOptionPane.showMessageDialog(null, "Juvenil A. "); 
              
            } else if ((idadeNadador == 14) || (idadeNadador <= 17)){
               
                // exibi essa mensagem
              JOptionPane.showMessageDialog(null, "Juvenil B. "); 
              
            } else if ((idadeNadador == 18) || (idadeNadador <= 25)){
               
                // exibi essa mensagem
              JOptionPane.showMessageDialog(null, "Sênior. "); 
              
            } else {
                
            // exibi essa mensagem
              JOptionPane.showMessageDialog(
                  null, "Idade fora da faixa etária"); 
              
            }
           
            
        // informa ao usuário se deseja ou não continuar
        desejaContinuar = JOptionPane.showInputDialog(
             null, "Se Deseja continuar, digite:\n"
            + "S -> sim ou N -> não : ").charAt(0);
        
        }
    }            
}
       


    

    
    

