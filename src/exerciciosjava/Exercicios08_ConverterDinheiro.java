/*
 * Elabore um algoritmo que efetue a apresentação do valor 
   da conversão em real (R$) de um valor lido em dólar (US$).
   O algoritmo deverá solicitar o valor da cotação do dólar e 
   também a quantidade de dólares disponíveis com o usuário;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios08_ConverterDinheiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        float dinheiroDolar;
        float cotacaoDolar;
        float dinheiroReal;
        
       
       // pegar o valor em dolar do usuário
       dinheiroDolar = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite quantos dolares você tem:"));
       
       // pegar a cotação para fazer os calculos depois
       cotacaoDolar= Float.parseFloat(JOptionPane.showInputDialog(
             "Digite a cotação do dolar"));
       
        
        // FAZER A CONVERSÃO DE CELSIUS PARA FAHRENHEIT
        dinheiroReal = dinheiroDolar * cotacaoDolar;
        
        
        // exibir o resultado de forma simples
        System.out.println("O valor que tenho em dolar é: " 
                +dinheiroDolar+ " , convertendo em real será:  "  
                +dinheiroReal+ " reais.");
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, 
        "O valor que tenho em dolar é: " 
                +dinheiroDolar+ " , convertendo em real será:  " +dinheiroReal+" reais.");
        
        

    }
    
}
