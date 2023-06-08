/*
 * A escola “APRENDER” faz o pagamento de seus professores por hora/aula.

   Faça um algoritmo que calcule e exiba o salário de um professor. 
   
   Sabe-se que o valor da hora/aula segue a tabela abaixo:
 
   a. Professor Nível 1 R$12,00 por hora/aula;
   b. Professor Nível 2 R$17,00 por hora/aula;
   c. Professor Nível 3 R$25,00 por hora/aula.
 */
package exerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios33_EscolaAPRENDER {
    
    public static void main(String[] args) {
        
        // variáveis para salvar os dados do valor da hora/aula
        double professorNivel_1 = 12.00;
        double professorNivel_2 = 17.00;
        double professorNivel_3 = 25.00;
        
        // guarda as horas trabalhadas
        double horasTrabalhadas;
        
        // inicializa o menu, que vai guarda as opções
        int menu = 0;
       
        
        // variável usada para repetir ou não
        char desejaContinuar = 's';
       
        // repetição 
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            // pega os valores das horas trabalhadas
            horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
            
            // exibe um menu sobre os niveis dos professores
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha o nível do professor: \n"
                    + " 1_Professor Nível 1 \n"
                    + " 2_Professor Nível 2 \n"
                    + " 3_Professor Nível 3 \n"));
            
            // menu de opções 
            switch(menu){
                case 1:
                    // faz o cálculo das horas trabalhadas vezes o valor das horas
                    double result = horasTrabalhadas * professorNivel_1;
                    
                    // exibi o resultado
                    JOptionPane.showMessageDialog(null, "O salário desse professor será: "+result);
                    
                    break;
                case 2:
                    
                    // faz o cálculo das horas trabalhadas vezes o valor das horas
                    double result1 = horasTrabalhadas * professorNivel_2;
                    
                    // exibi o resultado
                    JOptionPane.showMessageDialog(null, "O salário desse professor será: "+result1);
                    
                    break;
                case 3:
                    
                    // faz o cálculo das horas trabalhadas vezes o valor das horas
                    double result2 = horasTrabalhadas * professorNivel_3;
                    
                    // exibi o resultado
                    JOptionPane.showMessageDialog(null, "O salário desse professor será: "+result2);
                    
                    break;
                case 4:
                    
                    // encerrar o programa
                    System.exit(0);
                    
                    // exibi o resultado
                    JOptionPane.showMessageDialog(null, "Finalizando o programa. ");
                    
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
       


    

    
    

