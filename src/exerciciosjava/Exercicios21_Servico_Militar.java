/*
 * Escreva algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde)
   e informe se está apta ou não para cumprir o serviço militar obrigatório. 
   Informe os totais;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios21_Servico_Militar {
    
    public static void main(String[] args) {
        
        // variáveis para salvar oa dados digitados pelo cliente
        String nome;
        String saude;
        char sexo;
        int idade;
        
        // guarda totais
        int apto = 0;
        int naoApto = 0;
        
    
        // variável para para ou não as perguntas
        char desejaContinuar = 's';
    
        //fazer um while, pegando várias vezes esses dados do usuário
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
    
            // pergunta varias vezes ao cliente
            for(int i = 0; i < 2; i++ ){
        
        
                nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        
                idade = Integer.parseInt(JOptionPane.showInputDialog(
                 "Digite a sua idade: "));
                
                saude = JOptionPane.showInputDialog(
                        "Digite o estado da sua saúde ( boa/ruim): ");
                
                sexo = JOptionPane.showInputDialog(
                     "Digite o seu sexo ( F / M ): ").charAt(0);
        
                //
                if((saude == "Boa" || saude == "boa") && (idade >= 18) ){
                    System.out.println(
                         "Você está apto a servi no Serviço Militar! ");
                    
                    JOptionPane.showMessageDialog(null,
                        "Você está apto a servi no Serviço Militar!");
            
                    apto++;
                } else if((saude == "Ruim" || saude == "ruim") && (idade < 18)){
                    System.out.println(
                      "Você NÃO está apto a servi no Serviço Militar! ");
                    
                    JOptionPane.showMessageDialog(null,
                      "Você NÃO está apto a servi no Serviço Militar! ");
            
                    naoApto++;
            
                } else {
                    JOptionPane.showMessageDialog(
                     null, "Digitou algo errado!!");
                }
        }
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
    
        // exibir totais de carros
        System.out.println("O total de pessoas aptas a servir é: "
                +apto);
        
        System.out.println("O total de pessoas NÃO aptas a servir é : "
                +naoApto);
            
    
        }
    
    
    }
    
    
}
