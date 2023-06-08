/*
 * Dados três valores A, B e C, em que A e B são números reais 
   e C é um caractere, 
   pede-se para imprimir o resultado da operação de A por B se C for um símbolo 
   de operador aritmético; caso contrário deve ser impressa uma mensagem de 
   operador não definido. Tratar erro de divisão por zero;
 */
package exerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios31_Operador_Aritmetico {
    
    public static void main(String[] args) {
        // variáveis para salvar os dados digitados pelo cliente
        int numeroA;
        int numeroB;
        char aritmetico;
       
        
        // variável usada para repetir ou não
        char desejaContinuar = 's';
       
        // repetição 
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            // pegar dados do usuário
            numeroA = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o número A: "));
            
            numeroB = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o número B: "));
            
            aritmetico = JOptionPane.showInputDialog("Digite o caractere da operação que deseja realizar: ").charAt(0);
            
            //fazer as verificações
            if (aritmetico == '+'){
                
                // fazer o cálculo de soma
                int resultado = numeroA + numeroB;
                
                System.out.println("O resultado é: "+resultado);
                
                JOptionPane.showMessageDialog(
                        null, "O resultado é: "+resultado);
              
            } else if (aritmetico == '-'){
                
                // fazer o cálculo de subtração
                int resultado = numeroA - numeroB;
                
                System.out.println("O resultado é: "+resultado);
                
                JOptionPane.showMessageDialog(
                        null, "O resultado é: "+resultado);
            
            } else if (aritmetico == '/'){
                
                // fazer o cálculo de divisão
                int resultado = numeroA / numeroB;
                
                System.out.println("O resultado é: "+resultado);
                
                JOptionPane.showMessageDialog(
                        null, "O resultado é: "+resultado);
                
            } else if (aritmetico == '*'){
                
                // fazer o cálculo da multiplicação
                int resultado = numeroA * numeroB;
                
                System.out.println("O resultado é: "+resultado);
                
                JOptionPane.showMessageDialog(
                        null, "O resultado é: "+resultado);
                    
            } else {
                
                System.out.println(" Operador não definido.");
                
                JOptionPane.showMessageDialog(
                        null, " Operador não definido.");
            }
            
            
            
            
        // informa ao usuário se deseja ou não continuar
        desejaContinuar = JOptionPane.showInputDialog(
             null, "Se Deseja continuar, digite:\n"
            + "S -> sim ou N -> não : ").charAt(0);
        
        }
                
    }
       
}

    

    
    

