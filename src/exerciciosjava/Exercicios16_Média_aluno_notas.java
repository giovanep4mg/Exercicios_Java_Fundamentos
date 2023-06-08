/*
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
   Calcular a sua média (aritmética), informar o nome 
   e sua menção aprovado (media >= 7),
   Reprovado (media <= 5) 
   e Recuperação (media entre 5.1 a 6.9);
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios16_Média_aluno_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variável
        float notaA;
        float notaB;
        float notaC;
        String nomeAluno;
        
        // PEGAR O NOME DO ALUNO
        nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        
        
        // e dos impostos aplicados 
        notaA = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite a nota A :"));
        notaB = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite a nota B :"));
        notaC = Float.parseFloat(JOptionPane.showInputDialog(
             "Digite a nota C :"));
        
        // calcular a media do aluno
        float media = (notaA + notaB + notaC) / 3;
        
        // verificar se o número recebido é maior que  10 ou não, e executa uma ação
        if(media >= 7){
            // exibir o resultado de forma simples
            System.out.println(nomeAluno+ " Foi Aprovado sua média foi => "+media);
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
             nomeAluno+ " Foi Aprovado sua média foi => "+media);
            
        } else if (media <= 5){
            // exibir o resultado de forma simples
            System.out.println(nomeAluno+ " Foi Reprovado sua média foi => "+media);
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
             nomeAluno+ " Foi Reprovado sua média foi => "+media);
            
        } else if  ((media >=  5.1 ) || (media <= 6.9)){
            // exibir o resultado de forma simples
            System.out.println(nomeAluno+ " Foi Recuperação sua média foi => "+media);
        
            // exibir uma caixa de mensagem
            JOptionPane.showMessageDialog(null, 
             nomeAluno+ " Foi Recuperação sua média foi => "+media);
            
        }
        
        
        
        
        

    }
    
}
