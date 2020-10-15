package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class Ventana_Consulta2 extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6;
    private JLabel label1, label2, label3, label4, label5, label6, label_imagen1;
    private JButton boton1, boton2;

  public Ventana_Consulta2(){

   setLayout(null);
        setTitle("Autodate");
        getContentPane().setBackground(new Color(174,214,241));
        setIconImage(new ImageIcon(getClass().getResource("images/carro.png")).getImage());
            
        label_imagen1 = new JLabel();
        label_imagen1.setIcon(new ImageIcon(getClass().getResource("images/carro.png")));
        label_imagen1.setBounds(0,100,420,200);
        add(label_imagen1);

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
   label5.setBounds(220,200,1000,100);
   add(label5);

   label6 = new JLabel ("Puede contactar al ususario por medio del suiguiente dato CONTACTO");
   label6.setBounds(220,220,1000,100);
   add(label6);

   boton1 = new JButton("Consultar otro vehiculo");
   boton1.setBounds(100,350,250,30);
   add(boton1);
   boton1.addActionListener(this);
   
   boton2 = new JButton("Volver al menu principal");
   boton2.setBounds(400,350,250,30);
   add(boton2);
   boton2.addActionListener(this);
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
        Ventana_Usuario VentanaUsuario = new Ventana_Usuario();
        VentanaUsuario.setBounds(0,0,800,500);
        VentanaUsuario.setVisible(true);
        VentanaUsuario.setResizable(false);
        VentanaUsuario.setLocationRelativeTo(null);
        this.setVisible(false);
    }
    if(e.getSource() == menuitem6){
        System.exit(0);
    }
    if(e.getSource() == boton1){
        Ventana_Consulta1 VentanaConsulta1 = new Ventana_Consulta1();
        VentanaConsulta1.setBounds(0,0,800,500);
        VentanaConsulta1.setVisible(true);
        VentanaConsulta1.setResizable(false);
        VentanaConsulta1.setLocationRelativeTo(null);
        this.setVisible(false);
    }
     if(e.getSource() == boton2){
        Ventana_MenuPrincipal VentanaMenuPrincipal = new Ventana_MenuPrincipal();
        VentanaMenuPrincipal.setBounds(0,0,800,500);
        VentanaMenuPrincipal.setVisible(true);
        VentanaMenuPrincipal.setResizable(false);
        VentanaMenuPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
   }
  }
 

    public static void main(String args[]){
    Ventana_Consulta2 VentanaConsulta2 = new Ventana_Consulta2();
    VentanaConsulta2.setBounds(0,0,800,500);
    VentanaConsulta2.setVisible(true);
    VentanaConsulta2.setResizable(false);
    VentanaConsulta2.setLocationRelativeTo(null);
 }
}