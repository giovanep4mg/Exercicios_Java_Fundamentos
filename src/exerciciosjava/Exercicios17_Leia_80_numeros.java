/*
 * Leia 80 números 
e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) 
   e 150 (inclusive);
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios17_Leia_80_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // números entre 10 e 150
        int numeroSeparados = 0;
        //números menores que 10
        int numerosMenores = 0;
        // números maiores que 150
        int numerosMaiores = 0;
        
        // variável
        int numeros = 0;
        
        
        // variável para verificação se deseja ou não continuar jogando
        char desejaContinuar = 's';
        
        //  faz um while, faz repetição até o usuário querer parar
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
        
        // ler 80 números
        int i = 0;
        for(; i < 10; i++){
            
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        }
        
        // fazer verificação se é menor ou igual a 10, se for salva na variável 
        if(numeros <= 10 ){
            numerosMenores = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            
         //fazer verificação se é maior ou igual a 150, se for salva na variável  
         if (numeros >= 150 )
            numerosMaiores = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
         
        //depois de feita as verificações, o que sobra será salvo nessa variável 
        } else {
            numeroSeparados = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        }
        
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
        
        // Exibir de forma simples o resultado
        System.out.println("os numeros que estao entre 10 e 150 são"
                + "esses: "+numeroSeparados);
       
        // Exibir caixa de mensagem
        JOptionPane.showMessageDialog(null, 
            "os numeros que estao entre 10 e 150 são esses: "+numeroSeparados);
        
        }
        
    }
    
}
