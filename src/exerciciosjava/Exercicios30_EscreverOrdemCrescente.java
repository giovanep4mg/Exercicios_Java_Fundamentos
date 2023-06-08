/*
 * Escreva um algoritmo que leia três valores inteiros distintos 
   e os escreva em ordem crescente;
 */
package exerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios30_EscreverOrdemCrescente {
    
    public static void main(String[] args) {
        // variáveis para salvar os dados digitados pelo cliente
        int numero1;
        int numero2;
        int numero3;
       
        
        // variável usada para repetir ou não
        char desejaContinuar = 's';
       
        // repetição 
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            // pegar dados do usuário
            numero1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o número A: "));
            
            numero2 = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o número B: "));
            
            numero3 = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o número C: "));
            
            //fazer as verificações
            if ((numero1 > numero2) && (numero1 > numero3) && (numero2 > numero3) ){
                
                System.out.println("Os números digitados foram: \n"
                  +numero1+"-"+numero2+"-"+numero3+"\n"
                      + "Em Ordem Crescente: "+numero1+"-"+numero2+"-"+numero3);
                
                JOptionPane.showMessageDialog(
                        null, "Os números digitados foram: \n"
                 +numero1+"-"+numero2+"-"+numero3+"\n"
                     + "Em Ordem Crescente: "+numero1+"-"+numero2+"-"+numero3);
              
            } else if ((numero2 > numero3) && (numero2 > numero1) && (numero3 > numero1)){
                
                System.out.println("Os números digitados foram: \n"
                    +numero1+"-"+numero2+"-"+numero3+"\n"
                        + "Em Ordem Crescente: "+numero2+"-"+numero3+"-"+numero1);
                
                JOptionPane.showMessageDialog(
                        null, "Os números digitados foram: \n"
                    +numero1+"-"+numero2+"-"+numero3+"\n"
                        + "Em Ordem Crescente: "+numero2+"-"+numero3+"-"+numero1);
            
            } else {
                
                System.out.println("Os números digitados foram: \n"
                    +numero1+"-"+numero2+"-"+numero3+"\n"
                        + "Em Ordem Crescente: "+numero3+"-"+numero2+"-"+numero1);
                
                JOptionPane.showMessageDialog(
                        null, "Os números digitados foram: \n"
                    +numero1+"-"+numero2+"-"+numero3+"\n"
                        + "Em Ordem Crescente: "+numero3+"-"+numero2+"-"+numero1);
            }
            
            
            
            
        // informa ao usuário se deseja ou não continuar
        desejaContinuar = JOptionPane.showInputDialog(
             null, "Se Deseja continuar, digite:\n"
            + "S -> sim ou N -> não : ").charAt(0);
        
        }
                
    }
       
}

    

    
    

