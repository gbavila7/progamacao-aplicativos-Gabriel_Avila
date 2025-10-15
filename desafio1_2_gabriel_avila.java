package desafio1_2;
import java.util.Scanner;

public class Desafio1_2 {
    public static class ContaBancaria {
        public Double saldo;
        public Double saldo_dolar;
        public ExtratoBancario extrato;
        
         public ContaBancaria(Double saldo, Double saldo_dolar, ExtratoBancario extrato) {
            this.saldo = saldo;
            this.saldo_dolar = saldo_dolar;
            this.extrato = extrato;
        }
         
        public void depositar(Double valor) {
            saldo += valor;
            extrato.registrar(new Movimentacao("Depósito (+)", valor));
        }
        
        public void comprarDolar(Double qtdUsd, Double custoReais) {
            saldo -= custoReais;
            saldo_dolar += qtdUsd;
            
            extrato.registrar(new Movimentacao("Compra de Dólar: - R$" + String.format("%.2f", custoReais) + " | US$" + qtdUsd, custoReais));
        }
    }
    
    public static class ServicoCambio {
        public Double cotacao;
        
         public ServicoCambio(Double cotacao) {
             this.cotacao = cotacao;
        }
        
        public Double custoReais(Double qtdUsd){
            return qtdUsd*cotacao;
        }
    }
    
    public static class Movimentacao {
        public String texto;
        public Double valor;
        
         public Movimentacao (String texto, Double valor){
             this.texto = texto;
             this.valor= valor;
         }
    }
    
    public static class ExtratoBancario {
        public int capacidade;
        public int proximo;
        public int i; 
        public Movimentacao[] itens;
         
         public ExtratoBancario (int capacidade) {
             this.capacidade = capacidade;
             this.proximo = 0;
             this.i = 0;
             this.itens = new Movimentacao[capacidade];
        }     
        
        public void registrar(Movimentacao m) {
            itens[proximo] = m;
            proximo = (proximo+1) % capacidade;
            
            if (i < capacidade) {
                i++;
            }
        } 
        
        
        public boolean vazio() {
            return i==0;
        }
        
        public void imprimir() {
            if (vazio()) {
                System.out.println("\nNenhuma movimentação registrada.");
            } else {
                System.out.println("\n=== Extrato Bancário ===");
                for (int j = 0; j < i; j++) {
                    Movimentacao m = itens[j];
                    System.out.println((j + 1) + " - " + m.texto + " | Valor: R$" + String.format("%.2f", m.valor));
                }
            }           
        }       
    }
        
    public static class SimularEmprestimo {
        public Double jurosParcela = 0.02;
        public int[] permitidas = {6,12,18,24,30,36,40,48,56,60,72};
        
        public boolean parcelaValida (int p) {
            for (int parcela : permitidas) {
                if (p == parcela) {
                    return true;
                }
            }
            return false;    
        }
       
        
        public Double parcelaFinal (Double emprestimo, int qtd) {
            return (emprestimo/qtd) * 0.2;
        }
        
        public Double totalComJuros  (Double emprestimo, int qtd) {
            return emprestimo + (jurosParcela*qtd);
        }
    }
    
    
    
    public static void main(String[] args) {
        
        ExtratoBancario extrato = new ExtratoBancario(10);
        ContaBancaria conta = new ContaBancaria(100.0,0.0,extrato);
        ServicoCambio cambio = new ServicoCambio(5.32);
        SimularEmprestimo simulador = new SimularEmprestimo();
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        Double valor;
        String voltar;
        
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
                    System.out.println("\nSaldo em reais: R$ " + conta.saldo);
                    System.out.println("Saldo em dólares: US$ " + conta.saldo_dolar);
                    
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    voltar = entrada.nextLine().toUpperCase();

                    if (voltar.equals("E")) {
                        opcao = 0;
                    }
                    break;

                case 2:
                    System.out.print("\nInforme o valor do depósito (em reais): R$ ");
                    valor = entrada.nextDouble();
                    entrada.nextLine();
                    
                    if (valor <= 0.00 || valor > 5000.00) {
                        System.out.println("O depósito deve ser maior que R$0,00 e até R$5.000,00.");
                    }else{
                        conta.depositar(valor);
                        System.out.println("Depósito realizado com sucesso!");
                    }    
                    
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    voltar = entrada.nextLine().toUpperCase();
                    
                    if (voltar.equals("E")) {
                        opcao = 0;
                    }
                    break;

                case 3:
                    
           
                case 4:
                    
                
                case 5:
                    
                    
                case 0:
                    System.out.println("Encerrando o atendimento. Obrigado por utilizar o Caixa rápido.");

            }

        } while (opcao != 0);
    }
    
}

