/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e6;

/**
 *
 * @author Aluno
 */
public class Paciente {
    private String nome;
    private String prioridade;
    private Paciente p[] = new Paciente[100];
    int nItems;
    
    public Paciente(String nome, String prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
        nItems = 0;
    }
   
    public void Cadastro(String nome, String prioridade){
        int i;
        if(prioridade.equalsIgnoreCase("Alta")){
            if(nItems==0){
                p[nItems++] = new Paciente(nome, prioridade);
            }
           
            
        }
    }
    
    
    
}
