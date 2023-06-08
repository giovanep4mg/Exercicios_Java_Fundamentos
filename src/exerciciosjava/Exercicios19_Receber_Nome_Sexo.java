/*
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas 
   e informe o nome e se ela é homem ou mulher.
   No final informe total de homens e de mulheres;
 */
package exerciciosjava;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author giova
 */
public class Exercicios19_Receber_Nome_Sexo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //var para salvar o nome
        String nome;
        
        // variável para salvar o sexo dos usuários
        char sexo = 'f';
        
        //total de homens
        int totalHomens = 0;
        
        //total de mulheres
        int totalMulheres = 0;
        
         
        
        // variável para verificação se deseja ou não continuar adicionando dados
        char desejaContinuar = 's';
        
        //  faz um while, faz repetição até o usuário querer parar
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
            
        // irá fazer um for, começando do 1 até 11 vezes depois
        // pegando a idade dos usuário 
        
        // ler dados de 56 pessoas => "10" mas está lendo só 6
        int i = 0;
        for(; i < 6; i++){
            // pega o que foi digitado, e salva na variável nome
            nome = JOptionPane.showInputDialog("Digite seu nome: ");
            
            // pega o que foi digitado e salva na variável sexo
            sexo = JOptionPane.showInputDialog("Digite seu sexo; F / M:").charAt(0);
            
            
            // verifica, se é menor ou igual a 17 ou maior que isso, se for salva na variável 
        if( (sexo == 'F' ) ||(sexo == 'f') ){
             
            // exibi mensagem ao usuário sobre ser ou nao de maior e sua idade
            System.out.println(nome+" você é do sexo feminino. ");
            
            // exibi mensagem ao usuário sobre ser ou nao de maior e sua idade
            JOptionPane.showMessageDialog(null, 
            nome+" você é do sexo feminino. ");
            
            //
            totalMulheres++;
            
        //fazer verificação se é maior ou igual a 150, se for salva na variável  
        } else if ((sexo == 'm') || (sexo == 'M')) {
            
            // exibi mensagem ao usuário sobre ser ou nao de maior e sua idade
            System.out.println(nome+" você é do sexo masculino. ");
            
            // exibi mensagem ao usuário sobre ser ou nao de maior e sua idade
            JOptionPane.showMessageDialog(null, 
            nome+" você é do sexo masculino. ");
            
            //
            totalHomens++;
            
        } else {
            
            JOptionPane.showMessageDialog(null,
                    "Digitou algo errado!");
            
            System.out.println("Você digitou algo errado!");
            
        }
           
        }
        
        
        
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
        
        }
        // exibi o total de homens e mulheres
        System.out.println("O total de homens são: " +totalHomens+
            " e o total de mulheres são: "+totalMulheres);
        
        JOptionPane.showMessageDialog(null, 
        "O total de homens são: " +totalHomens+
                      " e o total de mulheres são: "+totalMulheres);
        
    }
    
}
