package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class Ventana_Registro3 extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6;
  private JLabel label1, label_imagen2;
  private JButton boton1;

  public Ventana_Registro3(){

   setLayout(null);
        setTitle("Autodate");
        getContentPane().setBackground(new Color(174,214,241));
        setIconImage(new ImageIcon(getClass().getResource("images/carro.png")).getImage());
            
        label_imagen2 = new JLabel();
        label_imagen2.setIcon(new ImageIcon(getClass().getResource("images/logo.png")));
        label_imagen2.setBounds(150,0,420,200);
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
        
        menuitem4 = new JMenuItem("Menú principal");
        menuitem4.addActionListener(this);
        menu1.add(menuitem4);
        
        menuitem5 = new JMenuItem("Cerrar Sesión");
        menuitem5.addActionListener(this);
        menu1.add(menuitem5);
        
        menuitem6 = new JMenuItem("Salir");
        menuitem6.addActionListener(this);
        menu1.add(menuitem6);

        label1 = new JLabel ("¡Felicidades! El vehiculo y sus datos se han registrado con exito en nuestra plataforma.");
        label1.setBounds(140,200,1000,100);
        add(label1);

        boton1 = new JButton("Volver al menú principal");
        boton1.setBounds(250,300,300,30);
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
        Ventana_MenuPrincipal VentanaMenuPrincipal = new Ventana_MenuPrincipal();
        VentanaMenuPrincipal.setBounds(0,0,800,500);
        VentanaMenuPrincipal.setVisible(true);
        VentanaMenuPrincipal.setResizable(false);
        VentanaMenuPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
   }
  }


  public static void main(String args[]){
  Ventana_Registro3 VentanaRegistro3 = new Ventana_Registro3();
  VentanaRegistro3.setBounds(0,0,800,500);
  VentanaRegistro3.setVisible(true);
  VentanaRegistro3.setResizable(false);
  VentanaRegistro3.setLocationRelativeTo(null);
 }
}