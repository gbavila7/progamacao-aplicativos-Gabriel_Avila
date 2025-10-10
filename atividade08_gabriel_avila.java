/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade08_gabriel_avila;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Atividade08_gabriel_avila {
    //1
    /*public double calcula_delta(int a,int b,int c){
        double calc =(Math.pow(b,2)-(4*a*c));
            return calc;
    }*/
    
    //2
    /*public int soma(int n1,int n2) {
        return n1+n2;
    }
    public int subtracao(int y,int z) {
        return y-z;
    }

    public int multiplicacao(int x,int n) {
        return x*n;
    }    

    public double divisao(int a,int b) {
        return a/b;
    }*/    
    
    //3
    //a
    /*public String mes (int n) {
        return switch (n) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês inválido";
        }*/
    
    //b
        /*String[] mesExtenso = new String[12];
        mesExtenso[0] = "Janeiro";
        mesExtenso[1] = "Fevereiro";
        mesExtenso[2] = "Março";
        mesExtenso[3] = "Abril";
        mesExtenso[4] = "Maio";
        mesExtenso[5] = "Junho";
        mesExtenso[6] = "Julho";
        mesExtenso[7] = "Agosto";
        mesExtenso[8] = "Setembro";
        mesExtenso[9] = "Outubro";
        mesExtenso[10] = "Novembro";
        mesExtenso[11] = "Dezembro";
        
        if (n >= 1 && n <= 12) {
            return mesExtenso[n-1];
        }else{
            return "Mês inválido";
        }
    }*/
    
    //4
    /*public void fun(int n, String salario) {
     for (int i = 0; i < n; i++) {
         System.out.println("- Funcionário "+ (i+1) + ": "+ salario );
     }*/
    
    //5
    /*public void peso_individuos(double[] pesos, Scanner entrada) {
        for (int i = 0; i<pesos.length; i++) {
            pesos[i] = entrada.nextDouble();
        }
    }
    
    public int menorP(double[] pesos) {
        int pos = 0;
        for (int i = 1; i < pesos.length; i++) {
            if (pesos[i] < pesos[pos]) {
            pos = i;
            }
        }
        return pos;
    } */   
    
    //6
    public 
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        //1
       /*Atividade08_gabriel_avila equacao = new Atividade08_gabriel_avila();
       System.out.print("dada a equação de 2° grau -3x2+4x-2=0, qual o resultado para x1 e x2?");
       double d=equacao.calcula_delta(-3,4,2);
       double x1= -4+Math.sqrt(d)/2*(-3);
       double x2= -4-Math.sqrt (d)/(2* (-3));*/
        
        //2
        /*int opcao, num1, num2, y, z, x, n, a, b;
        double resultado;
        System.out.print("Calculadora \n1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão\n0 - Sair\n");
        
        System.out.print("Insira uma opção:");
        opcao = entrada.nextInt();
        
        Atividade08_gabriel_avila calculadora = new Atividade08_gabriel_avila();
        switch (opcao){
            case 1:
                System.out.print("Digite um número inteiro: ");
                num1 = entrada.nextInt();
                System.out.print("Digite outro número inteiro: ");
                num2 = entrada.nextInt();
                resultado = calculadora.soma(num1,num2);
                System.out.printf("A soma de %d e %d é %.2f",num1,num2,resultado);
            case 2:
                System.out.print("Digite um número inteiro: ");
                y = entrada.nextInt();
                System.out.print("Digite outro número inteiro: ");
                z = entrada.nextInt();
                resultado = calculadora.subtracao(y, z);
                System.out.printf("A subtração de %d e %d é %.2f",y,z,resultado);
                
            case 3:
                System.out.print("Digite um número inteiro: ");
                x = entrada.nextInt();
                System.out.print("Digite outro número inteiro: ");
                n = entrada.nextInt();       
                resultado = calculadora.multiplicacao(x, n);
                System.out.printf("A multiplicação de %d e %d é %.2f",x,n,resultado);
                
            case 4:
                System.out.print("Digite um número inteiro: ");
                a = entrada.nextInt();
                System.out.print("Digite outro número inteiro: ");
                b = entrada.nextInt();       
                resultado = calculadora.divisao(a, b);
                System.out.printf("A divisão de %d e %d é %.2f",a,b,resultado);
                
            case 0:
                System.out.print("Encerrando o sistema.");
         }*/
        
        //3:
        /*System.out.print("Insira um número: ");
        int n = entrada.nextInt();

        Atividade08_gabriel_avila objeto = new Atividade08_gabriel_avila();
        String mesExtenso = objeto.mes(n);
        
        System.out.println("Mês correspondente: " + mesExtenso);*/
        
        //4
        /*int salario = 1800;

        System.out.print("Insira o número de funcionários: ");
        int n = entrada.nextInt();
        
        double media = 1800*n/n;
        
        Atividade08_gabriel_avila objeto = new Atividade08_gabriel_avila();
        objeto.fun(n, "1800");
        
        if (salario > media) {
            System.out.print("Salários maiores que a média: ");
        }else {
            System.out.print("Nenhum funcionário com o salário maior que a média(Média salarial "+media+":");
        }*/
        
        //5
        /*double[] pesos = new double[10];
        Atividade08_gabriel_avila obj = new Atividade08_gabriel_avila();
        
        System.out.println("Digite os 10 pesos:");
        obj.peso_individuos(pesos, entrada);
        
        int posicaoMenor = obj.menorP(pesos);

        System.out.println("A posição do menor peso é: " + posicaoMenor);*/

        
    }
 }

