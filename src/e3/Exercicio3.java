/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e3;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class Exercicio3 {
    
    public static void main(String[] args){
        int maxSize = 50;
        Estrutura e = new Estrutura(maxSize);
        String nome = null;
        String cor = null;
        float tamanho = 0;
        //-----------------------------
        //cadastra animais
        //-----------------------------
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar algum animal??");
        if(resposta == 0){
            nome = JOptionPane.showInputDialog("Digite nome do Animal");
            cor = JOptionPane.showInputDialog("Digite a cor do Animal");
            tamanho = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do Animal"));
            e.Insere(nome,cor,tamanho);
        }
        if(resposta == 1){
            JOptionPane.showMessageDialog(null, "Não deseja cadastrar mais estou certo??");
        }
        if(resposta == 2){
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
        System.out.println("Animais Cadastrados");
        e.display();
        
            System.out.println("Muito bem! Vamos fazer uma busca binária por cor?");
              System.out.println("Digite o nome de uma cor que iremos imprimir o Animal: ");
              
              if (!e.buscaCor(cor))
                    System.out.println("Nenhum Animal encontrado");

              System.out.println("Vamos buscar agora por tamanho? Mas antes vou ordenar por Tamanho!");
              System.out.println("Ordenando ...");
              e.ordenaTamanho();
              System.out.println("Pronto! Digite agora o tamanho que deseja: ");
              
             if (!e.buscaTamanho(tamanho))
                    System.out.println("Nenhum Animal encontrado");
              
              System.out.println("Muito bem! Para finalizar vou imprimir todos os Animais na nova ordem");

              e.display();
        
    }
}
