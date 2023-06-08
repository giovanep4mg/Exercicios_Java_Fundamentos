/*
 * Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.
   Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
   
   Tipo de Cliente Valor do KW/h

   a. (Residência) 0,60;
   b. (Comércio) 0,48;
   c. (Indústria) 1,29.

 */
package exerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios35_Calcular_Kwv_luz {
    
    public static void main(String[] args) {
        
        // variáveis para guarda os dados do usuário de gasto de KWH
        double gastoKWH;
        
        // variaveis dos clientes com os valores
        double residencia = 0.60;
        double comercio = 0.48;
        double industria = 1.29;
        
        // variáveis para salvar o local indicado
        int local;
        
         // variável usada para repetir ou não
        char desejaContinuar = 's';
       
        // repetição 
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            // pega o valor da conta de luz do usuário
            gastoKWH = Double.parseDouble(
                JOptionPane.showInputDialog(
                     "Digite o valor em KWH da sua conta de luz: "));
            
            // Opções de locais para fazer os cálculos
            local = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha de onde é a sua conta de luz: \n"
                    + " 1_Residência. \n"
                    + " 2_Comércio. \n"
                    + " 3_Industria "));
            
            // 
            switch(local){
                case 1:
                    // fazer os cálculos para uma residência
                    double resultado = gastoKWH * residencia;
                    
                    // exibir resultado
                    JOptionPane.showMessageDialog(
                null, "O valor da conta de luz será: "+resultado);
                    
                    break;
                case 2:
                    // fazer os cálculos para o comércio
                    double resultado1 = gastoKWH * comercio;
                    
                    // exibir resultado
                    JOptionPane.showMessageDialog(
                null, "O valor da conta de luz será: "+resultado1);
                    
                    break;
                case 3:
                    // fazer os cálculos para a industria
                    
                    double resultado2 = gastoKWH * industria;
                    
                    // exibir resultado
                    JOptionPane.showMessageDialog(
                null, "O valor da conta de luz será: "+resultado2);
                    break;
                default:
                
            }
           
            
        // informa ao usuário se deseja ou não continuar
        desejaContinuar = JOptionPane.showInputDialog(
             null, "Se Deseja continuar, digite:\n"
            + "S -> sim ou N -> não : ").charAt(0);
        
        }
    }            
}
       


    

    
    

