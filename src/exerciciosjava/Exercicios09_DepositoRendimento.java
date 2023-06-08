/*
 * Faça um algoritmo que receba um valor que foi depositado 
   e exiba o valor com rendimento após um mês.
   Considere fixo o juro da poupança em 0,07% a. m;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios09_DepositoRendimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis 
        float dinheiroDepositado;
        float juros = 0.7f;
        
       
       // pegar o valor, depositado pelo usuário
       dinheiroDepositado = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite o valor a ser depositado:"));
       
        // pega o valor depositado e  multiplica pelo juros
        float rendimento = dinheiroDepositado * juros;
       
        
        // exibir o resultado de forma simples
        System.out.println("O valor depositado foi: "
                +dinheiroDepositado+" mais o rendimento ficou: "
                +rendimento+" reais.");
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, 
        "O valor depositado foi: "
                +dinheiroDepositado+" mais o rendimento ficou: "
                +rendimento+" reais.");
        
        

    }
    
}
