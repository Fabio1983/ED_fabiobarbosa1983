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
        Estrutura a = new Estrutura(maxSize);
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
            a.InsertionSort(nome,cor,tamanho);
        }
        if(resposta == 1){
            JOptionPane.showMessageDialog(null, "Não deseja cadastrar mais estou certo??");
        }
        if(resposta == 2){
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
        //-------------------------
        // visualiza animais
        //--------------------------
        int visualiza = JOptionPane.showConfirmDialog(null, "Deseja visualizar animais cadastrados??");
        if(visualiza == 0){
            
        }
        if(visualiza == 1){
            JOptionPane.showMessageDialog(null, "Não deseja visualizar mais estou certo??");
        }
        if(visualiza == 2){
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
    }
}
