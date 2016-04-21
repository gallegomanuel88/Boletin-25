
package boletin25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author galle
 */
public class Ejercicio4 implements ActionListener{
    
    JFrame ventana;
    JFrame ventana2;
    JButton bot1;
    JButton bot2;
    
    public void ventana (){
        
        ventana = new JFrame ("Boletin 25");
        ventana.setSize(300, 150);
        
        ventana.setLocation(300, 100);
        ventana.setLayout(null);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel etiqueta = new JLabel();
        etiqueta.setLocation(110,20);
        etiqueta.setSize(100, 20);
        etiqueta.setText("Ventana 1");
        ventana.add(etiqueta);
        
        bot1 = new JButton("Pulsar");
        bot1.setLocation(95, 60);
        bot1.setSize(85, 20);
        bot1.addActionListener(this);
        ventana.add(bot1);
        
        ventana.setVisible(true);
    }
    
    public void ventana2 (){
        
        ventana2 = new JFrame ("Boletin 25");
        ventana2.setSize(300, 150);
        
        ventana2.setLocation(300, 100);
        ventana2.setLayout(null);
        ventana2.setResizable(true);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel etiqueta = new JLabel();
        etiqueta.setLocation(110,20);
        etiqueta.setSize(100, 20);
        etiqueta.setText("Ventana 2");
        ventana2.add(etiqueta);
        
        bot2 = new JButton("Pulsar");
        bot2.setLocation(95, 60);
        bot2.setSize(85, 20);
        bot2.addActionListener(this);
        ventana2.add(bot2);
        
        ventana2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object aux = ae.getSource();
        if (aux==bot1){
        ventana2();
        ventana.setVisible(false);
        }
        else if(aux==bot2) {
        ventana();
        ventana2.setVisible(false);
        }
        
    }
}
