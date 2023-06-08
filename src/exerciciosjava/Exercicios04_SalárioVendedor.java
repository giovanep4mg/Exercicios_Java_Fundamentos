/*
 * Escreva um algoritmo que leia o nome de um vendedor, 
   o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro)
   Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
   informar o seu nome, o salário fixo e salário no final do mês;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios04_SalárioVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        String nomeVendedor;
        float salario;
        int totalVendas;
        
        float comissao = 0.15f;
        
        
        
       //ler dados do vendedor
       nomeVendedor = JOptionPane.showInputDialog("Digite o nome do vendedor:");
       salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário do vendedor:"));
       totalVendas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de vendas desse vendedor:"));
        
        //conta
        float salarioComissao = totalVendas *  comissao;
        float salarioTotal = salarioComissao + salario;
        
        // exibir o resultado de forma simples
        System.out.println("O vendedor "+nomeVendedor+" tem o salário de: "
                +salario+" , somando com sua comissão vai receber: " 
                +salarioTotal);
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, "O vendedor "
                +nomeVendedor+" tem o salário de: "
                +salario+" , somando com sua comissão vai receber: " 
                +salarioTotal);
        
        
        
           

    }
    
}
