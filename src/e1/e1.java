/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */

 class EstruturaAvancada{
      private String[] a;
      private int nElems;
      
      
 public EstruturaAvancada(int max){
    a = new String[max];
    nElems = 0;
}
//------------------------------------------------
//Método Busca!!
//------------------------------------------------
public boolean busca(String nomeBusca){
    
    nomeBusca = JOptionPane.showInputDialog("Digite nome que você quer buscar");
    
    
    int j;
    for(j=0;j<nElems;j++)
        if(nomeBusca.charAt(0) == a[j].charAt(0))
            break;
    if(j == nElems)
         return false;
    else
         return true;
}
//------------------------------------------------
//Método Insere!!
//------------------------------------------------
public void insere(String nome){
    a[nElems] = nome;
    nElems++;
}
//--------------------------------------------------------------
//Método de remove!!
//--------------------------------------------------------------
   public boolean delete(String nome)
      {
      int j;
      for(j=0; j<nElems; j++)        // varre o vetor 
         if(nome.equals(a[j]))
            break;
      if(j==nElems)                  // se não encontrar retorna falso
         return false;
      else                           // se encontrar ...
         {
         for(int k=j; k<nElems; k++) // move os mais altos para "frente"
            a[k] = a[k+1];
         nElems--;                   // decrementa o contador de elementos
         return true;
         }
      }
   //--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
   public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         System.out.print(a[j] + " ");  
      System.out.println("");
      }
   //---------------------------------------------------------------
   //
   //---------------------------------------------------------------
   public boolean displayFirst(String letter)             // mostra o conteúdo do vetor
  {  
    boolean retorno = false;
    for(int j=0; j<nElems; j++)    {  
      if (letter.charAt(0) == a[j].charAt(0)) {
          System.out.print(a[j] + " ");  
          System.out.println("");
          retorno = true;
      }
    }
    return retorno;   
   }
}
public class e1 {
    public static void main(String[] args)
          {
              int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              EstruturaAvancada arr = new EstruturaAvancada(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              System.out.println("Bem Vindo ao Programa de Vetores!!!");
              for (int i = 1; i < 6; i++) {
                 System.out.println("Digite o nome " + i);
                 arr.insere(entrada.nextLine());
              }

              System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma letra");

              if (!arr.displayFirst(entrada.nextLine()))
                  System.out.println("Não encontrado nenhum nome!!");
              
              System.out.println("Digite um nome para buscar:");
              
              if (arr.busca(entrada.nextLine()))
                    System.out.println("Encontrei!!!");
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
