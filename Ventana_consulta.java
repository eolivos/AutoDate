import javax.swing.*;
import java.awt.event.*;

public class Ventana_consulta extends JFrame implements ActionListener{

  JTextField textfield1;
  JLabel label1;
  JButton boton1;

  public Ventana_consulta(){

   setLayout(null);

   label1 = new JLabel ("Ingrese la placa del vehiculo a consultar");
   label1.setBounds(285,30,1000,100);
   add(label1);

   textfield1 = new JTextField();
   textfield1.setBounds(320,115,150,20);
   add(textfield1);

   boton1 = new JButton("Siguiente");
   boton1.setBounds(350,250,100,30);
   add(boton1);
   boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
     System.exit(0);
   }
  }

  public static void main(String args[]){
  Ventana_consulta formulario1 = new Ventana_consulta();
  formulario1.setBounds(0,0,800,500);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}