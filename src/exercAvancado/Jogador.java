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
public class Jogador {
    private String nome;
    private int idade;
    private float altura;
    
    public Jogador(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void displayJogador(){
        System.out.print(" nome: " + nome);
        System.out.print(" idade " + idade);
        System.out.println(" altura " + altura);
    }
    public int getIdade(){
        return idade;
    }
    public String getNome(){
        return nome;
    }
}
