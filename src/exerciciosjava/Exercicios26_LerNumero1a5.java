/*
 * Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso.
   Caso o usuário digite um número que não esteja neste intervalo, 
   exibir a seguinte mensagem: número inválido;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios26_LerNumero1a5 {
    
    public static void main(String[] args) {
        
        // variáveis para salvar os dados digitados pelo cliente
        int numero;
       
        // variável para para ou não as perguntas
        char desejaContinuar = 's';
    
        //fazer um while, depois do for vai pergunta se o usuário quer continuar
        while (desejaContinuar == 's' || desejaContinuar == 'S'){
    
            // fazer a repetição 5 vezes, pegando os dados
            for(int i = 0; i < 5; i++){
                // pega o número digitado pelo usuário
                numero = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite um número: "));
                
                // fazer as verificações
                if(numero == 1){
                    JOptionPane.showMessageDialog(
                     null, 
                         "Número => um. ");
                    
                } else if (numero == 2){
                    JOptionPane.showMessageDialog(
                     null, "Número => dois. ");
                   
                } else if (numero == 3){
                    JOptionPane.showMessageDialog(
                     null, "Número => três. ");
                } else if (numero == 4){
                    JOptionPane.showMessageDialog(
                     null, "Número => quatro. ");
                } else if (numero == 5){
                    JOptionPane.showMessageDialog(
                     null, "Número => cinco. ");
                } else {
                   JOptionPane.showMessageDialog(
                     null, "Número inválido!"); 
                } 
            }
        // Pergunta ao usuário se deseja ou não continuar
        System.out.println("Deseja continuar? S- SIM /N - NAO : ");
            desejaContinuar = JOptionPane.showInputDialog(
            "Deseja continuar? S- SIM /N - NAO : ").charAt(0);
            
           
    
        }
    
    
    }
    
    
}
