package desafio1_2_gabriel_avila;

public class Desafio1_2_gabriel_avila {
    public static class ContaBancaria {
        public Double saldo;
        public Double saldo_dolar;
        
         public ContaBancaria(Double saldo, Double saldo_dolar) {
            this.saldo = saldo;
            this.saldo_dolar = saldo_dolar;
        }
         
        public void depositar(Double valor) {
            saldo += valor;
        }
        
        public void comprarDolar(Double qtdUsd, Double custoReais) {
            
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
        
    }
    
    public static class SimularEmprestimo {
        public Double jurosParcela = 0.02;
        public int[] permitidas = {6,12,18,24,30,36,40,48,56,60,72};
    }
    
    
    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100.0,0.0);
        ServicoCambio cambio = new ServicoCambio(5.32);
        ExtratoBancario extrato = new ExtratoBancario(10);
        SimularEmprestimo simulador = new SimularEmprestimo();
        
        
    }
    
}
