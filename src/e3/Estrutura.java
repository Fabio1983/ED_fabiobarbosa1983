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
    private long[] an;
    
    public Estrutura(int max){
        an = new long[50];
        a = new Animais[max];
        nElems = 0;        
    }
    
    //--------------------------------------------------
    //------- Inserção ordenada
    //--------------------------------------------------
    public void InsertionSort(String nome,String cor,float tamanho){
        int in, out;
        
        for(out=1;out<nElems;out++){
         long temp = an[out];   
         in = out;
         while(in>0 && an[in-1] >= temp){
         an[in] = an[in-1];
         in--;
         }
         an[in] = temp;
        }
    }
    //--------------------------------------------------
    //------- Busca Binária por Cor
    //--------------------------------------------------
    public String findCor(String searchkey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        
        while(true){
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn].getCor().equalsIgnoreCase(searchkey))
                return String.valueOf(curIn);
            else if(lowerBound > upperBound)
                return String.valueOf(nElems);
            else
                if(a[curIn].getCor().equalsIgnoreCase(searchkey))
                    lowerBound = curIn + 1;
            else
                    upperBound = curIn - 1;
        }       
    }
    
    //--------------------------------------------------
    //------- Busca Binária por Tamanho
    //--------------------------------------------------
    public String findTamanho(float searchkey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        
        while(true){
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn].getTamanho() == searchkey)
                return String.valueOf(curIn);
            else if(lowerBound > upperBound)
                return String.valueOf(nElems);
            else
                if(a[curIn].getTamanho() == searchkey)
                    lowerBound = curIn + 1;
            else
                    upperBound = curIn - 1;
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
