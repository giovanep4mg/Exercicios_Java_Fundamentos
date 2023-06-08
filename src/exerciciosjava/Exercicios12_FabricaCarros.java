/*
 * O custo de um carro novo ao consumidor é 
   a soma do custo de fábrica mais o percentual do distribuidor
   e dos impostos aplicados 
   (primeiro os impostos são aplicados sobre o custo de fábrica,
   e depois o percentual do distribuidor sobre o resultado). 

   Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, 

   escreva um algoritmo que leia o custo de fábrica de um carro 
   e informe o custo ao consumidor do mesmo;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios12_FabricaCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // percentual do distribuidor seja de 28%
        float percentualDistribuidor = 28.0f;
        
        // impostos 45%
        float impostos = 45.0f;
        
        // leia o custo de fábrica de um carro digitado pelo usuário
        float custoFabrica;
        
        // salva os dados para depois ser exibido 
        float valorVenda;
        
    // custo de um carro novo
        // a soma do custo de fábrica mais o percentual do distribuidor
        // e dos impostos aplicados 
        custoFabrica = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite o valor do custo de fábrica:"));
        
        // os impostos são aplicados sobre o custo de fábrica
        float calcularImpostos = (impostos * custoFabrica ) / 100 ;
        
        // percentual do distribuidor sobre o resultado
        float dist = (percentualDistribuidor * custoFabrica) / 100;
        
        //
        valorVenda = custoFabrica + calcularImpostos + dist;
        
        // exibir o resultado de forma simples
        System.out.println("O valor do custo ao consumidor: " +valorVenda);
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, 
        "O valor do custo ao consumidor: " +valorVenda);
        
        

    }
    
}
