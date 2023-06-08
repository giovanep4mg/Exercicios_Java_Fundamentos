/*
 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
   
   Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 

   Informe o valor de custo de cada produto, o valor de venda de cada produto,
   a média de preço de custo e do preço de venda;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios22_PrecoCusto_PrecoVenda {
    
    public static void main(String[] args) {
        
        // variáveis para salvar os dados digitados pelo cliente
        float precoCusto;
        float precoVenda;
        
        // mostrar resultados
        int Lucro = 0;
        int prejuizo = 0;
        int empate = 0;
        
        // informar ao usuário
        float valorCustoProduto = 0;
        float valorVendaProduto = 0;
        
        // médias dos preços
        float mediaPrecoCusto = 0;
        float mediaPrecoVenda = 0;
        int produtos = 0;
       
        // variável para para ou não as perguntas
        char desejaContinuar = 's';
    
        //fazer um while, pegando várias vezes esses dados do usuário
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
    
            // pergunta varias vezes ao cliente, deveria ser 40 vezes
            for(int i = 0; i < 6; i++ ){
        
                // pegar os dados do usuário, sobre o preço de custo do produto
                precoCusto = Float.parseFloat(JOptionPane.showInputDialog(
                 "Digite o preço de custo do produto: "));
        
                // pegar os dados do usuário, sobre o preço de custo do produto
                precoVenda = Float.parseFloat(JOptionPane.showInputDialog(
                 "Digite o preço de Venda do produto: "));
                
        
                //fazer os calculos
                mediaPrecoCusto = valorCustoProduto / produtos;
                mediaPrecoVenda = valorVendaProduto / produtos;
                
                // fazer os cálculos
                if(precoCusto == precoVenda){
                    // salva na variável produtos
                    produtos++;
                    
                    // salva na variável empate
                    empate++;
                    
                    // salva o valor custo e de venda
                    valorCustoProduto++;
                    valorVendaProduto++;
                    
                    // exibi resultado do preço de custo e de venda
                    System.out.println(
                    "Você não teve lucro algum, teve empate."
                    + "\n O preço de custo foi: "+precoCusto+""
                    + "\n O preço de venda foi: "+precoVenda);
                    
           
                    
                    JOptionPane.showMessageDialog(null,
                        "Você não teve lucro algum, teve empate.");
            
                } else if( precoCusto < precoVenda){
                    // salva na variável produtos
                    produtos++;
                    
                    // salva na variável empate
                    Lucro++;
                    
                    // salva o valor custo e de venda
                    valorCustoProduto++;
                    valorVendaProduto++;
                    
                    System.out.println(
                      "Você teve Lucro nesse produto.");
                    
                    JOptionPane.showMessageDialog(null,
                      "Você teve Lucro nesse produto.");
                    
                    
                } else if(precoCusto > precoVenda) {    
                    // salva na variável produtos
                    produtos++;
                    
                    // salva na variável empate
                    empate++;
                    
                    // salva o valor custo e de venda
                    valorCustoProduto++;
                    valorVendaProduto++;
                    
                    
                    System.out.println(
                      "Você teve prejuizo nesse produto.");
                    
                    JOptionPane.showMessageDialog(null,
                      "Você teve prejuizo nesse produto.");
            
                } else {
                    JOptionPane.showMessageDialog(
                     null, "Digitou algo errado!!");
                }
                
                
        }
            //fazer os calculos
                mediaPrecoCusto = valorCustoProduto / produtos;
                mediaPrecoVenda = valorVendaProduto / produtos;
                
            // exibir as médias dos preços e de vendas
            System.out.println(""
                + "A média do preço de custo foi: "+mediaPrecoCusto+" reais."
                + "\n A média do preço de Venda foi: "+mediaPrecoVenda+" "
                            + "reais.");
                    
                    
            // exibi o resultado em uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
                "A média do preço de custo foi: "+mediaPrecoCusto+" reais."
                + "\n A média do preço de Venda foi: "+mediaPrecoVenda+" "
                            + "reais.");
                    
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
    
        }
    
    
    }
    
    
}
