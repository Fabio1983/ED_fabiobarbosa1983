/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e2;

/**
 *
 * @author Fabio
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;
    
    public Pessoa(String nome,int idade,String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
    
	public void displayPessoa()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Profissao: " + profissao);
      System.out.println(", Idade: " + idade);
      }
	
	public String getNome()
      { return nome; }
    
    
}
