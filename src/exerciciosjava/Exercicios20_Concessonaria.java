/*
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
   Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros.
   O desconto deverá ser calculado de acordo com o ano do veículo. 
   Até 2000 - 12% e acima de 2000 - 7%. 
   O sistema deverá perguntar se deseja continuar calculando desconto até que
   a resposta seja: “(N) Não”.
   Informar total de carros com ano até 2000 e total geral;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios20_Concessonaria {
    
    public static void main(String[] args) {
        
        // variáveis para salvar oa dados digitados pelo cliente
        float valorCarro;
        int anoCarro;
    
        // 
        float valorPorcentagem;
        float valorPagar;
    
        // variável para salvar o total de carros
        int totalCarro2000 = 0;
        int totalCarro = 0;
    
        // variável para para ou não as perguntas
        char desejaContinuar = 's';
    
        //fazer um while, pegando várias vezes esses dados do usuário
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
    
            // pergunta varias vezes ao cliente
            for(int i = 0; i < 2; i++ ){
        
        
                valorCarro = Float.parseFloat(JOptionPane.showInputDialog(
                 "Digite o valor do veiculo:"));
        
                anoCarro = Integer.parseInt(JOptionPane.showInputDialog(
                 "Digite o ano do carro, quatro digitos:"));
        
                //
                if(anoCarro <= 2000){
                    valorPorcentagem = (12 * valorCarro) / 100 ;
                    valorPagar = valorCarro - valorPorcentagem;
                    JOptionPane.showMessageDialog(
                     null, "O valor real do carro é: "+valorCarro+
                    " e o valor de desconto será: "+valorPorcentagem+
                    " o valor do carro total será: "+valorPagar);
            
                    totalCarro2000++;
            
                } else if(anoCarro > 2000){
                    valorPorcentagem = (7 * valorCarro ) / 100;
                    valorPagar = valorCarro - valorPorcentagem;
                    JOptionPane.showMessageDialog(
                     null, "O valor real do carro é: "+valorCarro+
                    " e o valor de desconto será: "+valorPorcentagem+
                    " o valor do carro total será: "+valorPagar);
            
                    totalCarro++;
            
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
        System.out.println("O total de carros do ano 2000 ou menos é: "
                +totalCarro2000);
        
        System.out.println("O total de carros acima do ano 2000, é : "
                +totalCarro);
            
    
        }
    
    
    }
    
    
}
