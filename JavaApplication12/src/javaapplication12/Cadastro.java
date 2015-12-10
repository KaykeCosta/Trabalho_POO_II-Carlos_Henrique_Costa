/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication12;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Carlos
 */
public class Cadastro extends JFrame implements ActionListener {
    Frame x = new Frame();
    Panel p = new Panel();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();
    Panel p4 = new Panel();
    Panel p5 = new Panel();
    Label y = new Label("Nome;");
    Label y1 = new Label("Materia");
    Label z = new Label("Sexo");
    Label z1 = new Label("Comentarios");
    Button b = new Button("Cadastrar");
    TextField tf = new TextField(10);
    TextField tf1 = new TextField();
    TextArea ta = new TextArea(3, 10);
    Choice c;
    List l;
    
    public void Cadastro(){
                this.setSize(400, 600);
		this.setLocation(100, 100);
		this.setTitle("Cadastro");
		this.setResizable(true);
		this.setVisible(true);
                this.setLayout(new GridLayout(6,1));
                b.addActionListener(this);
                c = new Choice();
                c.addItem("Masculino");
                c.addItem("Feminino");
                l = new List(5,false);
                l.add("Logica");
                l.add("Algoritimo");
                l.add("POO");
                l.add("Estrutura");
                l.add("IHC");
                                       
                p.add(y);
                p.add(tf);
                p1.add(z);
                p1.add(c);
                p2.add(y1);
                p2.add(l);
                p3.add(b);
                p4.add(z1);
                p4.add(ta);
                this.add(p);
                this.add(p1);
                this.add(p2);
                this.add(p4);
                this.add(p3);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Cadastro e = new Cadastro();
        e.Cadastro();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     Confirmacao c1 = new Confirmacao();        
     c1.Confirmacao(this);
    }
    
}
