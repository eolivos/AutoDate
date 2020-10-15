import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener{

  JLabel label1, label2, label3, label4, label5, label6;
  JButton boton1;

  public Ventana(){

   setLayout(null);

   label1 = new JLabel ("El vehiculo de placas EJEMPLO esta en estado optimo");
   label1.setBounds(270,50,1000,100);
   add(label1);

   label2 = new JLabel ("Se recomienda realizar PROCEDIMIENTOS en el vehiculo de placas");
   label2.setBounds(220,100,1000,100);
   add(label2);

   label3 = new JLabel ("EJEMPLO antes de la FECHA");
   label3.setBounds(320,120,1000,100);
   add(label3);

   label4 = new JLabel ("Puede contactar al usuario por medio del siguiente dato CONTACTO");
   label4.setBounds(220,140,1000,100);
   add(label4);

   label5 = new JLabel ("El vehiculo de placas PLACA debe realizar PROCEDIMIENTO");
   label5.setBounds(240,200,1000,100);
   add(label5);

   label6 = new JLabel ("Puede contactar al ususario por medio del suiguiente dato CONTACTO");
   label6.setBounds(220,220,1000,100);
   add(label6);

   boton1 = new JButton("Siguiente");
   boton1.setBounds(370,300,100,30);
   add(boton1);
   boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
     System.exit(0);
   }
  }

  public static void main(String args[]){
  Ventana formulario1 = new Ventana();
  formulario1.setBounds(0,0,800,500);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}