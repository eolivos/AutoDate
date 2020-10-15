package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class Ventana_02 extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;
  private JTextField textfield1;
  private JLabel label1, label_imagen2;
  private JButton boton1;

  public Ventana_02(){

   setLayout(null);
        setTitle("Autodate");
        getContentPane().setBackground(new Color(174,214,241));
        setIconImage(new ImageIcon(getClass().getResource("images/carro.png")).getImage());
            
        label_imagen2 = new JLabel();
        label_imagen2.setIcon(new ImageIcon(getClass().getResource("images/carro.png")));
        label_imagen2.setBounds(0,100,420,200);
        add(label_imagen2);
   
   menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);

        menuitem1 = new JMenuItem("Blanco");
        menuitem1.addActionListener(this);
        menu1.add(menuitem1);

        menuitem2 = new JMenuItem("Azul");
        menuitem2.addActionListener(this);
        menu1.add(menuitem2);

        menuitem3 = new JMenuItem("Gris");
        menuitem3.addActionListener(this);
        menu1.add(menuitem3);
        
        menuitem4 = new JMenuItem("Volver al inicio");
        menuitem4.addActionListener(this);
        menu1.add(menuitem4);

   label1 = new JLabel ("Ingrese la placa del vehiculo a registrar");
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
  
    Container fondo = this.getContentPane();  
    if(e.getSource() == menuitem1){
    fondo.setBackground(new Color(254,254,254));
    }
    if(e.getSource() == menuitem2){
    fondo.setBackground(new Color(174,214,241));
    }
    if(e.getSource() == menuitem3){
    fondo.setBackground(new Color(214,219,223));
    }
    if(e.getSource() == menuitem4){
       Ventana_2 Ventana2 = new Ventana_2();
       Ventana2.setBounds(0,0,800,500);
       Ventana2.setVisible(true);
       Ventana2.setResizable(false);
       Ventana2.setLocationRelativeTo(null);
       this.setVisible(false);
       this.setVisible(false);
    } 
      
    if(e.getSource() == boton1){
    Ventana_1 Ventana1 = new Ventana_1();
    Ventana1.setBounds(0,0,800,500);
    Ventana1.setVisible(true);
    Ventana1.setResizable(false);
    Ventana1.setLocationRelativeTo(null);
    this.setVisible(false);
   }
  }


  public static void main(String args[]){
  Ventana_02 Ventana02 = new Ventana_02();
  Ventana02.setBounds(0,0,800,500);
  Ventana02.setVisible(true);
  Ventana02.setResizable(false);
  Ventana02.setLocationRelativeTo(null);
 }
}