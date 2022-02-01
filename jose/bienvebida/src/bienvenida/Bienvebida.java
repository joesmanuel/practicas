
package bienvenida;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
       
     private JTextField textfield;
     private JLabel label1, label2, label3, label4;
     private JButton boton1;
     
     public Bienvenida(){
         setLayout(null);
         setTitle("Bienvenido");
         getContentPane().setBackground(new Color(225,0,0));
         setIconImage(image);
    }
    
}
