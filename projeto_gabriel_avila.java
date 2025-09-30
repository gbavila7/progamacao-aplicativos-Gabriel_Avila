/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_gabriel_avila;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
/**
 *
 * @author Aluno
 */
public class Projeto_gabriel_avila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int opcao;
        int i_extrato;
        double saldo_reais = 100.00;
        double saldo_dolar = 0.00;
        double deposito;

        do{
            System.out.print("===== CAIXA RÁPIDO =====");
            System.out.print("1 - Saldo");
            System.out.print("2 - Depósito");
            System.out.print("3 - Extrato");
            System.out.print("4 - Simular Empréstimo");
            System.out.print("0 - Sair");
        
           System.out.print("Digite uma opção:");
           opcao = entrada.nextInt(0);
           
           switch (opcao) {
               case 1:
                   System.out.print("Saldo em reais: R$"+saldo_reais);
                   System.out.print("Saldo em dólares: US$"+saldo_dolar);
               case 2:
                   System.out.print("Informe o valor do depósito (em reais): R$");
                   deposito = entrada.nextDouble();
                   
                   if(deposito <= 0.00 && deposito >= 5000.00) {
                       System.out.print("O depósito deve ser maior que R$0,00 e até R$5.000,00. Digite novamente.");
                       System.out.print("Informe o valor do depósito (em reais): R$");
                       deposito = entrada.nextDouble();
                   }else{
                       System.out.print("Depósito realizado com sucesso!");
                   }
               case 3:
                   System.out.println("Últimas 10 movimentações:");
                   
                   if (i_extrato == 0){
                       System.out.print("Nenhum extrato registrado.");
                   }else{
                       
                   }
                   
           }
        }
        
    }
    
}
