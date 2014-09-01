/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] pessoas = new String[50];
       int nElems,i;
       String qtd = null;
            
       qtd = JOptionPane.showInputDialog("Digite quantidade de pessoas: ");
       nElems = Integer.parseInt(qtd);
       
       //---------------------------------------------
       //-----------Insere----------------------------
       //---------------------------------------------
       
       for(i=0;i<nElems;i++){
       pessoas[i] = JOptionPane.showInputDialog("Digite nome, idade, profissao de pessoa [" + i + "]: ");
       }
       
       //---------------------------------------------
       //-----------Exibe----------------------------
       //---------------------------------------------
       
       for(i=0;i<nElems;i++)
        System.out.println(pessoas[i]);
       
       
       
       
    
    }
}
