/*
 * Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
   Calcule o seu novo salário reajustado. 

   Escrever o nome do funcionário, o reajuste e seu novo salário. 
   Calcule quanto à empresa vai aumentar sua folha de pagamento;

  a. 50% para aqueles que ganham menos do que três salários mínimos;
  b. 20% para aqueles que ganham entre três até dez salários mínimos;
  c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
  d. 10% para os demais funcionários.
 */
package exerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios28_ReajusteSalarioEmpresa {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        // variáveis para salvar os dados digitados pelo cliente
        String nomeFuncionario;
        double salario;
        double salarioMinimo;
       
        
        // variável usada para repetir ou não
        char desejaContinuar = 's';
       
        // repetição 
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            // pegar dados do usuário
            nomeFuncionario = JOptionPane.showInputDialog(
                    "Digite seu nome: ");
            
            salario = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite o seu salário: "));
            
            salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite o valor do salário minimo: "));
            
            //
            double novoSalario = 0;
            
            // variável para guarda o aumento da folha de pagamento
            double aumentoFolha = 0;
            
            //fazer as verificações
            if (salario < 3 * salarioMinimo) {
                // calcular aumento de 50 por cento
                novoSalario = salario * 1.5; 
                // salva o aumento
                aumentoFolha = novoSalario - salario;
                
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            
            novoSalario = salario * 1.2; // Aumento de 20%
            
            aumentoFolha = novoSalario - salario;
        
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            
            novoSalario = salario * 1.15; // Aumento de 15%
            
            aumentoFolha = novoSalario - salario;
        
        } else {
            
            novoSalario = salario * 1.1; // Aumento de 10%
            
            aumentoFolha = novoSalario - salario;
        }
        
        // Imprima o nome do funcionário, o reajuste e o novo salário
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: " + (novoSalario - salario));
        System.out.println("Novo salário: " + novoSalario);
        
        JOptionPane.showMessageDialog(
                null, "Nome do funcionário: " + nomeFuncionario);
        
        JOptionPane.showMessageDialog(
                null, "Reajuste: " + (novoSalario - salario));
        
        JOptionPane.showMessageDialog(
                null, "Novo salário: " + novoSalario);
        
        // Imprima o aumento na folha de pagamento da empresa
        System.out.println("Aumento na folha de pagamento: " + aumentoFolha);
        
        JOptionPane.showMessageDialog(
         null, "Aumento na folha de pagamento: " + aumentoFolha);
        
        /*
        // encerrar a repetição
        System.out.println("Se Deseja continuar, digite:\n"
                + "S -> sim ou N -> não : ");
        desejaContinuar = ler.next().charAt(0);
        */
        
        desejaContinuar =JOptionPane.showInputDialog(
             null, "Se Deseja continuar, digite:\n"
            + "S -> sim ou N -> não : ").charAt(0);
          
                
        }
       
    }
}
    

    
    

