/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade07_gabriel_avila;
import java.util.Scanner;
import java.lang.Math; 

/**
 *
 * @author Aluno
 */
public class Atividade07_gabriel_avila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1
        //int[][]array=new int[4][4];
        //for (int lin=0;lin<array.length;lin++){
            //for(int col=0;col<array[lin].length;col++){
          //  System.out.print("digite um numero inteiro");
        //array[lin][col]=entrada.nextInt();
       
        //2
     
      //  int[] vetor = new int[8];

        // Preencher o vetor
     //   for (int i = 0; i < vetor.length; i++) {
         //   System.out.print("Insira o " + (i + 1) + "° valor: ");
          //  vetor[i] = entrada.nextInt();
      //  }

        // Inicializar o maior valor e sua posição
        //int maior = vetor[0];
       // int posicao = 0;

       
      //  for (int i = 1; i < vetor.length; i++) {
        //    if (vetor[i] > maior) {
        //        maior = vetor[i];
         //       posicao = i; // armazenar a posição do maior valor
       //    }
     //  }

      //  // Mostrar os valores do vetor
     //  System.out.print("\nValores digitados: ");
     //   for (int i = 0; i < vetor.length; i++) {
       //     System.out.print(vetor[i] + " ");
     //   }

        // Exibir o maior valor e sua posição
    //    System.out.println("\n\nMaior valor: " + maior);
    //    System.out.println("Posição do maior valor: " + posicao);
//
     //   entrada.close();
   // }
//}

      //3
      //int[] vetor1 = new int[5];
      // int[] vetor2 = new int[5];

       
     //  for (int i = 0; i < vetor1.length; i++) {
       //   System.out.print("Insira o " + (i + 1) + "° valor: ");
         //   vetor1[i] = entrada.nextInt();}
           
           
           // for (int b = 0; b < vetor2.length; b++) {
         /// System.out.print("Insira o " + (b + 1) + "° valor: ");
        //    vetor2[b] = entrada.nextInt();}
           
       //   System.out.print("\nVetor1: ");
       // for (int i = 0; i < vetor1.length; i++) {
       //     System.out.print(vetor1[i] + " ");
      //  }

      //  System.out.print("\nVetor2: ");
    //    for (int i = 0; i < vetor2.length; i++) {
          //  System.out.print(vetor2[i] + " ");
      //  }
     
      //4
     
      //double[] vetor = new double[20];
   // double soma = 0;
      //  double media;
//
       
     //  for (int i = 0; i < vetor.length; i++) {
       //  System.out.print("Insira o " + (i + 1) + "° valor: ");
        //   vetor[i] = entrada.nextDouble();
        //   soma+= vetor[i];}
       
       
    //   media=soma/vetor.length;
       
      //  System.out.print("a média é"+media);
       //  for (int i = 0; i < vetor.length; i++) {
         // if (vetor[i] < media) {
    //  System.out.println("esse numero é menor que a media "+vetor[i]);
        //  }        
       //  }
         
       //5
     
      // String senha;
       
       
      // do{
       //    System.out.print("digite uma senha  valida (minimo 8 digitos: ) ");
        //   senha=entrada.nextLine();
        //   if (senha.length()>8){
        //   int faltam=8-senha.length();
        //   System.out.print("a sua senha precisa de: "+faltam);}
           
     //  } while(senha.length()<8);
     //  System.out.print("Senha Válida");
       
     //  if (senha.length()>8){
      ///    int faltaam=8-senha.length();
      // }
       
       
      //6
     
     
   
       // System.out.print("Digite uma frase: ");
     //  String frase = entrada.nextLine();

      //  int vogais = 0, consoantes = 0, espacos = 0, outros = 0;
//
     //   for (int i = 0; i < frase.length(); i++) {
      //      char ch = frase.charAt(i);
//
        //    if ("aeiouAEIOU".indexOf(ch) != -1) {
          //      vogais++;
         //   } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
         //       consoantes++;
         //   } else if (ch == ' ') {
         //       espacos++;
         //   } else {
         //       outros++;
         //   }
      //  }

     // /  System.out.println("Vogais: " + vogais);
     ///   System.out.println("Consoantes: " + consoantes);
     //   System.out.println("Espaços: " + espacos);
       // System.out.println("Outros: " + outros);
       
       
       //7
       
      // String texto;
      //  int quantidade = 0;

      //  System.out.print("Digite uma frase: ");
      //  texto = entrada.nextLine();

      //  int encontrar_palavra = texto.indexOf("java");

       // while (encontrar_palavra >= 0) {
       //     System.out.println("Encontrada a palavra na posição: " + encontrar_palavra);
        //    quantidade++;
//
        //    encontrar_palavra = texto.indexOf("java", encontrar_palavra + 1);
     //   }

     //   if (quantidade == 0) {
     //       System.out.println("Palavra não encontrada.");
     //   } else {
       //     System.out.println("Quantidade de ocorrências: " + quantidade);
       // }

       
       
       //8
        /*String nomeUsuario;
        String usuarioCorreto = "yurilindo";
        int tentativas = 3;
        boolean acessoConcedido = false;

        do {
            System.out.print("Digite o nome de usuário: ");
            nomeUsuario = entrada.nextLine();

            if (nomeUsuario.equals(usuarioCorreto)) {
                System.out.println("Usuário correto. Acesso concedido.");
                acessoConcedido = true;
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Usuário incorreto. Tentativas restantes: " + tentativas);
                } else {
                    System.out.println("Usuário incorreto. Você excedeu o máximo de tentativas. Conta bloqueada.");
                }
            }
        } while (tentativas > 0);

       
             
        }

       
    }
        
    }
    
}*/
