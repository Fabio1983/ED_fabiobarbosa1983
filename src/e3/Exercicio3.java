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
        double tamanho = 0;
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
        JOptionPane.showMessageDialog(null, "Animais Cadastrados");
        e.display();
        
            JOptionPane.showMessageDialog(null, "Muito bem! Vamos fazer uma busca binária por cor?");
            JOptionPane.showMessageDialog(null, "Digite o nome de uma cor que iremos imprimir o Animal: ");
              
              if (!e.buscaCor(cor))
                    JOptionPane.showMessageDialog(null, "Nenhum Animal encontrado");

              JOptionPane.showMessageDialog(null, "Vamos buscar agora por tamanho? Mas antes vou ordenar por Tamanho!");
             JOptionPane.showMessageDialog(null, "Ordenando ...");
              e.ordenaTamanho();
              JOptionPane.showMessageDialog(null, "Pronto! Digite agora o tamanho que deseja: ");
              
             if (!e.buscaTamanho(tamanho))
                    JOptionPane.showMessageDialog(null, "Nenhum Animal encontrado");
              
              JOptionPane.showMessageDialog(null, "Muito bem! Para finalizar vou imprimir todos os Animais na nova ordem");

              e.display();
        
    }
}
