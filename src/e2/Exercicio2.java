/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e2;

import java.util.Scanner;


/**
 *
 * @author Fabio
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int max = 100;            // coloca em uma constante o tamanho do vetor
              Estrutura arr = new Estrutura(max); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradaint = new Scanner (System.in);
              System.out.println("Bem Vindo ao Programa de Vetores!!!");
              
              for (int i = 1; i < 6; i++) {
                 System.out.println("Digite o nome " + i);
                 String nome = entrada.nextLine();
                 System.out.println("Digite a profissao do(a) " + nome);
                 String profissao = entrada.nextLine();
                 System.out.println("Digite a idade do(a) " + nome);
                 int idade = entradaint.nextInt();
                 arr.insert(nome, idade, profissao);
              }

              System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma letra");

              if (!arr.findAd(entrada.nextLine()))
                  System.out.println("Não encontrado nenhum nome!!");
              
              System.out.println("Digite um nome para buscar:");
              
              int posicao = arr.findByName(entrada.nextLine());
              
              if (posicao != arr.size())
                    System.out.println("Encontrei na posicao" + posicao );
              else
                    System.out.println("Não encontrado");
              
              System.out.println("Digite um nome ser removido:");
              
              if (arr.delete(entrada.nextLine()))   
                    System.out.println("Removido!!!");
              else  
                   System.out.println("Não encontrado!!!");  
              
              arr.display();
          }
}
