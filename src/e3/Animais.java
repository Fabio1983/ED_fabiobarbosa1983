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
public class Animais {
    private String nome;
    private String cor;
    private float tamanho;
    
    
    public Animais(String nome,String cor,float tamanho){
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    public String getCor(){
        return cor;
    }
    
    public float getTamanho(){
        return tamanho;
    }
        
    public void displayAnimais(){
        System.out.println(" nome: " + nome);
        System.out.println(" cor: " + cor);
        System.out.println(" tamanho: " + tamanho);
    }
}
