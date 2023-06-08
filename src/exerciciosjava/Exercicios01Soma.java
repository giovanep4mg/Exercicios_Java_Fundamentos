/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios01Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
        
        // variáveis
        int num1;
        int num2;
        int resultado;
        
        // pegar dados do usuário
        num1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número: "));
        
        //fazer a soma dos números recebidos
        resultado = num1 + num2 ;
        
        // exibir o resultado
        JOptionPane.showMessageDialog(null, "O resultado da soma do número "
                +num1+" mais o número "
                +num2+" é: "+resultado);

    }
    
}
