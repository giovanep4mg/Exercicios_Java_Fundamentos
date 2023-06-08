/*
 * Faça um algoritmo que receba o número do mês e mostre o mês correspondente.
   Valide mês inválido;
 */
package exerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios29_MesNumero {
    
    public static void main(String[] args) {
        // variáveis para salvar os dados digitados pelo cliente
        int mesNumero;
       
        
        // variável usada para repetir ou não
        char desejaContinuar = 's';
       
        // repetição 
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            // pegar dados do usuário
            mesNumero = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o número do mês: "));
            
            //fazer as verificações
            if (mesNumero == 1) {
                // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Janeiro. ");
                
        } else if (mesNumero == 2) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Fevereiro. ");
        
        }else if (mesNumero == 3) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Março. ");
                
        }else if (mesNumero == 4) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Abril. ");        
        }else if (mesNumero == 5) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Maio. ");
                
        }else if (mesNumero == 6) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Junho. ");
        }else if (mesNumero == 7) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Julho. "); 
                
        }else if (mesNumero == 8) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Agosto. ");
             
        }else if (mesNumero == 9) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Setembro. ");    
                
        }else if (mesNumero == 10) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Outubro. ");
             
        }else if (mesNumero == 11) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Novembro. ");   
                
        }else if (mesNumero == 12) {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "O mês é Dezembro. ");  
                
        } else {
            
            // mostre o mês correspondente
                JOptionPane.showMessageDialog(
                        null, "Número inválido. ");
        
        }
        // informa ao usuário se deseja ou não continuar
        desejaContinuar = JOptionPane.showInputDialog(
             null, "Se Deseja continuar, digite:\n"
            + "S -> sim ou N -> não : ").charAt(0);
          
                
        }
       
    }
}
    

    
    

