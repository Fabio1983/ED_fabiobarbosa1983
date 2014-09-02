/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercAvancado;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Usuario {
    public static void main(String[] args){
        int maxSize = 100;
        Estrutura arr = new Estrutura(maxSize);
        Scanner entrada = new Scanner(System.in);
        Scanner entradaint = new Scanner(System.in);
        Scanner entradaint2 = new Scanner(System.in);
        Scanner entradafloat = new Scanner(System.in);
        System.out.println("Bem vindo ao Programa de Vetores!!!!");
        
        System.out.println("Digite quantos jogadores ");
        int qnt = entradaint2.nextInt();
        for(int i=1; i < qnt; i++){
            System.out.println("Digite o nome " + i);
            String nome = entrada.nextLine();
            System.out.println("Digite a idade de " + nome);
            int idade = entradaint.nextInt();
            System.out.println("Digite a altura de " + nome);
            float altura = entradafloat.nextFloat();
            arr.insert(nome, idade, altura); 
        }
        
        int posicao = arr.findIdade(entrada.nextInt());
        if(posicao != arr.size())
            System.out.println("Encontrei na posicao " + posicao);
        else
            System.out.println("Não encontrei");
        
        System.out.println("Digite um nome para remover!!");
        if(arr.delete(entrada.nextInt()))
            System.out.println("Removido");
        else
            System.out.println("Não encontrei");
        
        arr.display();
        
    }
}
