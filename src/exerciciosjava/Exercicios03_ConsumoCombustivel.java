/*
 * Escreva um algoritmo para determinar o consumo médio de um automóvel 
   sendo fornecida a distância total percorrida pelo automóvel 
    e o total de combustível gasto;
 */
package exerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios03_ConsumoCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        int consumoMédio;
        int distanciaPercorrida = 10000;
        int totalCombustivel = 500;
        
        //conta
        consumoMédio = distanciaPercorrida / totalCombustivel;
        
        // exibir o resultado
        System.out.println("A média do gasto foi: " +consumoMédio);
        
        
        
           

    }
    
}
