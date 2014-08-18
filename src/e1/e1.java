/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */

 class EstruturaAvancada{
      private String[] a;
      private int nElems;
      private String nomeBusca;
      
 public EstruturaAvancada(String palavra){
    a = new String[5];
    nElems = 0;
}
//------------------------------------------------
//Método Busca!!
//------------------------------------------------
public boolean busca(String nomeBusca){
    
    nElems = 5;
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
public void insere(int i, String nome){
    Scanner scan = new Scanner(System.in);
    nome = scan.nextLine();
    for(i=0;i<nElems;i++)
        a[i] = nome;
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
   
   
}
