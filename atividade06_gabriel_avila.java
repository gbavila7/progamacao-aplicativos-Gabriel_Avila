/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade06_gabriel_avila;
import java.util.Scanner;
import java.lang.Math; 
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade06_gabriel_avila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //1
        /*int nota;
        nota = 0;
        
        do{
            System.out.print("Digite uma nota de 0 a 10:");
            nota = entrada.nextInt();
        }while (nota>10); 
        System.out.print("Nota válida: "+nota);*/
        
        //2
        /*int num,soma,quantidade;
        double media;
        soma = 0;
        quantidade = 0;
                
        do {
            System.out.print("Insira um número inteiro:");
            num = entrada.nextInt();
            
            if (num>0) {
                soma += num;
                quantidade++;               
            }
        }while (num > 0);
        media = soma / quantidade;
        System.out.println("Soma total: " +soma);
        System.out.println("Quantidade de números digitados: "+quantidade);
        System.out.print("Média:"+media);*/
        
        //3
        /*int num,quantidade,p;
        quantidade = 0;     
        num = (int)(Math.random()*100)+1;
        
        do {
           System.out.print("Insira um palpite sobre o número:");
           p = entrada.nextInt();
           
           if (p>num){
               System.out.println("O seu palpite é muito alto!");
               quantidade++;
           }
           if (p<num){
               System.out.println("O seu palpite é muito baixo!");
               quantidade++;
           }
        }while(p!=num);
        System.out.print("Acertou em "+quantidade+" tentativas!");*/
        
        //4
        /*int n;
        String repetir = "s";
        
        do{
            System.out.println("Digite N(>0): ");
            n = entrada.nextInt();
            entrada.nextLine();
            
            if (n>0){
                for(int i=0;i<n;i++){
                    System.out.print(n-i);
                }
                
                System.out.println("Repetir? (s/n): ");
                repetir = entrada.nextLine();
            }            
        }while(n<=0 || repetir.equals("s"));*/
        
        //5
        //int t_max,restantes,t_feitas;
       // String tentativa;
        //String senhaC = "senai123";
        
        //t_feitas = 0;
        //t_max = 3;
        
        //do {
          //  System.out.print("Insira a senha:");
          //  tentativa = entrada.nextLine();
            
           // if (tentativa.equals(senhaC)) {
          //      System.out.print("A senha está correta, acesso concedido!");
          //  }else{
          //      t_feitas++;
          //      restantes = t_max - t_feitas;
                
          //      if (restantes > 0) {
            //        System.out.print("Incorreta. Tentativas restantes:" +restantes);
          //      }else{
            //        System.out.print("Acesso bloqueado.");
          //      }
                
       //     }
      //  }while(t_feitas<t_max)
      
      //6              
          //    System.out.print("digite o número para ver a tabuada:");
          //   int n = entrada.nextInt();
              
          //    for (int i = 1; i <= 10; i++){
          //        System.out.println(n + "x" + i + "=" + (n * i));
              //}
            //entrada.close();
            
            
            //7
            
         //  int n = entrada.nextInt();
         //  int somapares = 0;
         //  int somaimpares = 0;
           
         //  for (int i = 1; i <= n; i++){
         //      if (i % 2 == 0){
         //          somapares += i;
         //      } else {
         //          somaimpares += i;
         //      }
          // }
           
         // System.out.println("soma dos pares:" + somapares);
         // System.out.println("soma dos impares:" + somaimpares);
          
          //entrada.close();
           
          
          //8
          //int N;
          //System.out.print("digite um número maior que 1:")
                  //n = en.nextInt();
                  //if (n<=1){
                 //     System.out.print("número inválido!");
                  //}else{
                    //  for (int i = 1; i <= n; i++) {
                   //   System.out.println(i);
                 // }
      //  }

      //  en.close();
   // }
