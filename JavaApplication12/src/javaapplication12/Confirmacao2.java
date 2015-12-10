/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication12;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author Carlos
 */
public class Confirmacao2 {
    
   
    
   Frame x = new Frame();
    Panel p = new Panel();
    Label y = new Label("ERRO NA DIGITAÇÃO DA SENHA OU USUARIO");
    
  
   Confirmacao2(){
                x.setSize(400, 300);
		x.setLocation(100, 100);
		x.setTitle("Login do Sistema");
		x.setResizable(true);
		x.setVisible(true);
                x.setLayout(new GridLayout(1,1));
                p.add(y);
                x.add(p);
                             



}  
    
   public static void main(String[] args) {
        Confirmacao2 e = new Confirmacao2();
        
    }
  }


    

