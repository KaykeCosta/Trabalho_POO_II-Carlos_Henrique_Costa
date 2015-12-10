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
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class JavaApplication12 extends JFrame implements ActionListener {

    Frame x = new Frame();
    Panel p = new Panel();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Label y = new Label("Usuario");
    Label z = new Label("Senha");
    Button b = new Button("Entrar");
    TextField tf = new TextField(12);
    TextField tf1 = new TextField(10);
           
            public void JavaApplication12(){
                this.setSize(400, 300);
		this.setLocation(100, 100);
		this.setTitle("Login do Sistema");
		this.setResizable(true);
		this.setVisible(true);
                this.setLayout(new GridLayout(3,1));
                b.addActionListener(this);
                p.add(y);
                p.add(tf1);
                p1.add(z);
                p1.add(tf);
                p2.add(b);
                this.add(p);
                this.add(p1);
                this.add(p2);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
    public static void main(String[] args) {
        JavaApplication12 e = new JavaApplication12();
        e.JavaApplication12();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(this.tf1.getText().equals("Kayke") && this.tf.getText().equals("Senha")){
        this.setVisible(false);
        Cadastro c = new Cadastro();
        c.Cadastro();
    }
    else{
        JOptionPane.showMessageDialog(null, "Login ou Senha Incorretos!");
    }
    }
    
}
