/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Evento implements ActionListener {
    Cadastro c;
    Confirmacao co;
    boolean res;
    
    Evento( Cadastro c, Confirmacao co, boolean res){
        this.c = c;
        this.co = co;
        this.res = res;
    }
    Evento( Confirmacao co, boolean res){
        this.co = co;
        this.res = res;
    }

    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(res == true){
            this.co.setVisible(false);
            this.c.setVisible(false);
            JOptionPane.showMessageDialog(null, this.c.tf.getText() +"\n" +
                                            this.c.c.getSelectedItem() +"\n" +
                                             this.c.l.getSelectedItem() +"\n" + 
                                              this.c.ta.getText());
        }
        if(res == false){
            this.co.setVisible(false);
        }
        
    }
    
    
}
