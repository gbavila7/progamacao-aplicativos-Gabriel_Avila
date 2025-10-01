/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_gabriel_avila;

import java.util.Scanner;

public class Projeto_gabriel_avila {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String voltar;
        int opcao, i_extrato = 0, parcelas;
        double saldo_atual = 100.00, saldo_dolar = 0.00, deposito, emprestimo, salario_bruto;
        String[]descricao = new String[10];
        Double[]valores = new Double[10];

        do {
            System.out.println("===== CAIXA RÁPIDO =====");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Extrato");
            System.out.println("4 - Empréstimo");
            System.out.println("0 - Sair");

            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo em reais: R$ " + saldo_atual);
                    System.out.println("Saldo em dólares: US$ " + saldo_dolar);
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    voltar = entrada.nextLine().toUpperCase();

                    if (voltar.equals("E")) {
                        opcao = 0;
                    }
                    break;

                case 2:
                    System.out.print("Informe o valor do depósito (em reais): R$ ");
                    deposito = entrada.nextDouble();
                    entrada.nextLine();

                    if (deposito <= 0.00 || deposito > 5000.00) {
                        System.out.println("O depósito deve ser maior que R$0,00 e até R$5.000,00.");
                    }else{
                        saldo_atual += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    }
                        if (i_extrato < 10) {
                            descricao[i_extrato] = "Depósito";
                            valores[i_extrato] = deposito;
                            i_extrato++;
                        } else {
                            for (int i = 1; i < 10; i++) {
                                descricao[i - 1] = descricao[i];
                                valores[i - 1] = valores[i];
                            }
                            descricao[9] = "Depósito";
                            valores[9] = deposito;
                        }
                    
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    voltar = entrada.nextLine().toUpperCase();

                    if (voltar.equals("E")) {
                        opcao = 0;
                    }
                    break;

                case 3:
                    if (i_extrato == 0) {
                        System.out.println("Nenhuma movimentação registrada.");
                    } else {
                        for (int i = 0; i < i_extrato; i++) {
                            System.out.println((i + 1) + " - " + descricao[i] + ": R$ " + String.format("%.2f", valores[i]));
                        }
                    }

                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    voltar = entrada.nextLine().toUpperCase();
                    if (voltar.equals("E")) {
                        opcao = 0;
                    }
                    break;
           
                case 4:
                    System.out.print("Informe o valor do empréstimo (R$): R$");
                    emprestimo = entrada.nextDouble();
                    
                    while (emprestimo < 200.00 || emprestimo > 100000.00) {
                        System.out.println("O valor do empréstimo deve ser maior que R$200,00 e menor que R$100.000,00.");
                        System.out.print("Informe o valor do empréstimo (R$): R$");
                        emprestimo = entrada.nextDouble();
                    }
                    
                    System.out.print("Informe o seu salário bruto (R$): R$");
                    salario_bruto = entrada.nextDouble();
                    
                    if (salario_bruto <= 0.00) {
                        System.out.print("Valor inválido. Insira um valor maior que R$0,00:");
                        salario_bruto = entrada.nextDouble();
                    }
                    
                    System.out.print("Quantidade de parcelas (6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72");
                    parcelas = entrada.nextInt();
                    
                case 0:
                    System.out.println("Encerrando o atendimento. Obrigado por utilizar o Caixa rápido.");
                    break;
            }

        } while (opcao != 0);
    }
}
