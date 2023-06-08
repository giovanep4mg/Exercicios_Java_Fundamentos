/*
 * Faça um algoritmo que receba dois números 
   e ao final mostre a soma, subtração,
   multiplicação e a divisão dos dois números lidos;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios02_Operacoes_Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
        
        // variáveis
        int num1;
        int num2;        
        
        // pegar dados do usuário
        num1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número: "));
        
    System.out.println("========================= SOMA ====================");
        // Soma dos números recebidos
        int resultadoSoma = num1 + num2 ;
        
        // exibir de forma simples
        System.out.println("O resultado da soma é: " +resultadoSoma+ "!");
        
    System.out.println("========================= SUBTRAÇÃO ===================="); 
        // Subtração dos números recebidos
        int resultadoSub = num1 - num2 ;
        
        // exibir de forma simples
        System.out.println("O resultado da subtração é: " +resultadoSub+ "!");
    
    System.out.println("========================= MULTIPLICAÇÃO ===================="); 
        // Multiplicação dos números recebidos
        int resultadoMulti = num1 * num2 ;
     
        // exibir de forma simples
       System.out.println("O resultado da multiplicação é: " +resultadoMulti+ "!");
        
    System.out.println("========================= DIVISÃO ===================="); 
        // Multiplicação dos números recebidos
        int resultadoDiv = num1 / num2 ;
        
        // exibir de forma simples
        System.out.println("O resultado da divisão é: " +resultadoDiv+ "!");
        
    System.out.println("========================= RESULTADO ====================");    
        // exibir o resultado da soma dos números recebidos caixa de mensagem
        JOptionPane.showMessageDialog(null,"O resultado da soma é: " +resultadoSoma+ "!");
        JOptionPane.showMessageDialog(null,"O  resultado da subtração é: " +resultadoSub+ "!");
        JOptionPane.showMessageDialog(null,"O  resultado da divisão é: " +resultadoDiv+ "!");
        JOptionPane.showMessageDialog(null,"O  resultado da multiplicação é: " +resultadoMulti+ "!");
        
        
        
        
        
           

    }
    
}
