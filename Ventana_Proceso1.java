/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autodate;
import javax.swing.*;
import java.awt.event.*;

public class Ventana_Proceso1 extends JFrame implements ActionListener{

  JLabel label1, label2, label3, label4, label5, label6;
  JButton boton1;
  JTextField textfield1;

  public Ventana_Proceso1(){

   setLayout(null);

   label1 = new JLabel ("Que procedimientos desea realizar");
   label1.setBounds(120,50,1000,100);
   add(label1);

   label2 = new JLabel ("Ingrese numero serial");
   label2.setBounds(190,120,1000,100);
   add(label2);

   label3 = new JLabel ("Agregar elemento");
   label3.setBounds(215,190,1000,100);
   add(label3);

   label4 = new JLabel ("Agregar proceso adicional");
   label4.setBounds(170,260,1000,100);
   add(label4);

   textfield1 = new JTextField();
   textfield1.setBounds(400,165,150,20);
   add(textfield1);

   boton1 = new JButton("Siguiente");
   boton1.setBounds(370,380,100,30);
   add(boton1);
   boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
     System.exit(0);
   }
  }

  public static void main(String args[]){
  Ventana_Proceso1 VentanaProceso1 = new Ventana_Proceso1();
  VentanaProceso1.setBounds(0,0,800,500);
  VentanaProceso1.setVisible(true);
  VentanaProceso1.setResizable(false);
  VentanaProceso1.setLocationRelativeTo(null);
 }
}