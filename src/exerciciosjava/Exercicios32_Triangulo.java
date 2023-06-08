/*
 * Escreva um algoritmo que leia três valores inteiros 
   e verifique se eles podem ser os lados de um triângulo. 

   Se forem, informar qual o tipo de triângulo que eles formam: 
   equilátero, isóscele ou escaleno.
   
   Propriedade: 
   o comprimento de cada lado de um triângulo é menor do que a soma dos 
   comprimentos dos outros dois lados.

   a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
   b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
   c. Triângulo equilátero é também isóscele;
   d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
 */
package exerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios32_Triangulo {
    
    public static void main(String[] args) {
        // variáveis para salvar os dados digitados pelo cliente
        int ladoA;
        int ladoB;
        int ladoC;
       
        
        // variável usada para repetir ou não
        char desejaContinuar = 's';
       
        // repetição 
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            // pegar dados do usuário
            ladoA = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um valor para o lado A: "));
            
            ladoB = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um valor para o lado B: "));
            
            ladoC = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um valor para o lado C: "));
            
            
            
            //fazer as verificações se os lados são iguais, diferentes...
            if ( (ladoA == ladoB) && (ladoB == ladoC) && (ladoC == ladoA) ){
                
                //exibi o resultado
                System.out.println("É um triângulo Equilátero que também é um Isóscele.");
                
                JOptionPane.showMessageDialog(
                        null, "É um triângulo Equilátero.");
              
            } else if ( (ladoA == ladoB) && (ladoB != ladoC) && (ladoA != ladoC) ){
              
                //exibi o resultado
                System.out.println("É um Triângulo Isóscele.");
                
                JOptionPane.showMessageDialog(
                        null, "É um triângulo Equilátero.");
              
            
            } else if ( (ladoA != ladoB) && (ladoB != ladoC) && (ladoC != ladoA) ){
                
                //exibi o resultado
                System.out.println("É um triângulo Equilátero.");
                
                JOptionPane.showMessageDialog(
                        null, "É um Triângulo Escaleno.");
              
                
            } else {
                
                // fazer o cálculo da multiplicação
                 System.out.println("Digitou algo errado");
                
                JOptionPane.showMessageDialog(
                        null, "Digitou algo errado");
            }    
                    
        // informa ao usuário se deseja ou não continuar
        desejaContinuar = JOptionPane.showInputDialog(
             null, "Se Deseja continuar, digite:\n"
            + "S -> sim ou N -> não : ").charAt(0);
        
        }
    }            
}
       


    

    
    

