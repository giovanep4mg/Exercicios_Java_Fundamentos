/*
 * A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.

   Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.

   O desconto deverá ser calculado sobre o valor do veículo de acordo com o 
   combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com
 */
package exerciciosjava;

import java.io.Closeable;
import java.lang.ref.Cleaner;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercicios27_ConcessonariaCombustivel {
    
    public static void main(String[] args) {
        
        // variáveis para salvar os dados digitados pelo cliente
        float valorCarro;
        int combustivel;
        
        // valor desconto em porcentagens
        float gasolina = 21f;
        float alcool = 25f;
        float diesel = 14f;
       
      //  for(int i = 0; i < 10; i++){
            
        boolean repetir = true;
        
        // repetição
        while(repetir == true){
       
           
            // pega qual o combustivel o usuário prefere
                combustivel = Integer.parseInt(JOptionPane.showInputDialog(
                 " Escolha qual tipo de combustível você prefere:\n"
                         + " 1_Gasolina.\n"
                         + " 2_Álcool.\n"
                         + " 3_Diesel.\n"
                         + " 4_Encerrar o programa."));
                
                
            // pega o número digitado pelo usuário
            valorCarro = Float.parseFloat(
                 JOptionPane.showInputDialog(
                     "Digite o valor do veiculo: "));
             
           
                
            // fazer as verificações
                switch(combustivel){
                    case 1:
                        
                        float desconto = valorCarro * (gasolina / 100);
                        float valorTotal = valorCarro - desconto;
                        
                    JOptionPane.showMessageDialog
                    (null, "O valor do veiculo é: "+valorCarro+"\n"
                                + " O valor do desconto é: "+desconto+"\n"
                                + " O valor total do veiculo será: "+valorTotal);
                        
                        
                        break;
                    case 2:
                        desconto = valorCarro * (alcool / 100);
                        valorTotal = valorCarro - desconto;
                        
                    JOptionPane.showMessageDialog
                    (null, "O valor do veiculo é: "+valorCarro+"\n"
                                + " O valor do desconto é: "+desconto+"\n"
                                + " O valor total do veiculo será: "+valorTotal);
                        break;
                    case 3:
                        desconto = valorCarro * (diesel / 100);
                        valorTotal = valorCarro - desconto;
                        
                    JOptionPane.showMessageDialog
                    (null, "O valor do veiculo é: "+valorCarro+"\n"
                                + " O valor do desconto é: "+desconto+"\n"
                                + " O valor total do veiculo será: "+valorTotal);
                        break;
                    case 4:
                       // repeticao = false;
                        System.exit(combustivel);
                        System.out.println("Finalizando o programa.");
                      
                        repetir = false;
                        break;
                        
                    default:
                        repetir = false;
                }
            
        }
    }
    
}
    

    
    

