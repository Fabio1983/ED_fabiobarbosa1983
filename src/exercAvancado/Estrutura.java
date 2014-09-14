/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercAvancado;

/**
 *
 * @author Aluno
 */
public class Estrutura {
    private Jogador[] a;
    private int nElems;
    
    public Estrutura(int max){
        a = new Jogador[max];
        nElems = 0;
    }
    //------------------------------------------------------
    //------Método Busca Binária por Idade------------------
    //------------------------------------------------------
    public int findIdade(int searchkey){
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        
        while(true){
          curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn].getIdade() == searchkey)
                return curIn;
            else if(lowerBound > upperBound)
                return nElems;
            else{
                if(a[curIn].getIdade() == searchkey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }
    //------------------------------------------------------
    //------Método Inserção Ordenada por Idade------------------
    //------------------------------------------------------
    public void insert(String nome, int idade, float altura){
        int i;
        for(i=0; i<nElems; i++)
        if(a[i].getIdade() > idade)
         break;
        for(int k=nElems; k>i; k--)
            a[k] = a[k-1];
        a[i] = new Jogador(nome,idade,altura);
        nElems++;
    }
    //------------------------------------------------------
    //------Método Remoção por Idade------------------
    //------------------------------------------------------
    public boolean delete(int value){
        int i = findIdade(value);
        if(i==nElems)
            return false;
        else{
            for(int k=i; k<nElems; k++)
                a[k] = a[k+1];
            nElems --;
            return true;
        }
    }
    //------------------------------------------------------
    //------Método Linear por Nome ------------------
    //------------------------------------------------------
      public void buscaNome(String value){
          int i;
          for(i=0; i<nElems; i++)
             if(a[i].equals(value))
              a[i].displayJogador();
      }
    //------------------------------------------------------
    //------Método Visualiza Vetor ------------------
    //------------------------------------------------------
      public void display(){
          for(int i=0; i<nElems; i++)
      a[i].displayJogador();
    }
    //--------------------------------------------------
    //------Retorna Quantidade de itens do vetor-------------
    //------------------------------------------------------
    public int size(){
        return nElems;
    }
    
}
