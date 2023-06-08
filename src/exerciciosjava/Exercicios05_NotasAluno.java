/*
 * Escreva um algoritmo que leia o nome de um aluno 
   e as notas das três provas que ele obteve no semestre. 
   No finalinformar o nome do aluno e a sua média (aritmética);
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios05_NotasAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        String nomeAluno;
        int provaMat, provaPort, provaHist;
        int media;
       
       //ler dados do aluno
       nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
       provaMat = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da prova de Matemática:"));
       provaPort = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da prova de Português:"));
       provaHist = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da prova de História:"));
        
        // CALCULAR A MÉDIA DO ALUNO
        media = (provaHist + provaMat + provaPort) / 3;
        
        
        // exibir o resultado de forma simples
        System.out.println("O aluno : " +nomeAluno+" teve a média de: " +media);
        
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, "O aluno: " +nomeAluno+ " teve a média de: "+media);
        
        

    }
    
}
