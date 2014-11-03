/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e7;

/**
 *
 * @author aleaguado traduzido de Robert Lafore
 */
////////////////////////////////////////////////////////////////
class ListaDeNosApp
   {
   public static void main(String[] args)
      {
      ListaDeNos theList = new ListaDeNos();  // criamos uma nova lista

      theList.insertFirst("Joao", "Andrea");      // inserimos quatro itens nela
      theList.insertFirst("Jose", "Ana");
      theList.insertFirst("Aline", "Paulo");
      theList.insertFirst("Carlos", "Carla");

      theList.displayList();              // mostramos a lista

      while( !theList.isEmpty() )         // until it's empty,
         {
         No aLink = theList.deleteFirst();   // deletamos o primeiro nó da lista e colocamos em aLink
         System.out.print("Deletado ");         // 
         aLink.displayNo();                     // mostramos o nó deletado
         System.out.println("");
         }
      theList.displayList();              // mostramos a lista
      }  // final do método main()
   }  // final da classe usuária
////////////////////////////////////////////////////////////////

