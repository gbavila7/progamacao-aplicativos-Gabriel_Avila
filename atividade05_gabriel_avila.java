/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade05_gabriel_avila;
import java.util.Scanner;
import java.lang.Math; 

/**
 *
 * @author Aluno
 */
public class Atividade05_gabriel_avila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1
        //int n,i;
        
        //i = 0;
        //System.out.print("Insira um número: ");
        //n = entrada.nextInt();
        
        //while (i<=n){
        //    System.out.print(i);
        //    i++;
        //}
        
        //2
        //int n,quantidade,soma;
        
        //soma = 0;
        //quantidade = 0;
        
        //System.out.print("Insira o valor de N(ou -1 para kitar): ");
        //n = entrada.nextInt();
        
        //while (n != -1) {
        //    soma += 1;
        //    quantidade++;
            
        //    System.out.print("Insira o valor de M(ou -1 para kitar): ");
        //    m = entrada.nextInt();
            
        //    System.out.print("O valor da soma é: "+soma);
        //    System.out.print("A quantidade de vezes executáveis: "+quantidade);
        //}
        
        //3
        //String senha,senhaC;
        
        //senhaC = "Java123";
        
        //System.out.print("Digite a senha:");
        //senha = entrada.nextLine();
        
        //while (!senha.equals(senhaC)) {
        //    System.out.print("Erro");
        //    System.out.print("Insira a senha novamente:");
        //    senha = entrada.nextLine();
        //}
        
        //4
        //int opcao = 1,num1,num2,soma;
        //while (opcao!=0) {
            //System.out.println("------MENU------");
            //System.out.println("1 - Somar");
            //System.out.println("2 - Subtrair");      
            //System.out.println("3 - Multiplicar");
            //System.out.println("0 - Sair");
            //opcao = entrada.nextInt();
            //switch (opcao) {
                //case 1:
                    //System.out.print("Digite um número:");
                    //num1 = entrada.nextInt();
                    //System.out.print("Digite outro número:");
                    //num2 = entrada.nextInt();
                    //soma = num1+num2;
                    //System.out.print("A soma dos valores é:"+soma);
                    //break;
                //case 2:
                    //System.out.print("Digite um número:");
                    //num1 = entrada.nextInt();
                    //System.out.print("Digite outro número:");
                    //num2 = entrada.nextInt();
                    //soma = num1-num2;
                    //System.out.print("A soma dos valores é:"+soma);
                    //break;                    
                //case 3:
                    //System.out.print("Digite um número:");
                    //num1 = entrada.nextInt();
                    //System.out.print("Digite outro número:");
                    //num2 = entrada.nextInt();
                    //soma = num1*num2;
                    //System.out.print("A soma dos valores é:"+soma);
                    //break;
                //case 0:
                    //System.out.print("Você saiu do sistema.");
                    
            //}
        //}
        
        //5
        /*int n,f,i;
        
        System.out.print("Insira um valor inteiro:");
        n = entrada.nextInt();
        i = 1;
        f = 1;
        
        while (i<=n) {
            f *= i;
            i++;
            
            System.out.print("O fatorial de "+n+" é:" +f);
        
        }
        */
        
        //6
        /*int n,f0,f1,proximo;
        
        System.out.print("Digite N:");
        n = entrada.nextInt();
        
        f0 = 0;
        f1 = 1;
        proximo = f0+f1;
        
        while (proximo<=n){
            System.out.print("," + proximo);
            f0=f1;
            f1=proximo;
            proximo=f0+f1;
        }*/
        
        //7
       /*int n,i;
        
        System.out.print("Insira um número maior que 2: ");
        n = entrada.nextInt();
               
        while (n % 2 == 0) {
            System.out.print("Não é um número primo.");
            System.out.print("Insira um número maior que 2: ");
            n = entrada.nextInt();
        }
        System.out.print("Primo");*/
       
       //8
       /*int n,soma;
        
        soma = 0;
        
        System.out.print("Insira o valor de N(ou numero negativo para kitar): ");
        n = entrada.nextInt();
        
        while (n != -1) {
            soma += n;
            
            System.out.print("O valor da soma é: "+soma);
            System.out.print("Insira o valor de M(ou -1 para kitar): ");
            n = entrada.nextInt();

        }*/
       
       //9
       /*int n,i,soma;
        
       soma = 0;
       i = 0;
       System.out.print("Insira o valor de N: ");
       n = entrada.nextInt();
       
       while (n <= 0 || n>=0) {
           soma += 1;
           i++;
           
            System.out.print("Insira o valor de N: ");
            n = entrada.nextInt();
            
            System.out.print("O valor da soma é: "+soma);
            System.out.print("A quantidade de vezes executáveis: "+i);
       }*/
       
       //10
       /*int n,par,impar;
       
       System.out.print("Insira um número maior que 0: ");
       n = entrada.nextInt();
       
       par = n/2;
       impar = 3*n+1;
       
       while (n>0){
           if (n % 2 == 0) {
               par = n/2;
               System.out.print("O valor da formula do número par é: "+par);
           }else{
               impar = 3*n+1;
               System.out.print("O valor da formula do número impar: "+impar);
           }
           
           System.out.print("Insira um número maior que 0: ");
           n = entrada.nextInt();          
           
       }*/
       
    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            