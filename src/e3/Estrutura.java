/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e3;

/**
 *
 * @author Fabio
 */
public class Estrutura {
    private int nElems;
    private Animais[] a;
    
    public Estrutura(int max){
        a = new Animais[max];
        nElems = 0;        
    }
    //--------------------------------------
    //busca por nome
    //--------------------------------------   
    public int buscaNome(String searchkey)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getNome().equals(searchkey))
            return curIn;
         else if(lowerBound > upperBound)
            return nElems;
         else
            {
            if(a[curIn].getNome().compareTo(searchkey) < 0)
               lowerBound = curIn + 1;
            else
               upperBound = curIn - 1;
            }  
         }  
      }
    //--------------------------------------------------
    //------- Ordenação por tamanho (InsertSort)
    //--------------------------------------------------
    public void ordenaTamanho(){
        int in, out;
        
        for(out=1;out<nElems;out++){
         Animais temp = a[out];   
         in = out;
         while(in>0 && a[in-1].getTamanho() >= temp.getTamanho()){
         a[in] = a[in-1];
         in--;
         }
         a[in] = temp;
        }
    }
    //--------------------------------------------------
    //------- Busca Binária por Cor
    //--------------------------------------------------
    public boolean buscaCor(String searchkey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        
        while(true){
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn].getCor().equalsIgnoreCase(searchkey)){
                for (int i = curIn; (a[i].getCor().equalsIgnoreCase(searchkey)); i++) { 
                 a[i].displayAnimais();
                 System.out.println("==============================================");
                 if (i == (nElems-1))
                     break;
                }
            if (curIn ==0)
                 return true;
             
             for (int j = curIn-1; (a[j].getCor().equals(searchkey)); j--) {
                   a[j].displayAnimais();
                 System.out.println("==============================================");
                 if (j == 0)
                     break;     
             }   
             return true;
         }
         else if(lowerBound > upperBound)
            return false;
         else                       
            {
            if(a[curIn].getCor().compareTo(searchkey) < 0) 
               lowerBound = curIn + 1;
            else
               upperBound = curIn - 1;
            }       
        }
        
    }
    
    //--------------------------------------------------
    //------- Busca Binária por Tamanho
    //--------------------------------------------------

       public boolean buscaTamanho(double searchkey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        
        while(true){
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn].getTamanho() == searchkey){
                for (int i = curIn; (a[i].getTamanho() == searchkey); i++) { 
                 a[i].displayAnimais();
                 System.out.println("==============================================");
                
                 if (i == (nElems-1))
                     break;
             }
            if (curIn ==0)
                 return true;

             for (int j = curIn-1; (a[j].getTamanho() == searchkey); j--) {
                   a[j].displayAnimais();
                 System.out.println("==============================================");
                  
                 if (j == 0)
                     break;
             }           
         
            return true;        
        }
         else if(lowerBound > upperBound)
            return false;
         else
         {
             if(a[curIn].getTamanho() < searchkey)
               lowerBound = curIn + 1;
             else
               upperBound = curIn - 1;
         }
    }
}
    
    //--------------------------------------------------
    //------- Inserção Ordenada por cor
    //--------------------------------------------------
    public void Insere(String nome, String cor, double tamanho){
     int i;
        for(i=0;i<nElems;i++)
         if(a[i].getCor().compareTo(cor) > 0)
             break;
     for(int k=nElems; k>i; k--)
         a[k] = a[k-1];
        a[i] = new Animais(nome, cor, tamanho);                  // insere o elemento na posição necessária
      nElems++;
    }
    //--------------------------------------------------------------
//Método de remoção por nome....
//--------------------------------------------------------------
  
    public boolean remove(String value)
      {
      int j = buscaNome(value);           //Utiliza a busca binária para remover!!!
      if(j==nElems)                  // caso não encontre, retorna false!
         return false;
      else                           // caso encontre...
         {
         for(int k=j; k<nElems; k++) // move os elementos uma posição pra tras
            a[k] = a[k+1];
         nElems--;                   // decrementa o tamanho
         return true;
         }
      }
   
    
    //--------------------------------------------------
    //------- Visualização de Animais
    //--------------------------------------------------
    public void display(){
        for(int i=0;i<nElems;i++)
            a[i].displayAnimais();
    }
    
    //--------------------------------------------------
    //------- Quantidade de itens 
    //--------------------------------------------------
    public int size(){
        return nElems;
    }
}
