/*
 * Leia uma temperatura em graus Celsius 
   e apresentá-la convertida em graus Fahrenheit. 
   Afórmula de conversão é:F=(9*C+160)/ 5, sendo F a temperatura em Fahrenheit
   e C a temperatura em Celsius;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios07_Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        float grausFahrenheit;
        float grausCelsius;
        
       
       //ler dados do aluno
       grausCelsius = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite a temperatura em graus Celsius:"));
       
        
        // FAZER A CONVERSÃO DE CELSIUS PARA FAHRENHEIT
        grausFahrenheit =  (grausCelsius * 1.8f) + 32;
        
        
        // exibir o resultado de forma simples
        System.out.println("A temperatura em graus Celsius é: " 
            +grausCelsius+ ", e a temperatura em graus Fahrenheit é: "
                +grausFahrenheit);
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, 
        "A temperatura em graus Celsius é: " 
            +grausCelsius+ ", e a temperatura em graus Fahrenheit é: "
                +grausFahrenheit);
        
        

    }
    
}
