package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class Ventana_Proceso1 extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6;
    private JLabel label1, label2, label3, label_imagen1;
    private JTextField textfield1, textfield_Observaciones;
    private JButton boton1;
    private JComboBox combo1;

  public Ventana_Proceso1(){

   setLayout(null);
        setTitle("Autodate");
        getContentPane().setBackground(new Color(174,214,241));
        setIconImage(new ImageIcon(getClass().getResource("images/carro.png")).getImage());
            
        label_imagen1 = new JLabel();
        label_imagen1.setIcon(new ImageIcon(getClass().getResource("images/carro.png")));
        label_imagen1.setBounds(0,100,420,200);
        add(label_imagen1);
        
        label1 = new JLabel ("Que procedimientos desea realizar");
        label1.setBounds(175,60,400,100);
        add(label1);

        label2 = new JLabel ("Ingrese numero serial");
        label2.setBounds(250,120,400,100);
        add(label2);

        label3 = new JLabel ("Observaciones");
        label3.setBounds(300,190,400,100);
        add(label3);
   
        combo1 = new JComboBox();
        combo1.setBounds(400,100,150,25);
        combo1.setBackground(new java.awt.Color(200, 250, 250));
        add(combo1);
        combo1.addItem("");
        combo1.addItem("Cambio de empaques");
        combo1.addItem("Cambio liquido refrigerante");
        combo1.addItem("Cambio liquido de frenos");
        combo1.addItem("Cambio aceite de motor");
        combo1.addItem("Añadir liquido refrigerante");
        combo1.addItem("Añadir liquido de frenos");
        combo1.addItem("Añadir aceite para motor");


        textfield1 = new JTextField();
        textfield1.setBounds(400,165,150,20);
        add(textfield1);
   
        textfield_Observaciones = new JTextField();
        textfield_Observaciones.setBounds(400,230,300,100);
        add(textfield_Observaciones);

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
        
        menuitem4 = new JMenuItem("Menú principal");
        menuitem4.addActionListener(this);
        menu1.add(menuitem4);
        
        menuitem5 = new JMenuItem("Cerrar Sesión");
        menuitem5.addActionListener(this);
        menu1.add(menuitem5);
        
        menuitem6 = new JMenuItem("Salir");
        menuitem6.addActionListener(this);
        menu1.add(menuitem6);
       

        boton1 = new JButton("Ingresar procedimiento");
        boton1.setBounds(370,380,250,30);
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
       Ventana_MenuPrincipal VentanaMenuPrincipal = new Ventana_MenuPrincipal();
        VentanaMenuPrincipal.setBounds(0,0,800,500);
        VentanaMenuPrincipal.setVisible(true);
        VentanaMenuPrincipal.setResizable(false);
        VentanaMenuPrincipal.setLocationRelativeTo(null);
        this.setVisible(false); 
    }
    if(e.getSource() == menuitem5){
        Ventana_Proceso1 VentanaProceso1 = new Ventana_Proceso1();
        VentanaProceso1.setBounds(0,0,800,500);
        VentanaProceso1.setVisible(true);
        VentanaProceso1.setResizable(false);
        VentanaProceso1.setLocationRelativeTo(null);
        this.setVisible(false);
    }
    if(e.getSource() == menuitem6){
        System.exit(0);
    }
    if(e.getSource() == boton1){
        Ventana_Proceso2 VentanaProceso2 = new Ventana_Proceso2();
        VentanaProceso2.setBounds(0,0,800,500);
        VentanaProceso2.setVisible(true);
        VentanaProceso2.setResizable(false);
        VentanaProceso2.setLocationRelativeTo(null);
        this.setVisible(false);
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