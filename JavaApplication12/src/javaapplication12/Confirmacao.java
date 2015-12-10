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
import javax.swing.JFrame;

/**
 *
 * @author Carlos
 */
public class Confirmacao extends JFrame {
    
    
    Frame x = new Frame();
    Panel p = new Panel();
    Panel p1 = new Panel();
    Label y = new Label("Deseja Confirma a ação?");
    Button b = new Button("SIM");
    Button b1 = new Button("NÂO");
  
public void   Confirmacao(Cadastro c){
                
               
                this.setSize(400, 300);
		this.setLocation(100, 100);
		this.setTitle("Login do Sistema");
		this.setResizable(true);
		this.setVisible(true);
                this.setLayout(new GridLayout(3,1));
                p.add(y);
                Evento k = new Evento(c,this,true);
                b.addActionListener(k);
                p1.add(b);
                Evento k1 = new Evento(this,false);
                b1.addActionListener(k1);
                p1.add(b1);
                this.add(p);
                this.add(p1);   
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



}  
    
   public static void main(String[] args) {
        Confirmacao e = new Confirmacao();
    }

}   