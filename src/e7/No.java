
package e7;


class No
   {
   private String nome;    
   private String palavra; 
   private No next;              // referência para o próximo item da lista
// -------------------------------------------------------------
   public No(String n, String p) // metodo construtor
      {
      this.nome = n;                            // inicializa os dois atributos do No
      this.palavra = p;                         // o No next a principio fica como null
      }                 
// -------------------------------------------------------------
   public void displayNo()      // mostra os valores do proprio nó
      {
      System.out.print("{" + nome + ", " + palavra + "} ");
      }
   
   public void setNext(No n){
       next = n;
   }
   
   public No getNext(){
       return next;
   }   
   }  // fim da classe nó
////////////////////////////////////////////////////////////////