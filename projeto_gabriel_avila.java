/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_gabriel_avila;

import java.util.Scanner;
import java.util.Random;

public class Projeto_gabriel_avila {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String voltar, simular, s_n;
        int opcao, i_extrato = 0, parcelas, numero_aleatorio;
        double saldo_atual = 100.00, saldo_dolar = 0.00, deposito, emprestimo, salario_bruto, calc_parcela_juros, cotacao, quantidade;
        double valor_total, juros = 0.02, valor_parcela, calc_parcela, valor_total_juros, porcentagem_salario_bruto;
        String[]descricao = new String[10];
        Double[]valores = new Double[10];
        
        do {
            System.out.println("\n===== CAIXA RÁPIDO =====\n");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Extrato");
            System.out.println("4 - Simular Empréstimo");
            System.out.println("5 - Comprar Dólar");
            System.out.println("0 - Sair");

            System.out.print("\nDigite uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nSaldo em reais: R$ " + saldo_atual);
                    System.out.println("Saldo em dólares: US$ " + saldo_dolar);
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    voltar = entrada.nextLine().toUpperCase();

                    if (voltar.equals("E")) {
                        opcao = 0;
                    }
                    break;

                case 2:
                    System.out.print("\nInforme o valor do depósito (em reais): R$ ");
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
                        System.out.println("\nNenhuma movimentação registrada.");
                    } else {
                        for (int i = 0; i < i_extrato; i++) {
                            System.out.println((i + 1) + " - " + descricao[i]);
                        }
                    }

                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    voltar = entrada.nextLine().toUpperCase();
                    if (voltar.equals("E")) {
                        opcao = 0;
                    }
                    break;
           
                case 4:
                    System.out.print("\nInforme o valor do empréstimo (R$): R$");
                    emprestimo = entrada.nextDouble();
                    
                        while (emprestimo < 200.00 || emprestimo > 100000.00) {
                            System.out.println("O valor do empréstimo deve ser maior que R$200,00 e menor que R$100.000,00.");
                            System.out.print("Informe o valor do empréstimo (R$): R$");
                            emprestimo = entrada.nextDouble();
                        }
                    
                    System.out.print("Informe o seu salário bruto (R$): R$");
                    salario_bruto = entrada.nextDouble();
                    
                        while (salario_bruto <= 0) {
                            System.out.print("Valor inválido. Insira um valor maior que R$0,00: ");
                            salario_bruto = entrada.nextDouble();        
                        }
                    
                    System.out.print("Quantidade de parcelas (6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72): ");
                    parcelas = entrada.nextInt();
                    entrada.nextLine(); 

                        while (
                            parcelas != 6  && parcelas != 12 && parcelas != 18 && parcelas != 24 &&
                            parcelas != 30 && parcelas != 36 && parcelas != 40 && parcelas != 48 &&
                            parcelas != 56 && parcelas != 60 && parcelas != 72
                        ) {
                            System.out.println("Número de parcelas inválido.");
                            System.out.print("Digite um dos seguintes valores: 6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72: ");

                            while (!entrada.hasNextInt()) {
                                System.out.println("Entrada inválida. Digite um número inteiro.");
                                System.out.print("Quantidade de parcelas: ");
                            }

                            parcelas = entrada.nextInt();
                            entrada.nextLine(); 
                            }
                    
                    calc_parcela = emprestimo/parcelas;
                    calc_parcela_juros = emprestimo/parcelas*juros;
                    valor_parcela = calc_parcela;
                    valor_total = emprestimo*juros;
                    valor_total_juros = emprestimo*juros+emprestimo;
                    porcentagem_salario_bruto = 0.3*salario_bruto;
                    
                    System.out.println("\nValor da parcela: R$"+String.format("%.2f",calc_parcela+calc_parcela_juros)+" x "+parcelas);
                    System.out.println("Valor do empréstimo: R$"+emprestimo);
                    System.out.println("Valor total do empréstimo a ser pago: R$"+valor_total_juros);
                    
                    if ((calc_parcela + calc_parcela_juros) <= (0.3 * salario_bruto)) {
                        numero_aleatorio = random.nextInt(100000);
                        System.out.println("\nEmpréstimo disponível!");
                        System.out.println("Entre em contato com a central e informe o número de protocolo EM"+numero_aleatorio);
                        System.out.println("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                        voltar = entrada.nextLine().toUpperCase();

                         if (voltar.equals("E")) {
                          opcao = 0;
                         } 
                        } else {
                            System.out.println("Empréstimo indisponível! O valor da parcela não pode ultrapassar o valor de R$"+porcentagem_salario_bruto+".");
                        }
                    
                    break;
                
                case 5:
                    cotacao = 5.32;
                    do{
                        System.out.println("\nSaldo disponível em reais: "+saldo_atual);
                        System.out.print("Quantos dólares deseja comprar (US$)? ");
                        quantidade = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.println("Custo em reais: "+quantidade * cotacao);

                        if ((quantidade*cotacao) > saldo_atual) {
                            System.out.println("Seu saldo é insuficiente.");
                        } else {
                            System.out.print("Confirmar compra (s/n)?");
                            s_n = entrada.nextLine().toLowerCase();
                            
                            if (s_n.equals("s")) {
                                saldo_atual -= quantidade * cotacao; 
                                saldo_dolar += quantidade;                                
                                System.out.println("Compra realizada com sucesso.");
                                System.out.println("\nNovo saldo:");
                                System.out.println("- Reais: R$"+String.format("%.2f", saldo_atual));
                                System.out.println("- Dólares: US$"+quantidade);
                                
                                double valor_compra = quantidade * cotacao;
                                if (i_extrato < 10) {
                                    descricao[i_extrato] = "Compra de Dólar: - R$" + String.format("%.2f", valor_compra) + " | US$" + quantidade;;
                                    valores[i_extrato] = valor_compra;
                                    i_extrato++;
                                } else {
                                    for (int i = 1; i < 10; i++) {
                                        descricao[i - 1] = descricao[i];
                                        valores[i - 1] = valores[i];
                                    }
                                    descricao[9] = "Compra de Dólar: - R$" + String.format("%.2f", valor_compra) + " | US$" + quantidade;
                                    valores[9] = valor_compra;
                                }
                            }else {
                                System.out.println("Operação cancelada.");
                            }
                        }                   
                            
                        System.out.print("Deseja simular novamente (R), voltar ao menu (V) ou encerrar o programa (E)?");
                        simular = entrada.nextLine().toUpperCase();

                     } while (simular.equals("R"));

                        if (simular.equals("E")) {
                            opcao = 0;
                        }
                        
                        break;
                    
                case 0:
                    System.out.println("Encerrando o atendimento. Obrigado por utilizar o Caixa rápido.");

            }

        } while (opcao != 0);
    }
}
